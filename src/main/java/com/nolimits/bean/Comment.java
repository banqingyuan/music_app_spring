package com.nolimits.bean;


import java.sql.Timestamp;

public class Comment {
    private Integer commentId;
    private Integer userId;
    private Integer worksId;
    private String Date;
    private String Content;
    private Timestamp timestamp;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public Integer getWorksId() {
        return worksId;
    }

    public String getContent() {
        return Content;
    }

    public String getDate() {
        return Date;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
