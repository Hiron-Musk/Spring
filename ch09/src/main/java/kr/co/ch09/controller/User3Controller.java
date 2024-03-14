package kr.co.ch09.controller;

import kr.co.ch09.dto.User3DTO;
import kr.co.ch09.service.User3Service;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class User3Controller {

    private final User3Service service;

    @GetMapping("/user3")
    public List<User3DTO> list(){
        List<User3DTO>user3DTOS=service.selectUser3s();
        return user3DTOS;
    }
    @GetMapping("/user3/{uid}")
    public User3DTO user3(@PathVariable("uid")String uid){
        User3DTO user3DTO=service.selectUser3(uid);

        return user3DTO;

    }
    @PostMapping("/user3")
    public ResponseEntity<User3DTO> register(User3DTO user3DTO){
        service.insertUser3(user3DTO);

        return ResponseEntity.ok().body(user3DTO);
    }

    @PutMapping("/user3")
    public ResponseEntity<User3DTO> modify(User3DTO user3DTO){
        service.updateUser3(user3DTO);
        return ResponseEntity.ok().body(user3DTO);


    }

    @DeleteMapping("/user3/{uid}")
    public void delete(@PathVariable("uid")String uid){
        service.deleteUser3(uid);

    }


}
