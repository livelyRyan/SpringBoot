package com.ryan.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

// 使用Component注解后，controller层才能使用 @Autowired
@Component
// 从配置文件中自动读取前缀是"person"的配置进行自动设置属性
@ConfigurationProperties("person")
public class Person {

    private String name;
    private int age;
    private List<String> likes;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likes=" + likes +
                '}';
    }

    public Person(String name, int age, List<String> likes) {
        this.name = name;
        this.age = age;
        this.likes = likes;
    }

    public Person() {
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
