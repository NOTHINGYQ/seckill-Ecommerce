package com.example.service.model;

//必须用这个包中的notblank，用javax.validation.constraints.NotBlank这个包的会异常
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import javax.validation.constraints.NotNull;

public class UserModel {
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotNull(message = "性别不能为空")
    private Integer gender;

    @NotNull(message = "年龄不能为空")
    @Min(value = 0,message = "年龄必须大于0")
    @Max(value = 150,message = "年龄必须小于150")
    private Integer age;

    @NotBlank(message = "手机号不能为空")
    private String telphone;
    private String registerMode;
    private String thirdPartyId;

    @NotBlank(message = "密码不能为空")
    private String encrptPassword;

    public String getEncrptPassword() {
        return encrptPassword;
    }

    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }



    public String getTelphone() {
        return telphone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegisterMode() {
        return registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
    }

    public String getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }


}
