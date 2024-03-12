package kr.co.ch07.entity;

import jakarta.persistence.*;
import kr.co.ch07.dto.User5DTO;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "user5")
public class User5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    private String name;
    private String gender;
    private int age;
    private String addr;

    public User5DTO toDTO(){
        return User5DTO.builder()
                .name(name)
                .gender(gender)
                .age(age)
                .addr(addr)
                .build();
    }

}
