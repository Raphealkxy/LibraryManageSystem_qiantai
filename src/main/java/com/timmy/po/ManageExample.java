package com.timmy.po;

import java.util.ArrayList;
import java.util.List;

public class ManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageExample() {
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

        public Criteria andManageidIsNull() {
            addCriterion("manageid is null");
            return (Criteria) this;
        }

        public Criteria andManageidIsNotNull() {
            addCriterion("manageid is not null");
            return (Criteria) this;
        }

        public Criteria andManageidEqualTo(Integer value) {
            addCriterion("manageid =", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotEqualTo(Integer value) {
            addCriterion("manageid <>", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidGreaterThan(Integer value) {
            addCriterion("manageid >", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("manageid >=", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidLessThan(Integer value) {
            addCriterion("manageid <", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidLessThanOrEqualTo(Integer value) {
            addCriterion("manageid <=", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidIn(List<Integer> values) {
            addCriterion("manageid in", values, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotIn(List<Integer> values) {
            addCriterion("manageid not in", values, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidBetween(Integer value1, Integer value2) {
            addCriterion("manageid between", value1, value2, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotBetween(Integer value1, Integer value2) {
            addCriterion("manageid not between", value1, value2, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerid is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerid is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Integer value) {
            addCriterion("managerid =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Integer value) {
            addCriterion("managerid <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Integer value) {
            addCriterion("managerid >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerid >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Integer value) {
            addCriterion("managerid <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Integer value) {
            addCriterion("managerid <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Integer> values) {
            addCriterion("managerid in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Integer> values) {
            addCriterion("managerid not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Integer value1, Integer value2) {
            addCriterion("managerid between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Integer value1, Integer value2) {
            addCriterion("managerid not between", value1, value2, "managerid");
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

        public Criteria andBorrowerbookidIsNull() {
            addCriterion("borrowerbookid is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidIsNotNull() {
            addCriterion("borrowerbookid is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidEqualTo(Integer value) {
            addCriterion("borrowerbookid =", value, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidNotEqualTo(Integer value) {
            addCriterion("borrowerbookid <>", value, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidGreaterThan(Integer value) {
            addCriterion("borrowerbookid >", value, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowerbookid >=", value, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidLessThan(Integer value) {
            addCriterion("borrowerbookid <", value, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidLessThanOrEqualTo(Integer value) {
            addCriterion("borrowerbookid <=", value, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidIn(List<Integer> values) {
            addCriterion("borrowerbookid in", values, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidNotIn(List<Integer> values) {
            addCriterion("borrowerbookid not in", values, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidBetween(Integer value1, Integer value2) {
            addCriterion("borrowerbookid between", value1, value2, "borrowerbookid");
            return (Criteria) this;
        }

        public Criteria andBorrowerbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowerbookid not between", value1, value2, "borrowerbookid");
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