package cn.edu.nju.software.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisIsNull() {
            addCriterion("record_analysis is null");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisIsNotNull() {
            addCriterion("record_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisEqualTo(String value) {
            addCriterion("record_analysis =", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisNotEqualTo(String value) {
            addCriterion("record_analysis <>", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisGreaterThan(String value) {
            addCriterion("record_analysis >", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("record_analysis >=", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisLessThan(String value) {
            addCriterion("record_analysis <", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisLessThanOrEqualTo(String value) {
            addCriterion("record_analysis <=", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisLike(String value) {
            addCriterion("record_analysis like", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisNotLike(String value) {
            addCriterion("record_analysis not like", value, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisIn(List<String> values) {
            addCriterion("record_analysis in", values, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisNotIn(List<String> values) {
            addCriterion("record_analysis not in", values, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisBetween(String value1, String value2) {
            addCriterion("record_analysis between", value1, value2, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordAnalysisNotBetween(String value1, String value2) {
            addCriterion("record_analysis not between", value1, value2, "recordAnalysis");
            return (Criteria) this;
        }

        public Criteria andRecordInfoIsNull() {
            addCriterion("record_info is null");
            return (Criteria) this;
        }

        public Criteria andRecordInfoIsNotNull() {
            addCriterion("record_info is not null");
            return (Criteria) this;
        }

        public Criteria andRecordInfoEqualTo(String value) {
            addCriterion("record_info =", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotEqualTo(String value) {
            addCriterion("record_info <>", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoGreaterThan(String value) {
            addCriterion("record_info >", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoGreaterThanOrEqualTo(String value) {
            addCriterion("record_info >=", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoLessThan(String value) {
            addCriterion("record_info <", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoLessThanOrEqualTo(String value) {
            addCriterion("record_info <=", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoLike(String value) {
            addCriterion("record_info like", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotLike(String value) {
            addCriterion("record_info not like", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoIn(List<String> values) {
            addCriterion("record_info in", values, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotIn(List<String> values) {
            addCriterion("record_info not in", values, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoBetween(String value1, String value2) {
            addCriterion("record_info between", value1, value2, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotBetween(String value1, String value2) {
            addCriterion("record_info not between", value1, value2, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindIsNull() {
            addCriterion("record_like_kind is null");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindIsNotNull() {
            addCriterion("record_like_kind is not null");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindEqualTo(String value) {
            addCriterion("record_like_kind =", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindNotEqualTo(String value) {
            addCriterion("record_like_kind <>", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindGreaterThan(String value) {
            addCriterion("record_like_kind >", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindGreaterThanOrEqualTo(String value) {
            addCriterion("record_like_kind >=", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindLessThan(String value) {
            addCriterion("record_like_kind <", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindLessThanOrEqualTo(String value) {
            addCriterion("record_like_kind <=", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindLike(String value) {
            addCriterion("record_like_kind like", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindNotLike(String value) {
            addCriterion("record_like_kind not like", value, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindIn(List<String> values) {
            addCriterion("record_like_kind in", values, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindNotIn(List<String> values) {
            addCriterion("record_like_kind not in", values, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindBetween(String value1, String value2) {
            addCriterion("record_like_kind between", value1, value2, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordLikeKindNotBetween(String value1, String value2) {
            addCriterion("record_like_kind not between", value1, value2, "recordLikeKind");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkIsNull() {
            addCriterion("record_most_work is null");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkIsNotNull() {
            addCriterion("record_most_work is not null");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkEqualTo(String value) {
            addCriterion("record_most_work =", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkNotEqualTo(String value) {
            addCriterion("record_most_work <>", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkGreaterThan(String value) {
            addCriterion("record_most_work >", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkGreaterThanOrEqualTo(String value) {
            addCriterion("record_most_work >=", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkLessThan(String value) {
            addCriterion("record_most_work <", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkLessThanOrEqualTo(String value) {
            addCriterion("record_most_work <=", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkLike(String value) {
            addCriterion("record_most_work like", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkNotLike(String value) {
            addCriterion("record_most_work not like", value, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkIn(List<String> values) {
            addCriterion("record_most_work in", values, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkNotIn(List<String> values) {
            addCriterion("record_most_work not in", values, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkBetween(String value1, String value2) {
            addCriterion("record_most_work between", value1, value2, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordMostWorkNotBetween(String value1, String value2) {
            addCriterion("record_most_work not between", value1, value2, "recordMostWork");
            return (Criteria) this;
        }

        public Criteria andRecordLackIsNull() {
            addCriterion("record_lack is null");
            return (Criteria) this;
        }

        public Criteria andRecordLackIsNotNull() {
            addCriterion("record_lack is not null");
            return (Criteria) this;
        }

        public Criteria andRecordLackEqualTo(String value) {
            addCriterion("record_lack =", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackNotEqualTo(String value) {
            addCriterion("record_lack <>", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackGreaterThan(String value) {
            addCriterion("record_lack >", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackGreaterThanOrEqualTo(String value) {
            addCriterion("record_lack >=", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackLessThan(String value) {
            addCriterion("record_lack <", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackLessThanOrEqualTo(String value) {
            addCriterion("record_lack <=", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackLike(String value) {
            addCriterion("record_lack like", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackNotLike(String value) {
            addCriterion("record_lack not like", value, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackIn(List<String> values) {
            addCriterion("record_lack in", values, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackNotIn(List<String> values) {
            addCriterion("record_lack not in", values, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackBetween(String value1, String value2) {
            addCriterion("record_lack between", value1, value2, "recordLack");
            return (Criteria) this;
        }

        public Criteria andRecordLackNotBetween(String value1, String value2) {
            addCriterion("record_lack not between", value1, value2, "recordLack");
            return (Criteria) this;
        }

        public Criteria andReportSummaryIsNull() {
            addCriterion("report_summary is null");
            return (Criteria) this;
        }

        public Criteria andReportSummaryIsNotNull() {
            addCriterion("report_summary is not null");
            return (Criteria) this;
        }

        public Criteria andReportSummaryEqualTo(String value) {
            addCriterion("report_summary =", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotEqualTo(String value) {
            addCriterion("report_summary <>", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryGreaterThan(String value) {
            addCriterion("report_summary >", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("report_summary >=", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLessThan(String value) {
            addCriterion("report_summary <", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLessThanOrEqualTo(String value) {
            addCriterion("report_summary <=", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLike(String value) {
            addCriterion("report_summary like", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotLike(String value) {
            addCriterion("report_summary not like", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryIn(List<String> values) {
            addCriterion("report_summary in", values, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotIn(List<String> values) {
            addCriterion("report_summary not in", values, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryBetween(String value1, String value2) {
            addCriterion("report_summary between", value1, value2, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotBetween(String value1, String value2) {
            addCriterion("report_summary not between", value1, value2, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}