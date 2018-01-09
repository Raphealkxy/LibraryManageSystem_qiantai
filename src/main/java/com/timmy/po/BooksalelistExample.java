package com.timmy.po;

import java.util.ArrayList;
import java.util.List;

public class BooksalelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BooksalelistExample() {
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

        public Criteria andBooksaleidIsNull() {
            addCriterion("booksaleid is null");
            return (Criteria) this;
        }

        public Criteria andBooksaleidIsNotNull() {
            addCriterion("booksaleid is not null");
            return (Criteria) this;
        }

        public Criteria andBooksaleidEqualTo(Integer value) {
            addCriterion("booksaleid =", value, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidNotEqualTo(Integer value) {
            addCriterion("booksaleid <>", value, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidGreaterThan(Integer value) {
            addCriterion("booksaleid >", value, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("booksaleid >=", value, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidLessThan(Integer value) {
            addCriterion("booksaleid <", value, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidLessThanOrEqualTo(Integer value) {
            addCriterion("booksaleid <=", value, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidIn(List<Integer> values) {
            addCriterion("booksaleid in", values, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidNotIn(List<Integer> values) {
            addCriterion("booksaleid not in", values, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidBetween(Integer value1, Integer value2) {
            addCriterion("booksaleid between", value1, value2, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBooksaleidNotBetween(Integer value1, Integer value2) {
            addCriterion("booksaleid not between", value1, value2, "booksaleid");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
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

        public Criteria andSaledbooknameIsNull() {
            addCriterion("saledbookname is null");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameIsNotNull() {
            addCriterion("saledbookname is not null");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameEqualTo(String value) {
            addCriterion("saledbookname =", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameNotEqualTo(String value) {
            addCriterion("saledbookname <>", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameGreaterThan(String value) {
            addCriterion("saledbookname >", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameGreaterThanOrEqualTo(String value) {
            addCriterion("saledbookname >=", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameLessThan(String value) {
            addCriterion("saledbookname <", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameLessThanOrEqualTo(String value) {
            addCriterion("saledbookname <=", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameLike(String value) {
            addCriterion("saledbookname like", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameNotLike(String value) {
            addCriterion("saledbookname not like", value, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameIn(List<String> values) {
            addCriterion("saledbookname in", values, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameNotIn(List<String> values) {
            addCriterion("saledbookname not in", values, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameBetween(String value1, String value2) {
            addCriterion("saledbookname between", value1, value2, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledbooknameNotBetween(String value1, String value2) {
            addCriterion("saledbookname not between", value1, value2, "saledbookname");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNull() {
            addCriterion("saledate is null");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNotNull() {
            addCriterion("saledate is not null");
            return (Criteria) this;
        }

        public Criteria andSaledateEqualTo(Integer value) {
            addCriterion("saledate =", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotEqualTo(Integer value) {
            addCriterion("saledate <>", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThan(Integer value) {
            addCriterion("saledate >", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThanOrEqualTo(Integer value) {
            addCriterion("saledate >=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThan(Integer value) {
            addCriterion("saledate <", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThanOrEqualTo(Integer value) {
            addCriterion("saledate <=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateIn(List<Integer> values) {
            addCriterion("saledate in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotIn(List<Integer> values) {
            addCriterion("saledate not in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateBetween(Integer value1, Integer value2) {
            addCriterion("saledate between", value1, value2, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotBetween(Integer value1, Integer value2) {
            addCriterion("saledate not between", value1, value2, "saledate");
            return (Criteria) this;
        }

        public Criteria andSalecountIsNull() {
            addCriterion("salecount is null");
            return (Criteria) this;
        }

        public Criteria andSalecountIsNotNull() {
            addCriterion("salecount is not null");
            return (Criteria) this;
        }

        public Criteria andSalecountEqualTo(Integer value) {
            addCriterion("salecount =", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotEqualTo(Integer value) {
            addCriterion("salecount <>", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountGreaterThan(Integer value) {
            addCriterion("salecount >", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("salecount >=", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountLessThan(Integer value) {
            addCriterion("salecount <", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountLessThanOrEqualTo(Integer value) {
            addCriterion("salecount <=", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountIn(List<Integer> values) {
            addCriterion("salecount in", values, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotIn(List<Integer> values) {
            addCriterion("salecount not in", values, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountBetween(Integer value1, Integer value2) {
            addCriterion("salecount between", value1, value2, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotBetween(Integer value1, Integer value2) {
            addCriterion("salecount not between", value1, value2, "salecount");
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