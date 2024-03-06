package kr.co.ch04.dto;

public class User4DTO {

    private String uid;
    private String name;
    private String gender;
    private int age;
    private String hp;
    private String addr;

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User4DTO{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hp='" + hp + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
