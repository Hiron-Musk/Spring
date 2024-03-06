package kr.co.ch04.dto;

public class User3DTO {
    private String uid;
    private String name;
    private String birth;
    private String hp;
    private String addr;

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getHp() {
        return hp;
    }

    public String getAddr() {
        return addr;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User3DTO{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", hp='" + hp + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
