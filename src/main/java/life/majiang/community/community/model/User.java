package life.majiang.community.community.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
    private String sex;
    private String tel;
    private String email;
    private String education;
    private Integer age;
    private String school;
    private String city;
}
