package com.nolimits.bean;

public class Work {
    private Integer workId;
    private String type;
    private Integer userId;
    private String title;
    private String content;
    private String date;
    private String approveList;
    private String worksTimeStamp;

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setApproveList(String approveList) {
        this.approveList = approveList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public void setWorksTimeStamp(String worksTimeStamp) {
        this.worksTimeStamp = worksTimeStamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public Integer getWorkId() {
        return workId;
    }

    public String getApproveList() {
        return approveList;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getWorksTimeStamp() {
        return worksTimeStamp;
    }
}
