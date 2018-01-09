package com.timmy.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BorrowbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowbookExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeIsNull() {
            addCriterion("borrowtime is null");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeIsNotNull() {
            addCriterion("borrowtime is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeEqualTo(Integer value) {
            addCriterion("borrowtime =", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotEqualTo(Integer value) {
            addCriterion("borrowtime <>", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeGreaterThan(Integer value) {
            addCriterion("borrowtime >", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowtime >=", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeLessThan(Integer value) {
            addCriterion("borrowtime <", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeLessThanOrEqualTo(Integer value) {
            addCriterion("borrowtime <=", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeIn(List<Integer> values) {
            addCriterion("borrowtime in", values, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotIn(List<Integer> values) {
            addCriterion("borrowtime not in", values, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeBetween(Integer value1, Integer value2) {
            addCriterion("borrowtime between", value1, value2, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowtime not between", value1, value2, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowendIsNull() {
            addCriterion("borrowend is null");
            return (Criteria) this;
        }

        public Criteria andBorrowendIsNotNull() {
            addCriterion("borrowend is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowendEqualTo(Date value) {
            addCriterionForJDBCDate("borrowend =", value, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrowend <>", value, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendGreaterThan(Date value) {
            addCriterionForJDBCDate("borrowend >", value, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowend >=", value, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendLessThan(Date value) {
            addCriterionForJDBCDate("borrowend <", value, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowend <=", value, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendIn(List<Date> values) {
            addCriterionForJDBCDate("borrowend in", values, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrowend not in", values, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowend between", value1, value2, "borrowend");
            return (Criteria) this;
        }

        public Criteria andBorrowendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowend not between", value1, value2, "borrowend");
            return (Criteria) this;
        }

        public Criteria andOweIsNull() {
            addCriterion("owe is null");
            return (Criteria) this;
        }

        public Criteria andOweIsNotNull() {
            addCriterion("owe is not null");
            return (Criteria) this;
        }

        public Criteria andOweEqualTo(Double value) {
            addCriterion("owe =", value, "owe");
            return (Criteria) this;
        }

        public Criteria andOweNotEqualTo(Double value) {
            addCriterion("owe <>", value, "owe");
            return (Criteria) this;
        }

        public Criteria andOweGreaterThan(Double value) {
            addCriterion("owe >", value, "owe");
            return (Criteria) this;
        }

        public Criteria andOweGreaterThanOrEqualTo(Double value) {
            addCriterion("owe >=", value, "owe");
            return (Criteria) this;
        }

        public Criteria andOweLessThan(Double value) {
            addCriterion("owe <", value, "owe");
            return (Criteria) this;
        }

        public Criteria andOweLessThanOrEqualTo(Double value) {
            addCriterion("owe <=", value, "owe");
            return (Criteria) this;
        }

        public Criteria andOweIn(List<Double> values) {
            addCriterion("owe in", values, "owe");
            return (Criteria) this;
        }

        public Criteria andOweNotIn(List<Double> values) {
            addCriterion("owe not in", values, "owe");
            return (Criteria) this;
        }

        public Criteria andOweBetween(Double value1, Double value2) {
            addCriterion("owe between", value1, value2, "owe");
            return (Criteria) this;
        }

        public Criteria andOweNotBetween(Double value1, Double value2) {
            addCriterion("owe not between", value1, value2, "owe");
            return (Criteria) this;
        }

        public Criteria andBorrownumIsNull() {
            addCriterion("borrownum is null");
            return (Criteria) this;
        }

        public Criteria andBorrownumIsNotNull() {
            addCriterion("borrownum is not null");
            return (Criteria) this;
        }

        public Criteria andBorrownumEqualTo(Integer value) {
            addCriterion("borrownum =", value, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumNotEqualTo(Integer value) {
            addCriterion("borrownum <>", value, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumGreaterThan(Integer value) {
            addCriterion("borrownum >", value, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrownum >=", value, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumLessThan(Integer value) {
            addCriterion("borrownum <", value, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumLessThanOrEqualTo(Integer value) {
            addCriterion("borrownum <=", value, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumIn(List<Integer> values) {
            addCriterion("borrownum in", values, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumNotIn(List<Integer> values) {
            addCriterion("borrownum not in", values, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumBetween(Integer value1, Integer value2) {
            addCriterion("borrownum between", value1, value2, "borrownum");
            return (Criteria) this;
        }

        public Criteria andBorrownumNotBetween(Integer value1, Integer value2) {
            addCriterion("borrownum not between", value1, value2, "borrownum");
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