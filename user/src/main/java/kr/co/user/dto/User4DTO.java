package kr.co.user.dto;

public class User4DTO {
    private String name;
    private String gender;
    private int age;
    private String addr;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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

    public String getAddr() {
        return addr;
    }

    @Override
    public String toString() {
        return "User4DTO{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
