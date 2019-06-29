package com.linqxxy.git;

import java.time.LocalDateTime;

public class MemoInfo {
    private Integer id;
    private Integer groupId;
    private String title;
    private String content;
    private String isProtected;
    private Color backGround;
    private String isRemind;
    private LocalDateTime remindTime;
    private LocalDateTime createdTime;
    private LocalDateTime modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(String isProtected) {
        this.isProtected = isProtected;
    }

    public Color getBackGround() {
        return backGround;
    }

    public void setBackGround(Color backGround) {
        this.backGround = backGround;
    }

    public String getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(String isRemind) {
        this.isRemind = isRemind;
    }

    public LocalDateTime getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(LocalDateTime remindTime) {
        this.remindTime = remindTime;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "MemoInfo{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isProtected='" + isProtected + '\'' +
                ", backGround=" + backGround +
                ", isRemind='" + isRemind + '\'' +
                ", remindTime=" + remindTime +
                ", createdTime=" + createdTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
enum Color{
    WHITE,BLUE,RED,GREEN;
}