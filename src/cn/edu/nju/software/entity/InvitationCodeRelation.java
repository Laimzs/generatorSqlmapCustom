package cn.edu.nju.software.entity;

import java.util.Date;

public class InvitationCodeRelation {
    private Integer id;

    private Integer userId;

    private String invitationCode;

    private String inputInvitationCode;

    private Date createTime;

    private Date updateTime;

    private Date invitationGenerateTime;

    private Date inputInvitationTime;

    private Integer valid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public String getInputInvitationCode() {
        return inputInvitationCode;
    }

    public void setInputInvitationCode(String inputInvitationCode) {
        this.inputInvitationCode = inputInvitationCode == null ? null : inputInvitationCode.trim();
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

    public Date getInvitationGenerateTime() {
        return invitationGenerateTime;
    }

    public void setInvitationGenerateTime(Date invitationGenerateTime) {
        this.invitationGenerateTime = invitationGenerateTime;
    }

    public Date getInputInvitationTime() {
        return inputInvitationTime;
    }

    public void setInputInvitationTime(Date inputInvitationTime) {
        this.inputInvitationTime = inputInvitationTime;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}