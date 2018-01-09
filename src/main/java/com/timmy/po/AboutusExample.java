package com.timmy.po;

import java.util.ArrayList;
import java.util.List;

public class AboutusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AboutusExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreIsNull() {
            addCriterion("aboutourstore is null");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreIsNotNull() {
            addCriterion("aboutourstore is not null");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreEqualTo(String value) {
            addCriterion("aboutourstore =", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreNotEqualTo(String value) {
            addCriterion("aboutourstore <>", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreGreaterThan(String value) {
            addCriterion("aboutourstore >", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreGreaterThanOrEqualTo(String value) {
            addCriterion("aboutourstore >=", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreLessThan(String value) {
            addCriterion("aboutourstore <", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreLessThanOrEqualTo(String value) {
            addCriterion("aboutourstore <=", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreLike(String value) {
            addCriterion("aboutourstore like", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreNotLike(String value) {
            addCriterion("aboutourstore not like", value, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreIn(List<String> values) {
            addCriterion("aboutourstore in", values, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreNotIn(List<String> values) {
            addCriterion("aboutourstore not in", values, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreBetween(String value1, String value2) {
            addCriterion("aboutourstore between", value1, value2, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andAboutourstoreNotBetween(String value1, String value2) {
            addCriterion("aboutourstore not between", value1, value2, "aboutourstore");
            return (Criteria) this;
        }

        public Criteria andP11IsNull() {
            addCriterion("p11 is null");
            return (Criteria) this;
        }

        public Criteria andP11IsNotNull() {
            addCriterion("p11 is not null");
            return (Criteria) this;
        }

        public Criteria andP11EqualTo(String value) {
            addCriterion("p11 =", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotEqualTo(String value) {
            addCriterion("p11 <>", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11GreaterThan(String value) {
            addCriterion("p11 >", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11GreaterThanOrEqualTo(String value) {
            addCriterion("p11 >=", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11LessThan(String value) {
            addCriterion("p11 <", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11LessThanOrEqualTo(String value) {
            addCriterion("p11 <=", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11Like(String value) {
            addCriterion("p11 like", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotLike(String value) {
            addCriterion("p11 not like", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11In(List<String> values) {
            addCriterion("p11 in", values, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotIn(List<String> values) {
            addCriterion("p11 not in", values, "p11");
            return (Criteria) this;
        }

        public Criteria andP11Between(String value1, String value2) {
            addCriterion("p11 between", value1, value2, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotBetween(String value1, String value2) {
            addCriterion("p11 not between", value1, value2, "p11");
            return (Criteria) this;
        }

        public Criteria andP12IsNull() {
            addCriterion("p12 is null");
            return (Criteria) this;
        }

        public Criteria andP12IsNotNull() {
            addCriterion("p12 is not null");
            return (Criteria) this;
        }

        public Criteria andP12EqualTo(String value) {
            addCriterion("p12 =", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotEqualTo(String value) {
            addCriterion("p12 <>", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12GreaterThan(String value) {
            addCriterion("p12 >", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12GreaterThanOrEqualTo(String value) {
            addCriterion("p12 >=", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12LessThan(String value) {
            addCriterion("p12 <", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12LessThanOrEqualTo(String value) {
            addCriterion("p12 <=", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12Like(String value) {
            addCriterion("p12 like", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotLike(String value) {
            addCriterion("p12 not like", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12In(List<String> values) {
            addCriterion("p12 in", values, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotIn(List<String> values) {
            addCriterion("p12 not in", values, "p12");
            return (Criteria) this;
        }

        public Criteria andP12Between(String value1, String value2) {
            addCriterion("p12 between", value1, value2, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotBetween(String value1, String value2) {
            addCriterion("p12 not between", value1, value2, "p12");
            return (Criteria) this;
        }

        public Criteria andP21IsNull() {
            addCriterion("p21 is null");
            return (Criteria) this;
        }

        public Criteria andP21IsNotNull() {
            addCriterion("p21 is not null");
            return (Criteria) this;
        }

        public Criteria andP21EqualTo(String value) {
            addCriterion("p21 =", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotEqualTo(String value) {
            addCriterion("p21 <>", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21GreaterThan(String value) {
            addCriterion("p21 >", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21GreaterThanOrEqualTo(String value) {
            addCriterion("p21 >=", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21LessThan(String value) {
            addCriterion("p21 <", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21LessThanOrEqualTo(String value) {
            addCriterion("p21 <=", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21Like(String value) {
            addCriterion("p21 like", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotLike(String value) {
            addCriterion("p21 not like", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21In(List<String> values) {
            addCriterion("p21 in", values, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotIn(List<String> values) {
            addCriterion("p21 not in", values, "p21");
            return (Criteria) this;
        }

        public Criteria andP21Between(String value1, String value2) {
            addCriterion("p21 between", value1, value2, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotBetween(String value1, String value2) {
            addCriterion("p21 not between", value1, value2, "p21");
            return (Criteria) this;
        }

        public Criteria andP22IsNull() {
            addCriterion("p22 is null");
            return (Criteria) this;
        }

        public Criteria andP22IsNotNull() {
            addCriterion("p22 is not null");
            return (Criteria) this;
        }

        public Criteria andP22EqualTo(String value) {
            addCriterion("p22 =", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotEqualTo(String value) {
            addCriterion("p22 <>", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22GreaterThan(String value) {
            addCriterion("p22 >", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22GreaterThanOrEqualTo(String value) {
            addCriterion("p22 >=", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22LessThan(String value) {
            addCriterion("p22 <", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22LessThanOrEqualTo(String value) {
            addCriterion("p22 <=", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22Like(String value) {
            addCriterion("p22 like", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotLike(String value) {
            addCriterion("p22 not like", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22In(List<String> values) {
            addCriterion("p22 in", values, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotIn(List<String> values) {
            addCriterion("p22 not in", values, "p22");
            return (Criteria) this;
        }

        public Criteria andP22Between(String value1, String value2) {
            addCriterion("p22 between", value1, value2, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotBetween(String value1, String value2) {
            addCriterion("p22 not between", value1, value2, "p22");
            return (Criteria) this;
        }

        public Criteria andP31IsNull() {
            addCriterion("p31 is null");
            return (Criteria) this;
        }

        public Criteria andP31IsNotNull() {
            addCriterion("p31 is not null");
            return (Criteria) this;
        }

        public Criteria andP31EqualTo(String value) {
            addCriterion("p31 =", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotEqualTo(String value) {
            addCriterion("p31 <>", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31GreaterThan(String value) {
            addCriterion("p31 >", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31GreaterThanOrEqualTo(String value) {
            addCriterion("p31 >=", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31LessThan(String value) {
            addCriterion("p31 <", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31LessThanOrEqualTo(String value) {
            addCriterion("p31 <=", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31Like(String value) {
            addCriterion("p31 like", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotLike(String value) {
            addCriterion("p31 not like", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31In(List<String> values) {
            addCriterion("p31 in", values, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotIn(List<String> values) {
            addCriterion("p31 not in", values, "p31");
            return (Criteria) this;
        }

        public Criteria andP31Between(String value1, String value2) {
            addCriterion("p31 between", value1, value2, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotBetween(String value1, String value2) {
            addCriterion("p31 not between", value1, value2, "p31");
            return (Criteria) this;
        }

        public Criteria andP32IsNull() {
            addCriterion("p32 is null");
            return (Criteria) this;
        }

        public Criteria andP32IsNotNull() {
            addCriterion("p32 is not null");
            return (Criteria) this;
        }

        public Criteria andP32EqualTo(String value) {
            addCriterion("p32 =", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotEqualTo(String value) {
            addCriterion("p32 <>", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32GreaterThan(String value) {
            addCriterion("p32 >", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32GreaterThanOrEqualTo(String value) {
            addCriterion("p32 >=", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32LessThan(String value) {
            addCriterion("p32 <", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32LessThanOrEqualTo(String value) {
            addCriterion("p32 <=", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32Like(String value) {
            addCriterion("p32 like", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotLike(String value) {
            addCriterion("p32 not like", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32In(List<String> values) {
            addCriterion("p32 in", values, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotIn(List<String> values) {
            addCriterion("p32 not in", values, "p32");
            return (Criteria) this;
        }

        public Criteria andP32Between(String value1, String value2) {
            addCriterion("p32 between", value1, value2, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotBetween(String value1, String value2) {
            addCriterion("p32 not between", value1, value2, "p32");
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