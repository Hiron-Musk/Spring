package kr.co.ch06.controller;

import kr.co.ch06.dto.User0DTO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Controller
public class MainController {

    @GetMapping(value = {"/", "/index"})
    public String index(Model model){
        log.debug("index()...");

        String str1="Hello World!";
        String str2="Hello Spring Boot";

        //생성자 초기화
        User0DTO user0=new User0DTO("A101","김유신",23,"김해");

        //Setter 초기화
        User0DTO user1=new User0DTO();
        user1.setUid("A102");
        user1.setName("김춘추");
        user1.setAge(21);
        user1.setAddr("경주");

        //Builder 패턴 초기화<가장 많이 사용>
        User0DTO user2=User0DTO.builder()
                                .uid("A103")
                                .name("장보고")
                                .age(33)
                                .addr("완도")
                                .build();
        User0DTO user3=null;

        //리스트 생성
        List<User0DTO> users=new ArrayList<>();
        users.add(user0);
        users.add(user1);
        users.add(user2);






        model.addAttribute("str1",str1);
        model.addAttribute("str2",str2);
        model.addAttribute("user0",user0);
        model.addAttribute("user1",user1);
        model.addAttribute("user2",user2);
        model.addAttribute("user3",user2);
        model.addAttribute("users",users);



        return "/index";
    }
    @GetMapping("/sub2/content1")
    public String content1(){
        return "/sub2/content1";
    }

    @GetMapping("/sub2/content2")
    public String content2(){
        return "/sub2/content2";
    }



}
