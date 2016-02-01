package com.wonders.xlab.myproj.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by wangqiang on 16/1/29.
 */
@Entity
@Table(name = "sec_user")
@JsonIgnoreProperties("new")
public class User extends AbstractPersistable<Long> {

    @NotNull
    private String username;

    @NotNull
    @Column(unique = true)
    private String loginName;

    @Size(min = 4, max = 8)
    private String password;

    @Min(0)
    @Max(100)
    private int age;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
