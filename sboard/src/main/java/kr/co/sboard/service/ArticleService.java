package kr.co.sboard.service;

import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.entity.Article;
import kr.co.sboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository repository;

    //RootConfig Bean 생성/등록
    private final ModelMapper modelMapper;

    public void insertArticle(ArticleDTO articleDTO){

        Article article=modelMapper.map(articleDTO,Article.class);
        repository.save(article);

    }

    public List<ArticleDTO> selectArticles(){
        List<Article> articles=repository.findAll();

        List<ArticleDTO>articleDTOS=articles.stream()
                .map(entity -> ArticleDTO.builder()
                        .no(entity.getNo())
                        .title(entity.getTitle())
                        .writer(entity.getWriter())
                        .hit(entity.getHit())
                        .rdate(entity.getRdate())
                        .build())
                .collect(Collectors.toList());

        return articleDTOS;

    }
}
