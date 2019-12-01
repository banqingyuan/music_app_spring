package com.nolimits.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String passWord;
    private String sex;
    private Integer age;
    private String sign;
    private String iconUrl;
    private String birthday;
    private String location;
    private String tag;
    private String verify;
    private String watch;
    private String beWatched;
    private String collectList;
    private Timestamp userTimeStamp;
    private String workList;
    public User() {
        super();
    }


    public User(String userName, String passWord) {
        super();
        this.passWord = passWord;
        this.userName = userName;
    }

    public void setWorkList(String workList) {
        this.workList = workList;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBeWatched(String beWatched) {
        this.beWatched = beWatched;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserTimeStamp(Timestamp userTimeStamp) {
        this.userTimeStamp = userTimeStamp;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public void setWatch(String watch) {
        this.watch = watch;
    }

    public String getSex() {
        return sex;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Timestamp getUserTimeStamp() {
        return userTimeStamp;
    }

    public Integer getAge() {
        return age;
    }

    public String getBeWatched() {
        return beWatched;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCollectList() {
        return collectList;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getWorkList() {
        return workList;
    }

    public String getLocation() {
        return location;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getSign() {
        return sign;
    }

    public String getTag() {
        return tag;
    }

    public String getVerify() {
        return verify;
    }

    public String getWatch() {
        return watch;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "userName " + this.userName + ", pasword " + this.passWord + "sex ";
    }

}
