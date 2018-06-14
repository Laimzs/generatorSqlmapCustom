package cn.edu.nju.software.entity;

import java.util.Date;

public class Destination {
    private Integer id;

    private String content;

    private Integer destinationType;

    private Date createTime;

    private Date updateTime;

    private String description;

    private String extraField;

    private String iosContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(Integer destinationType) {
        this.destinationType = destinationType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getExtraField() {
        return extraField;
    }

    public void setExtraField(String extraField) {
        this.extraField = extraField == null ? null : extraField.trim();
    }

    public String getIosContent() {
        return iosContent;
    }

    public void setIosContent(String iosContent) {
        this.iosContent = iosContent == null ? null : iosContent.trim();
    }
}