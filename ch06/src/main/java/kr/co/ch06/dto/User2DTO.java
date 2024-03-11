package kr.co.ch06.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User2DTO {
    private String uid;
    private String name;
    private String birth;
    private String addr;
}
