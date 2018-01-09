package com.timmy.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andBorrowidIsNull() {
            addCriterion("borrowid is null");
            return (Criteria) this;
        }

        public Criteria andBorrowidIsNotNull() {
            addCriterion("borrowid is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowidEqualTo(Integer value) {
            addCriterion("borrowid =", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotEqualTo(Integer value) {
            addCriterion("borrowid <>", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThan(Integer value) {
            addCriterion("borrowid >", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowid >=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThan(Integer value) {
            addCriterion("borrowid <", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThanOrEqualTo(Integer value) {
            addCriterion("borrowid <=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidIn(List<Integer> values) {
            addCriterion("borrowid in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotIn(List<Integer> values) {
            addCriterion("borrowid not in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidBetween(Integer value1, Integer value2) {
            addCriterion("borrowid between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowid not between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorroweridIsNull() {
            addCriterion("borrowerid is null");
            return (Criteria) this;
        }

        public Criteria andBorroweridIsNotNull() {
            addCriterion("borrowerid is not null");
            return (Criteria) this;
        }

        public Criteria andBorroweridEqualTo(Integer value) {
            addCriterion("borrowerid =", value, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridNotEqualTo(Integer value) {
            addCriterion("borrowerid <>", value, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridGreaterThan(Integer value) {
            addCriterion("borrowerid >", value, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowerid >=", value, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridLessThan(Integer value) {
            addCriterion("borrowerid <", value, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridLessThanOrEqualTo(Integer value) {
            addCriterion("borrowerid <=", value, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridIn(List<Integer> values) {
            addCriterion("borrowerid in", values, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridNotIn(List<Integer> values) {
            addCriterion("borrowerid not in", values, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridBetween(Integer value1, Integer value2) {
            addCriterion("borrowerid between", value1, value2, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorroweridNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowerid not between", value1, value2, "borrowerid");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumIsNull() {
            addCriterion("borrowbooknum is null");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumIsNotNull() {
            addCriterion("borrowbooknum is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumEqualTo(Integer value) {
            addCriterion("borrowbooknum =", value, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumNotEqualTo(Integer value) {
            addCriterion("borrowbooknum <>", value, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumGreaterThan(Integer value) {
            addCriterion("borrowbooknum >", value, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowbooknum >=", value, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumLessThan(Integer value) {
            addCriterion("borrowbooknum <", value, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumLessThanOrEqualTo(Integer value) {
            addCriterion("borrowbooknum <=", value, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumIn(List<Integer> values) {
            addCriterion("borrowbooknum in", values, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumNotIn(List<Integer> values) {
            addCriterion("borrowbooknum not in", values, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumBetween(Integer value1, Integer value2) {
            addCriterion("borrowbooknum between", value1, value2, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbooknumNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowbooknum not between", value1, value2, "borrowbooknum");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginIsNull() {
            addCriterion("borrowbegin is null");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginIsNotNull() {
            addCriterion("borrowbegin is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginEqualTo(Date value) {
            addCriterionForJDBCDate("borrowbegin =", value, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrowbegin <>", value, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginGreaterThan(Date value) {
            addCriterionForJDBCDate("borrowbegin >", value, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowbegin >=", value, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginLessThan(Date value) {
            addCriterionForJDBCDate("borrowbegin <", value, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowbegin <=", value, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginIn(List<Date> values) {
            addCriterionForJDBCDate("borrowbegin in", values, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrowbegin not in", values, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowbegin between", value1, value2, "borrowbegin");
            return (Criteria) this;
        }

        public Criteria andBorrowbeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowbegin not between", value1, value2, "borrowbegin");
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

        public Criteria andOwedIsNull() {
            addCriterion("owed is null");
            return (Criteria) this;
        }

        public Criteria andOwedIsNotNull() {
            addCriterion("owed is not null");
            return (Criteria) this;
        }

        public Criteria andOwedEqualTo(Integer value) {
            addCriterion("owed =", value, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedNotEqualTo(Integer value) {
            addCriterion("owed <>", value, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedGreaterThan(Integer value) {
            addCriterion("owed >", value, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedGreaterThanOrEqualTo(Integer value) {
            addCriterion("owed >=", value, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedLessThan(Integer value) {
            addCriterion("owed <", value, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedLessThanOrEqualTo(Integer value) {
            addCriterion("owed <=", value, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedIn(List<Integer> values) {
            addCriterion("owed in", values, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedNotIn(List<Integer> values) {
            addCriterion("owed not in", values, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedBetween(Integer value1, Integer value2) {
            addCriterion("owed between", value1, value2, "owed");
            return (Criteria) this;
        }

        public Criteria andOwedNotBetween(Integer value1, Integer value2) {
            addCriterion("owed not between", value1, value2, "owed");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("\" fine\" is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("\" fine\" is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(Double value) {
            addCriterion("\" fine\" =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(Double value) {
            addCriterion("\" fine\" <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(Double value) {
            addCriterion("\" fine\" >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(Double value) {
            addCriterion("\" fine\" >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(Double value) {
            addCriterion("\" fine\" <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(Double value) {
            addCriterion("\" fine\" <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<Double> values) {
            addCriterion("\" fine\" in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<Double> values) {
            addCriterion("\" fine\" not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(Double value1, Double value2) {
            addCriterion("\" fine\" between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(Double value1, Double value2) {
            addCriterion("\" fine\" not between", value1, value2, "fine");
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