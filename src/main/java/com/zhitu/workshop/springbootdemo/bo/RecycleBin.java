package com.zhitu.workshop.springbootdemo.bo;

import java.util.Date;

public class RecycleBin {
    private Long fileId;
    private Long userId;
    private Date deleteTime;
    private Date initialTime;
    private String address;
    private String object;
    private Long recentId;

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Long getRecentId() {
        return recentId;
    }

    public void setRecentId(Long recentId) {
        this.recentId = recentId;
    }
}
