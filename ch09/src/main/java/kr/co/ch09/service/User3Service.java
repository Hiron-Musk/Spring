package kr.co.ch09.service;

import kr.co.ch09.dto.User3DTO;
import kr.co.ch09.entity.User3;
import kr.co.ch09.repository.User3Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class User3Service {

    private final User3Repository repository;

    public void insertUser3(User3DTO user3DTO){
        User3 user3=user3DTO.toEntity();
        repository.save(user3);
    }
    public User3DTO selectUser3(String uid){
        User3 user3=repository.findById(uid).get();

        return user3.toDTO();

    }
    public List<User3DTO> selectUser3s(){

        return repository.findAll().stream()
                .map(entity->User3DTO.builder()
                        .uid(entity.getUid())
                        .name(entity.getName())
                        .hp(entity.getHp())
                        .birth(entity.getBirth())
                        .addr(entity.getAddr())
                        .build())
                .collect(Collectors.toList());
    }
    public User3DTO updateUser3(User3DTO user3DTO){

        User3 user3=user3DTO.toEntity();
        repository.save(user3);

        Optional<User3>result=repository.findById(user3DTO.getUid());
        return result.get().toDTO();

    }
    public ResponseEntity deleteUser3(String uid){
        Optional<User3>optUser3=repository.findById(uid);

        if(optUser3.isPresent()){
            repository.deleteById(uid);
            return ResponseEntity.ok().body(optUser3.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user no found");
        }

    }
}
