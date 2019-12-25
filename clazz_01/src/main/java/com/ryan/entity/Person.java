package com.ryan.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;

// 使用Component注解后，controller层才能使用 @Autowired
@Component
// 从配置文件中自动读取前缀是"person"的配置进行自动设置属性
@ConfigurationProperties("person")
// 开启JSR303数据校验，和下面的@Email配合使用
@Validated
public class Person {

    // 直接用@Value设置属性值，此方式优先级没有@ConfigurationProperties("person")高
    @Value("Ryan")
    private String name;

    // @Value中的值还支持表达式，这是@ConfigurationProperties所不具备的
    @Value("#{1+2}")
    private int age;

    // @Value 指定配置文件中的key进行值注入
    @Value("${sex}")
    private String sex;

    // 在类上加入@Validated后，@Email就可以自动校验是否符合Email格式
//    @Email
    private String email;

    private List<String> likes;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", likes=" + likes +
                '}';
    }

    public Person(String sex, String email, List<String> likes) {
        this.sex = sex;
        this.email = email;
        this.likes = likes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }
}
