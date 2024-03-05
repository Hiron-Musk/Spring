package kr.co.ch04.dto;

public class User2DTO {
    private String uid;
    private String name;
    private String birth;
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

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User2Service{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
