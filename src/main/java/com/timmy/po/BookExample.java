package com.timmy.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andBdesc1IsNull() {
            addCriterion("bdesc1 is null");
            return (Criteria) this;
        }

        public Criteria andBdesc1IsNotNull() {
            addCriterion("bdesc1 is not null");
            return (Criteria) this;
        }

        public Criteria andBdesc1EqualTo(String value) {
            addCriterion("bdesc1 =", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1NotEqualTo(String value) {
            addCriterion("bdesc1 <>", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1GreaterThan(String value) {
            addCriterion("bdesc1 >", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1GreaterThanOrEqualTo(String value) {
            addCriterion("bdesc1 >=", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1LessThan(String value) {
            addCriterion("bdesc1 <", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1LessThanOrEqualTo(String value) {
            addCriterion("bdesc1 <=", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1Like(String value) {
            addCriterion("bdesc1 like", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1NotLike(String value) {
            addCriterion("bdesc1 not like", value, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1In(List<String> values) {
            addCriterion("bdesc1 in", values, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1NotIn(List<String> values) {
            addCriterion("bdesc1 not in", values, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1Between(String value1, String value2) {
            addCriterion("bdesc1 between", value1, value2, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc1NotBetween(String value1, String value2) {
            addCriterion("bdesc1 not between", value1, value2, "bdesc1");
            return (Criteria) this;
        }

        public Criteria andBdesc2IsNull() {
            addCriterion("bdesc2 is null");
            return (Criteria) this;
        }

        public Criteria andBdesc2IsNotNull() {
            addCriterion("bdesc2 is not null");
            return (Criteria) this;
        }

        public Criteria andBdesc2EqualTo(String value) {
            addCriterion("bdesc2 =", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2NotEqualTo(String value) {
            addCriterion("bdesc2 <>", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2GreaterThan(String value) {
            addCriterion("bdesc2 >", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2GreaterThanOrEqualTo(String value) {
            addCriterion("bdesc2 >=", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2LessThan(String value) {
            addCriterion("bdesc2 <", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2LessThanOrEqualTo(String value) {
            addCriterion("bdesc2 <=", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2Like(String value) {
            addCriterion("bdesc2 like", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2NotLike(String value) {
            addCriterion("bdesc2 not like", value, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2In(List<String> values) {
            addCriterion("bdesc2 in", values, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2NotIn(List<String> values) {
            addCriterion("bdesc2 not in", values, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2Between(String value1, String value2) {
            addCriterion("bdesc2 between", value1, value2, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc2NotBetween(String value1, String value2) {
            addCriterion("bdesc2 not between", value1, value2, "bdesc2");
            return (Criteria) this;
        }

        public Criteria andBdesc3IsNull() {
            addCriterion("bdesc3 is null");
            return (Criteria) this;
        }

        public Criteria andBdesc3IsNotNull() {
            addCriterion("bdesc3 is not null");
            return (Criteria) this;
        }

        public Criteria andBdesc3EqualTo(String value) {
            addCriterion("bdesc3 =", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3NotEqualTo(String value) {
            addCriterion("bdesc3 <>", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3GreaterThan(String value) {
            addCriterion("bdesc3 >", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3GreaterThanOrEqualTo(String value) {
            addCriterion("bdesc3 >=", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3LessThan(String value) {
            addCriterion("bdesc3 <", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3LessThanOrEqualTo(String value) {
            addCriterion("bdesc3 <=", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3Like(String value) {
            addCriterion("bdesc3 like", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3NotLike(String value) {
            addCriterion("bdesc3 not like", value, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3In(List<String> values) {
            addCriterion("bdesc3 in", values, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3NotIn(List<String> values) {
            addCriterion("bdesc3 not in", values, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3Between(String value1, String value2) {
            addCriterion("bdesc3 between", value1, value2, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc3NotBetween(String value1, String value2) {
            addCriterion("bdesc3 not between", value1, value2, "bdesc3");
            return (Criteria) this;
        }

        public Criteria andBdesc4IsNull() {
            addCriterion("bdesc4 is null");
            return (Criteria) this;
        }

        public Criteria andBdesc4IsNotNull() {
            addCriterion("bdesc4 is not null");
            return (Criteria) this;
        }

        public Criteria andBdesc4EqualTo(String value) {
            addCriterion("bdesc4 =", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4NotEqualTo(String value) {
            addCriterion("bdesc4 <>", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4GreaterThan(String value) {
            addCriterion("bdesc4 >", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4GreaterThanOrEqualTo(String value) {
            addCriterion("bdesc4 >=", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4LessThan(String value) {
            addCriterion("bdesc4 <", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4LessThanOrEqualTo(String value) {
            addCriterion("bdesc4 <=", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4Like(String value) {
            addCriterion("bdesc4 like", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4NotLike(String value) {
            addCriterion("bdesc4 not like", value, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4In(List<String> values) {
            addCriterion("bdesc4 in", values, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4NotIn(List<String> values) {
            addCriterion("bdesc4 not in", values, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4Between(String value1, String value2) {
            addCriterion("bdesc4 between", value1, value2, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andBdesc4NotBetween(String value1, String value2) {
            addCriterion("bdesc4 not between", value1, value2, "bdesc4");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("ishot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("ishot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(Integer value) {
            addCriterion("ishot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Integer value) {
            addCriterion("ishot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Integer value) {
            addCriterion("ishot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Integer value) {
            addCriterion("ishot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Integer value) {
            addCriterion("ishot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Integer> values) {
            addCriterion("ishot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Integer> values) {
            addCriterion("ishot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Integer value1, Integer value2) {
            addCriterion("ishot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Integer value1, Integer value2) {
            addCriterion("ishot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("bdate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("bdate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterion("bdate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterion("bdate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterion("bdate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bdate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterion("bdate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterion("bdate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterion("bdate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterion("bdate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterion("bdate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterion("bdate not between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andPublishingdateIsNull() {
            addCriterion("publishingdate is null");
            return (Criteria) this;
        }

        public Criteria andPublishingdateIsNotNull() {
            addCriterion("publishingdate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingdateEqualTo(Date value) {
            addCriterion("publishingdate =", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateNotEqualTo(Date value) {
            addCriterion("publishingdate <>", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateGreaterThan(Date value) {
            addCriterion("publishingdate >", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("publishingdate >=", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateLessThan(Date value) {
            addCriterion("publishingdate <", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateLessThanOrEqualTo(Date value) {
            addCriterion("publishingdate <=", value, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateIn(List<Date> values) {
            addCriterion("publishingdate in", values, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateNotIn(List<Date> values) {
            addCriterion("publishingdate not in", values, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateBetween(Date value1, Date value2) {
            addCriterion("publishingdate between", value1, value2, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishingdateNotBetween(Date value1, Date value2) {
            addCriterion("publishingdate not between", value1, value2, "publishingdate");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationIsNull() {
            addCriterion("publishinglocation is null");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationIsNotNull() {
            addCriterion("publishinglocation is not null");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationEqualTo(String value) {
            addCriterion("publishinglocation =", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationNotEqualTo(String value) {
            addCriterion("publishinglocation <>", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationGreaterThan(String value) {
            addCriterion("publishinglocation >", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationGreaterThanOrEqualTo(String value) {
            addCriterion("publishinglocation >=", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationLessThan(String value) {
            addCriterion("publishinglocation <", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationLessThanOrEqualTo(String value) {
            addCriterion("publishinglocation <=", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationLike(String value) {
            addCriterion("publishinglocation like", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationNotLike(String value) {
            addCriterion("publishinglocation not like", value, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationIn(List<String> values) {
            addCriterion("publishinglocation in", values, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationNotIn(List<String> values) {
            addCriterion("publishinglocation not in", values, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationBetween(String value1, String value2) {
            addCriterion("publishinglocation between", value1, value2, "publishinglocation");
            return (Criteria) this;
        }

        public Criteria andPublishinglocationNotBetween(String value1, String value2) {
            addCriterion("publishinglocation not between", value1, value2, "publishinglocation");
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