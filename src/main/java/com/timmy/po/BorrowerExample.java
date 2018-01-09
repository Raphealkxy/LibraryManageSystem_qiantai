package com.timmy.po;

import java.util.ArrayList;
import java.util.List;

public class BorrowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowerExample() {
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

        public Criteria andBorrowernameIsNull() {
            addCriterion("borrowername is null");
            return (Criteria) this;
        }

        public Criteria andBorrowernameIsNotNull() {
            addCriterion("borrowername is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowernameEqualTo(String value) {
            addCriterion("borrowername =", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameNotEqualTo(String value) {
            addCriterion("borrowername <>", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameGreaterThan(String value) {
            addCriterion("borrowername >", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameGreaterThanOrEqualTo(String value) {
            addCriterion("borrowername >=", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameLessThan(String value) {
            addCriterion("borrowername <", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameLessThanOrEqualTo(String value) {
            addCriterion("borrowername <=", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameLike(String value) {
            addCriterion("borrowername like", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameNotLike(String value) {
            addCriterion("borrowername not like", value, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameIn(List<String> values) {
            addCriterion("borrowername in", values, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameNotIn(List<String> values) {
            addCriterion("borrowername not in", values, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameBetween(String value1, String value2) {
            addCriterion("borrowername between", value1, value2, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernameNotBetween(String value1, String value2) {
            addCriterion("borrowername not between", value1, value2, "borrowername");
            return (Criteria) this;
        }

        public Criteria andBorrowernumIsNull() {
            addCriterion("borrowernum is null");
            return (Criteria) this;
        }

        public Criteria andBorrowernumIsNotNull() {
            addCriterion("borrowernum is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowernumEqualTo(String value) {
            addCriterion("borrowernum =", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumNotEqualTo(String value) {
            addCriterion("borrowernum <>", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumGreaterThan(String value) {
            addCriterion("borrowernum >", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumGreaterThanOrEqualTo(String value) {
            addCriterion("borrowernum >=", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumLessThan(String value) {
            addCriterion("borrowernum <", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumLessThanOrEqualTo(String value) {
            addCriterion("borrowernum <=", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumLike(String value) {
            addCriterion("borrowernum like", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumNotLike(String value) {
            addCriterion("borrowernum not like", value, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumIn(List<String> values) {
            addCriterion("borrowernum in", values, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumNotIn(List<String> values) {
            addCriterion("borrowernum not in", values, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumBetween(String value1, String value2) {
            addCriterion("borrowernum between", value1, value2, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowernumNotBetween(String value1, String value2) {
            addCriterion("borrowernum not between", value1, value2, "borrowernum");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassIsNull() {
            addCriterion("borrowerclass is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassIsNotNull() {
            addCriterion("borrowerclass is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassEqualTo(String value) {
            addCriterion("borrowerclass =", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassNotEqualTo(String value) {
            addCriterion("borrowerclass <>", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassGreaterThan(String value) {
            addCriterion("borrowerclass >", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassGreaterThanOrEqualTo(String value) {
            addCriterion("borrowerclass >=", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassLessThan(String value) {
            addCriterion("borrowerclass <", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassLessThanOrEqualTo(String value) {
            addCriterion("borrowerclass <=", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassLike(String value) {
            addCriterion("borrowerclass like", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassNotLike(String value) {
            addCriterion("borrowerclass not like", value, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassIn(List<String> values) {
            addCriterion("borrowerclass in", values, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassNotIn(List<String> values) {
            addCriterion("borrowerclass not in", values, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassBetween(String value1, String value2) {
            addCriterion("borrowerclass between", value1, value2, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerclassNotBetween(String value1, String value2) {
            addCriterion("borrowerclass not between", value1, value2, "borrowerclass");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentIsNull() {
            addCriterion("borrowerdepartment is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentIsNotNull() {
            addCriterion("borrowerdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentEqualTo(String value) {
            addCriterion("borrowerdepartment =", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentNotEqualTo(String value) {
            addCriterion("borrowerdepartment <>", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentGreaterThan(String value) {
            addCriterion("borrowerdepartment >", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("borrowerdepartment >=", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentLessThan(String value) {
            addCriterion("borrowerdepartment <", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentLessThanOrEqualTo(String value) {
            addCriterion("borrowerdepartment <=", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentLike(String value) {
            addCriterion("borrowerdepartment like", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentNotLike(String value) {
            addCriterion("borrowerdepartment not like", value, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentIn(List<String> values) {
            addCriterion("borrowerdepartment in", values, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentNotIn(List<String> values) {
            addCriterion("borrowerdepartment not in", values, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentBetween(String value1, String value2) {
            addCriterion("borrowerdepartment between", value1, value2, "borrowerdepartment");
            return (Criteria) this;
        }

        public Criteria andBorrowerdepartmentNotBetween(String value1, String value2) {
            addCriterion("borrowerdepartment not between", value1, value2, "borrowerdepartment");
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