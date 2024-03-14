package kr.co.ch09.dto;

import kr.co.ch09.entity.User3;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User3DTO {
    private String uid;
    private String name;
    private String hp;
    private String birth;
    private String addr;

    public User3 toEntity(){
        return User3.builder()
                .uid(uid)
                .name(name)
                .hp(hp)
                .birth(birth)
                .addr(addr)
                .build();
    }


}
