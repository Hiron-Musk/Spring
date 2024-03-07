package kr.co.user.dto;

public class User2DTO {
    private String id;
    private String name;
    private String hp;
    private String age;

    @Override
    public String toString() {
        return "User1DTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHp() {
        return hp;
    }

    public String getAge() {
        return age;
    }
}
