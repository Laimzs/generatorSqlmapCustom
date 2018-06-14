package cn.edu.nju.software.entity;

import java.util.Date;

public class RecordReport {
    private Integer id;

    private Integer userId;

    private String recordAnalysis;

    private String recordInfo;

    private String recordLikeKind;

    private String recordMostWork;

    private String recordLack;

    private String reportSummary;

    private Date createTime;

    private Date updateTime;

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

    public String getRecordAnalysis() {
        return recordAnalysis;
    }

    public void setRecordAnalysis(String recordAnalysis) {
        this.recordAnalysis = recordAnalysis == null ? null : recordAnalysis.trim();
    }

    public String getRecordInfo() {
        return recordInfo;
    }

    public void setRecordInfo(String recordInfo) {
        this.recordInfo = recordInfo == null ? null : recordInfo.trim();
    }

    public String getRecordLikeKind() {
        return recordLikeKind;
    }

    public void setRecordLikeKind(String recordLikeKind) {
        this.recordLikeKind = recordLikeKind == null ? null : recordLikeKind.trim();
    }

    public String getRecordMostWork() {
        return recordMostWork;
    }

    public void setRecordMostWork(String recordMostWork) {
        this.recordMostWork = recordMostWork == null ? null : recordMostWork.trim();
    }

    public String getRecordLack() {
        return recordLack;
    }

    public void setRecordLack(String recordLack) {
        this.recordLack = recordLack == null ? null : recordLack.trim();
    }

    public String getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary == null ? null : reportSummary.trim();
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

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}