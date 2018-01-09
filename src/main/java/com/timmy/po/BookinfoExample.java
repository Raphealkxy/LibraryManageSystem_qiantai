package com.timmy.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBooknameIsNull() {
            addCriterion("bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknumIsNull() {
            addCriterion("booknum is null");
            return (Criteria) this;
        }

        public Criteria andBooknumIsNotNull() {
            addCriterion("booknum is not null");
            return (Criteria) this;
        }

        public Criteria andBooknumEqualTo(String value) {
            addCriterion("booknum =", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotEqualTo(String value) {
            addCriterion("booknum <>", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumGreaterThan(String value) {
            addCriterion("booknum >", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumGreaterThanOrEqualTo(String value) {
            addCriterion("booknum >=", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumLessThan(String value) {
            addCriterion("booknum <", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumLessThanOrEqualTo(String value) {
            addCriterion("booknum <=", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumLike(String value) {
            addCriterion("booknum like", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotLike(String value) {
            addCriterion("booknum not like", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumIn(List<String> values) {
            addCriterion("booknum in", values, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotIn(List<String> values) {
            addCriterion("booknum not in", values, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumBetween(String value1, String value2) {
            addCriterion("booknum between", value1, value2, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotBetween(String value1, String value2) {
            addCriterion("booknum not between", value1, value2, "booknum");
            return (Criteria) this;
        }

        public Criteria andAuthornameIsNull() {
            addCriterion("authorname is null");
            return (Criteria) this;
        }

        public Criteria andAuthornameIsNotNull() {
            addCriterion("authorname is not null");
            return (Criteria) this;
        }

        public Criteria andAuthornameEqualTo(String value) {
            addCriterion("authorname =", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotEqualTo(String value) {
            addCriterion("authorname <>", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameGreaterThan(String value) {
            addCriterion("authorname >", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameGreaterThanOrEqualTo(String value) {
            addCriterion("authorname >=", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLessThan(String value) {
            addCriterion("authorname <", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLessThanOrEqualTo(String value) {
            addCriterion("authorname <=", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLike(String value) {
            addCriterion("authorname like", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotLike(String value) {
            addCriterion("authorname not like", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameIn(List<String> values) {
            addCriterion("authorname in", values, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotIn(List<String> values) {
            addCriterion("authorname not in", values, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameBetween(String value1, String value2) {
            addCriterion("authorname between", value1, value2, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotBetween(String value1, String value2) {
            addCriterion("authorname not between", value1, value2, "authorname");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseIsNull() {
            addCriterion("publishinghouse is null");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseIsNotNull() {
            addCriterion("publishinghouse is not null");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseEqualTo(String value) {
            addCriterion("publishinghouse =", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotEqualTo(String value) {
            addCriterion("publishinghouse <>", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseGreaterThan(String value) {
            addCriterion("publishinghouse >", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseGreaterThanOrEqualTo(String value) {
            addCriterion("publishinghouse >=", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseLessThan(String value) {
            addCriterion("publishinghouse <", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseLessThanOrEqualTo(String value) {
            addCriterion("publishinghouse <=", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseLike(String value) {
            addCriterion("publishinghouse like", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotLike(String value) {
            addCriterion("publishinghouse not like", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseIn(List<String> values) {
            addCriterion("publishinghouse in", values, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotIn(List<String> values) {
            addCriterion("publishinghouse not in", values, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseBetween(String value1, String value2) {
            addCriterion("publishinghouse between", value1, value2, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotBetween(String value1, String value2) {
            addCriterion("publishinghouse not between", value1, value2, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishingdateIsNull() {
            addCriterion("publishingDate is null");
            return (Criteria) this;
        }

        public Criteria andPublishingdateIsNotNull() {
            addCriterion("publishingDate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingdateEqualTo(Date value) {
            addCriterionForJDBCDate("publishingDate =", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publishingDate <>", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("publishingDate >", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishingDate >=", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateLessThan(Date value) {
            addCriterionForJDBCDate("publishingDate <", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishingDate <=", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateIn(List<Date> values) {
            addCriterionForJDBCDate("publishingDate in", values, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publishingDate not in", values, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishingDate between", value1, value2, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishingDate not between", value1, value2, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andRepertorynumIsNull() {
            addCriterion("repertorynum is null");
            return (Criteria) this;
        }

        public Criteria andRepertorynumIsNotNull() {
            addCriterion("repertorynum is not null");
            return (Criteria) this;
        }

        public Criteria andRepertorynumEqualTo(Integer value) {
            addCriterion("repertorynum =", value, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumNotEqualTo(Integer value) {
            addCriterion("repertorynum <>", value, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumGreaterThan(Integer value) {
            addCriterion("repertorynum >", value, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("repertorynum >=", value, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumLessThan(Integer value) {
            addCriterion("repertorynum <", value, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumLessThanOrEqualTo(Integer value) {
            addCriterion("repertorynum <=", value, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumIn(List<Integer> values) {
            addCriterion("repertorynum in", values, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumNotIn(List<Integer> values) {
            addCriterion("repertorynum not in", values, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumBetween(Integer value1, Integer value2) {
            addCriterion("repertorynum between", value1, value2, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorynumNotBetween(Integer value1, Integer value2) {
            addCriterion("repertorynum not between", value1, value2, "repertorynum");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationIsNull() {
            addCriterion("repertorylocation is null");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationIsNotNull() {
            addCriterion("repertorylocation is not null");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationEqualTo(String value) {
            addCriterion("repertorylocation =", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationNotEqualTo(String value) {
            addCriterion("repertorylocation <>", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationGreaterThan(String value) {
            addCriterion("repertorylocation >", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationGreaterThanOrEqualTo(String value) {
            addCriterion("repertorylocation >=", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationLessThan(String value) {
            addCriterion("repertorylocation <", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationLessThanOrEqualTo(String value) {
            addCriterion("repertorylocation <=", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationLike(String value) {
            addCriterion("repertorylocation like", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationNotLike(String value) {
            addCriterion("repertorylocation not like", value, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationIn(List<String> values) {
            addCriterion("repertorylocation in", values, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationNotIn(List<String> values) {
            addCriterion("repertorylocation not in", values, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationBetween(String value1, String value2) {
            addCriterion("repertorylocation between", value1, value2, "repertorylocation");
            return (Criteria) this;
        }

        public Criteria andRepertorylocationNotBetween(String value1, String value2) {
            addCriterion("repertorylocation not between", value1, value2, "repertorylocation");
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