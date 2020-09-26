package com.spring.microServices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description = "Details about the user.")
public class User {

    private Integer id;

    @Size(min=2, message = "Name should have at least two characters")
    @ApiModelProperty(notes= "Name should have at least two characters")
    private String  name;

    @Past
    @ApiModelProperty(notes="Birth date should be in the past")
    private Date birthday;

    protected User() {

    }

    public User(Integer id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
