package com.mingda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsempExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public CsempExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    protected CsempExample(CsempExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.CSEMP
     *
     * @ibatorgenerated Tue Oct 12 12:42:12 CST 2010
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EMPID =", value, "empid");
            return this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EMPID <>", value, "empid");
            return this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EMPID >", value, "empid");
            return this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPID >=", value, "empid");
            return this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EMPID <", value, "empid");
            return this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EMPID <=", value, "empid");
            return this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EMPID like", value, "empid");
            return this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EMPID not like", value, "empid");
            return this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EMPID in", values, "empid");
            return this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EMPID not in", values, "empid");
            return this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EMPNAME is null");
            return this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EMPNAME is not null");
            return this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EMPNAME =", value, "empname");
            return this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EMPNAME <>", value, "empname");
            return this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EMPNAME >", value, "empname");
            return this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPNAME >=", value, "empname");
            return this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EMPNAME <", value, "empname");
            return this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EMPNAME <=", value, "empname");
            return this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EMPNAME like", value, "empname");
            return this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EMPNAME not like", value, "empname");
            return this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EMPNAME in", values, "empname");
            return this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EMPNAME not in", values, "empname");
            return this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EMPNAME between", value1, value2, "empname");
            return this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EMPNAME not between", value1, value2, "empname");
            return this;
        }

        public Criteria andAccoutIsNull() {
            addCriterion("ACCOUT is null");
            return this;
        }

        public Criteria andAccoutIsNotNull() {
            addCriterion("ACCOUT is not null");
            return this;
        }

        public Criteria andAccoutEqualTo(String value) {
            addCriterion("ACCOUT =", value, "accout");
            return this;
        }

        public Criteria andAccoutNotEqualTo(String value) {
            addCriterion("ACCOUT <>", value, "accout");
            return this;
        }

        public Criteria andAccoutGreaterThan(String value) {
            addCriterion("ACCOUT >", value, "accout");
            return this;
        }

        public Criteria andAccoutGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUT >=", value, "accout");
            return this;
        }

        public Criteria andAccoutLessThan(String value) {
            addCriterion("ACCOUT <", value, "accout");
            return this;
        }

        public Criteria andAccoutLessThanOrEqualTo(String value) {
            addCriterion("ACCOUT <=", value, "accout");
            return this;
        }

        public Criteria andAccoutLike(String value) {
            addCriterion("ACCOUT like", value, "accout");
            return this;
        }

        public Criteria andAccoutNotLike(String value) {
            addCriterion("ACCOUT not like", value, "accout");
            return this;
        }

        public Criteria andAccoutIn(List<String> values) {
            addCriterion("ACCOUT in", values, "accout");
            return this;
        }

        public Criteria andAccoutNotIn(List<String> values) {
            addCriterion("ACCOUT not in", values, "accout");
            return this;
        }

        public Criteria andAccoutBetween(String value1, String value2) {
            addCriterion("ACCOUT between", value1, value2, "accout");
            return this;
        }

        public Criteria andAccoutNotBetween(String value1, String value2) {
            addCriterion("ACCOUT not between", value1, value2, "accout");
            return this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("PWD is null");
            return this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("PWD is not null");
            return this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("PWD =", value, "pwd");
            return this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("PWD <>", value, "pwd");
            return this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("PWD >", value, "pwd");
            return this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PWD >=", value, "pwd");
            return this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("PWD <", value, "pwd");
            return this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("PWD <=", value, "pwd");
            return this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("PWD like", value, "pwd");
            return this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("PWD not like", value, "pwd");
            return this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("PWD in", values, "pwd");
            return this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("PWD not in", values, "pwd");
            return this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("PWD between", value1, value2, "pwd");
            return this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("PWD not between", value1, value2, "pwd");
            return this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("ORGANIZATION_ID like", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("ORGANIZATION_ID not like", value, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return this;
        }
    }
}