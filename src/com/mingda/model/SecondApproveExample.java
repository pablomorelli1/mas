package com.mingda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondApproveExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public SecondApproveExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected SecondApproveExample(SecondApproveExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.SECOND_APPROVE
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andApproveIdIsNull() {
			addCriterion("APPROVE_ID is null");
			return this;
		}

		public Criteria andApproveIdIsNotNull() {
			addCriterion("APPROVE_ID is not null");
			return this;
		}

		public Criteria andApproveIdEqualTo(BigDecimal value) {
			addCriterion("APPROVE_ID =", value, "approveId");
			return this;
		}

		public Criteria andApproveIdNotEqualTo(BigDecimal value) {
			addCriterion("APPROVE_ID <>", value, "approveId");
			return this;
		}

		public Criteria andApproveIdGreaterThan(BigDecimal value) {
			addCriterion("APPROVE_ID >", value, "approveId");
			return this;
		}

		public Criteria andApproveIdGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("APPROVE_ID >=", value, "approveId");
			return this;
		}

		public Criteria andApproveIdLessThan(BigDecimal value) {
			addCriterion("APPROVE_ID <", value, "approveId");
			return this;
		}

		public Criteria andApproveIdLessThanOrEqualTo(BigDecimal value) {
			addCriterion("APPROVE_ID <=", value, "approveId");
			return this;
		}

		public Criteria andApproveIdIn(List<BigDecimal> values) {
			addCriterion("APPROVE_ID in", values, "approveId");
			return this;
		}

		public Criteria andApproveIdNotIn(List<BigDecimal> values) {
			addCriterion("APPROVE_ID not in", values, "approveId");
			return this;
		}

		public Criteria andApproveIdBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("APPROVE_ID between", value1, value2, "approveId");
			return this;
		}

		public Criteria andApproveIdNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("APPROVE_ID not between", value1, value2, "approveId");
			return this;
		}

		public Criteria andFamilynoIsNull() {
			addCriterion("FAMILYNO is null");
			return this;
		}

		public Criteria andFamilynoIsNotNull() {
			addCriterion("FAMILYNO is not null");
			return this;
		}

		public Criteria andFamilynoEqualTo(String value) {
			addCriterion("FAMILYNO =", value, "familyno");
			return this;
		}

		public Criteria andFamilynoNotEqualTo(String value) {
			addCriterion("FAMILYNO <>", value, "familyno");
			return this;
		}

		public Criteria andFamilynoGreaterThan(String value) {
			addCriterion("FAMILYNO >", value, "familyno");
			return this;
		}

		public Criteria andFamilynoGreaterThanOrEqualTo(String value) {
			addCriterion("FAMILYNO >=", value, "familyno");
			return this;
		}

		public Criteria andFamilynoLessThan(String value) {
			addCriterion("FAMILYNO <", value, "familyno");
			return this;
		}

		public Criteria andFamilynoLessThanOrEqualTo(String value) {
			addCriterion("FAMILYNO <=", value, "familyno");
			return this;
		}

		public Criteria andFamilynoLike(String value) {
			addCriterion("FAMILYNO like", value, "familyno");
			return this;
		}

		public Criteria andFamilynoNotLike(String value) {
			addCriterion("FAMILYNO not like", value, "familyno");
			return this;
		}

		public Criteria andFamilynoIn(List<String> values) {
			addCriterion("FAMILYNO in", values, "familyno");
			return this;
		}

		public Criteria andFamilynoNotIn(List<String> values) {
			addCriterion("FAMILYNO not in", values, "familyno");
			return this;
		}

		public Criteria andFamilynoBetween(String value1, String value2) {
			addCriterion("FAMILYNO between", value1, value2, "familyno");
			return this;
		}

		public Criteria andFamilynoNotBetween(String value1, String value2) {
			addCriterion("FAMILYNO not between", value1, value2, "familyno");
			return this;
		}

		public Criteria andMembernameIsNull() {
			addCriterion("MEMBERNAME is null");
			return this;
		}

		public Criteria andMembernameIsNotNull() {
			addCriterion("MEMBERNAME is not null");
			return this;
		}

		public Criteria andMembernameEqualTo(String value) {
			addCriterion("MEMBERNAME =", value, "membername");
			return this;
		}

		public Criteria andMembernameNotEqualTo(String value) {
			addCriterion("MEMBERNAME <>", value, "membername");
			return this;
		}

		public Criteria andMembernameGreaterThan(String value) {
			addCriterion("MEMBERNAME >", value, "membername");
			return this;
		}

		public Criteria andMembernameGreaterThanOrEqualTo(String value) {
			addCriterion("MEMBERNAME >=", value, "membername");
			return this;
		}

		public Criteria andMembernameLessThan(String value) {
			addCriterion("MEMBERNAME <", value, "membername");
			return this;
		}

		public Criteria andMembernameLessThanOrEqualTo(String value) {
			addCriterion("MEMBERNAME <=", value, "membername");
			return this;
		}

		public Criteria andMembernameLike(String value) {
			addCriterion("MEMBERNAME like", value, "membername");
			return this;
		}

		public Criteria andMembernameNotLike(String value) {
			addCriterion("MEMBERNAME not like", value, "membername");
			return this;
		}

		public Criteria andMembernameIn(List<String> values) {
			addCriterion("MEMBERNAME in", values, "membername");
			return this;
		}

		public Criteria andMembernameNotIn(List<String> values) {
			addCriterion("MEMBERNAME not in", values, "membername");
			return this;
		}

		public Criteria andMembernameBetween(String value1, String value2) {
			addCriterion("MEMBERNAME between", value1, value2, "membername");
			return this;
		}

		public Criteria andMembernameNotBetween(String value1, String value2) {
			addCriterion("MEMBERNAME not between", value1, value2, "membername");
			return this;
		}

		public Criteria andPaperidIsNull() {
			addCriterion("PAPERID is null");
			return this;
		}

		public Criteria andPaperidIsNotNull() {
			addCriterion("PAPERID is not null");
			return this;
		}

		public Criteria andPaperidEqualTo(String value) {
			addCriterion("PAPERID =", value, "paperid");
			return this;
		}

		public Criteria andPaperidNotEqualTo(String value) {
			addCriterion("PAPERID <>", value, "paperid");
			return this;
		}

		public Criteria andPaperidGreaterThan(String value) {
			addCriterion("PAPERID >", value, "paperid");
			return this;
		}

		public Criteria andPaperidGreaterThanOrEqualTo(String value) {
			addCriterion("PAPERID >=", value, "paperid");
			return this;
		}

		public Criteria andPaperidLessThan(String value) {
			addCriterion("PAPERID <", value, "paperid");
			return this;
		}

		public Criteria andPaperidLessThanOrEqualTo(String value) {
			addCriterion("PAPERID <=", value, "paperid");
			return this;
		}

		public Criteria andPaperidLike(String value) {
			addCriterion("PAPERID like", value, "paperid");
			return this;
		}

		public Criteria andPaperidNotLike(String value) {
			addCriterion("PAPERID not like", value, "paperid");
			return this;
		}

		public Criteria andPaperidIn(List<String> values) {
			addCriterion("PAPERID in", values, "paperid");
			return this;
		}

		public Criteria andPaperidNotIn(List<String> values) {
			addCriterion("PAPERID not in", values, "paperid");
			return this;
		}

		public Criteria andPaperidBetween(String value1, String value2) {
			addCriterion("PAPERID between", value1, value2, "paperid");
			return this;
		}

		public Criteria andPaperidNotBetween(String value1, String value2) {
			addCriterion("PAPERID not between", value1, value2, "paperid");
			return this;
		}

		public Criteria andPayTotalIsNull() {
			addCriterion("PAY_TOTAL is null");
			return this;
		}

		public Criteria andPayTotalIsNotNull() {
			addCriterion("PAY_TOTAL is not null");
			return this;
		}

		public Criteria andPayTotalEqualTo(BigDecimal value) {
			addCriterion("PAY_TOTAL =", value, "payTotal");
			return this;
		}

		public Criteria andPayTotalNotEqualTo(BigDecimal value) {
			addCriterion("PAY_TOTAL <>", value, "payTotal");
			return this;
		}

		public Criteria andPayTotalGreaterThan(BigDecimal value) {
			addCriterion("PAY_TOTAL >", value, "payTotal");
			return this;
		}

		public Criteria andPayTotalGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_TOTAL >=", value, "payTotal");
			return this;
		}

		public Criteria andPayTotalLessThan(BigDecimal value) {
			addCriterion("PAY_TOTAL <", value, "payTotal");
			return this;
		}

		public Criteria andPayTotalLessThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_TOTAL <=", value, "payTotal");
			return this;
		}

		public Criteria andPayTotalIn(List<BigDecimal> values) {
			addCriterion("PAY_TOTAL in", values, "payTotal");
			return this;
		}

		public Criteria andPayTotalNotIn(List<BigDecimal> values) {
			addCriterion("PAY_TOTAL not in", values, "payTotal");
			return this;
		}

		public Criteria andPayTotalBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("PAY_TOTAL between", value1, value2, "payTotal");
			return this;
		}

		public Criteria andPayTotalNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAY_TOTAL not between", value1, value2, "payTotal");
			return this;
		}

		public Criteria andPayMedicareIsNull() {
			addCriterion("PAY_MEDICARE is null");
			return this;
		}

		public Criteria andPayMedicareIsNotNull() {
			addCriterion("PAY_MEDICARE is not null");
			return this;
		}

		public Criteria andPayMedicareEqualTo(BigDecimal value) {
			addCriterion("PAY_MEDICARE =", value, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareNotEqualTo(BigDecimal value) {
			addCriterion("PAY_MEDICARE <>", value, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareGreaterThan(BigDecimal value) {
			addCriterion("PAY_MEDICARE >", value, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_MEDICARE >=", value, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareLessThan(BigDecimal value) {
			addCriterion("PAY_MEDICARE <", value, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareLessThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_MEDICARE <=", value, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareIn(List<BigDecimal> values) {
			addCriterion("PAY_MEDICARE in", values, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareNotIn(List<BigDecimal> values) {
			addCriterion("PAY_MEDICARE not in", values, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAY_MEDICARE between", value1, value2, "payMedicare");
			return this;
		}

		public Criteria andPayMedicareNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAY_MEDICARE not between", value1, value2,
					"payMedicare");
			return this;
		}

		public Criteria andPayOutmedicareIsNull() {
			addCriterion("PAY_OUTMEDICARE is null");
			return this;
		}

		public Criteria andPayOutmedicareIsNotNull() {
			addCriterion("PAY_OUTMEDICARE is not null");
			return this;
		}

		public Criteria andPayOutmedicareEqualTo(BigDecimal value) {
			addCriterion("PAY_OUTMEDICARE =", value, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareNotEqualTo(BigDecimal value) {
			addCriterion("PAY_OUTMEDICARE <>", value, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareGreaterThan(BigDecimal value) {
			addCriterion("PAY_OUTMEDICARE >", value, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_OUTMEDICARE >=", value, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareLessThan(BigDecimal value) {
			addCriterion("PAY_OUTMEDICARE <", value, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareLessThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_OUTMEDICARE <=", value, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareIn(List<BigDecimal> values) {
			addCriterion("PAY_OUTMEDICARE in", values, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareNotIn(List<BigDecimal> values) {
			addCriterion("PAY_OUTMEDICARE not in", values, "payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAY_OUTMEDICARE between", value1, value2,
					"payOutmedicare");
			return this;
		}

		public Criteria andPayOutmedicareNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAY_OUTMEDICARE not between", value1, value2,
					"payOutmedicare");
			return this;
		}

		public Criteria andPayAssistIsNull() {
			addCriterion("PAY_ASSIST is null");
			return this;
		}

		public Criteria andPayAssistIsNotNull() {
			addCriterion("PAY_ASSIST is not null");
			return this;
		}

		public Criteria andPayAssistEqualTo(BigDecimal value) {
			addCriterion("PAY_ASSIST =", value, "payAssist");
			return this;
		}

		public Criteria andPayAssistNotEqualTo(BigDecimal value) {
			addCriterion("PAY_ASSIST <>", value, "payAssist");
			return this;
		}

		public Criteria andPayAssistGreaterThan(BigDecimal value) {
			addCriterion("PAY_ASSIST >", value, "payAssist");
			return this;
		}

		public Criteria andPayAssistGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_ASSIST >=", value, "payAssist");
			return this;
		}

		public Criteria andPayAssistLessThan(BigDecimal value) {
			addCriterion("PAY_ASSIST <", value, "payAssist");
			return this;
		}

		public Criteria andPayAssistLessThanOrEqualTo(BigDecimal value) {
			addCriterion("PAY_ASSIST <=", value, "payAssist");
			return this;
		}

		public Criteria andPayAssistIn(List<BigDecimal> values) {
			addCriterion("PAY_ASSIST in", values, "payAssist");
			return this;
		}

		public Criteria andPayAssistNotIn(List<BigDecimal> values) {
			addCriterion("PAY_ASSIST not in", values, "payAssist");
			return this;
		}

		public Criteria andPayAssistBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("PAY_ASSIST between", value1, value2, "payAssist");
			return this;
		}

		public Criteria andPayAssistNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAY_ASSIST not between", value1, value2, "payAssist");
			return this;
		}

		public Criteria andMedicareTypeIsNull() {
			addCriterion("MEDICARE_TYPE is null");
			return this;
		}

		public Criteria andMedicareTypeIsNotNull() {
			addCriterion("MEDICARE_TYPE is not null");
			return this;
		}

		public Criteria andMedicareTypeEqualTo(BigDecimal value) {
			addCriterion("MEDICARE_TYPE =", value, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeNotEqualTo(BigDecimal value) {
			addCriterion("MEDICARE_TYPE <>", value, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeGreaterThan(BigDecimal value) {
			addCriterion("MEDICARE_TYPE >", value, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("MEDICARE_TYPE >=", value, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeLessThan(BigDecimal value) {
			addCriterion("MEDICARE_TYPE <", value, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("MEDICARE_TYPE <=", value, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeIn(List<BigDecimal> values) {
			addCriterion("MEDICARE_TYPE in", values, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeNotIn(List<BigDecimal> values) {
			addCriterion("MEDICARE_TYPE not in", values, "medicareType");
			return this;
		}

		public Criteria andMedicareTypeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("MEDICARE_TYPE between", value1, value2,
					"medicareType");
			return this;
		}

		public Criteria andMedicareTypeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("MEDICARE_TYPE not between", value1, value2,
					"medicareType");
			return this;
		}

		public Criteria andPayselfIsNull() {
			addCriterion("PAYSELF is null");
			return this;
		}

		public Criteria andPayselfIsNotNull() {
			addCriterion("PAYSELF is not null");
			return this;
		}

		public Criteria andPayselfEqualTo(BigDecimal value) {
			addCriterion("PAYSELF =", value, "payself");
			return this;
		}

		public Criteria andPayselfNotEqualTo(BigDecimal value) {
			addCriterion("PAYSELF <>", value, "payself");
			return this;
		}

		public Criteria andPayselfGreaterThan(BigDecimal value) {
			addCriterion("PAYSELF >", value, "payself");
			return this;
		}

		public Criteria andPayselfGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("PAYSELF >=", value, "payself");
			return this;
		}

		public Criteria andPayselfLessThan(BigDecimal value) {
			addCriterion("PAYSELF <", value, "payself");
			return this;
		}

		public Criteria andPayselfLessThanOrEqualTo(BigDecimal value) {
			addCriterion("PAYSELF <=", value, "payself");
			return this;
		}

		public Criteria andPayselfIn(List<BigDecimal> values) {
			addCriterion("PAYSELF in", values, "payself");
			return this;
		}

		public Criteria andPayselfNotIn(List<BigDecimal> values) {
			addCriterion("PAYSELF not in", values, "payself");
			return this;
		}

		public Criteria andPayselfBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("PAYSELF between", value1, value2, "payself");
			return this;
		}

		public Criteria andPayselfNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("PAYSELF not between", value1, value2, "payself");
			return this;
		}

		public Criteria andSalmoneyIsNull() {
			addCriterion("SALMONEY is null");
			return this;
		}

		public Criteria andSalmoneyIsNotNull() {
			addCriterion("SALMONEY is not null");
			return this;
		}

		public Criteria andSalmoneyEqualTo(BigDecimal value) {
			addCriterion("SALMONEY =", value, "salmoney");
			return this;
		}

		public Criteria andSalmoneyNotEqualTo(BigDecimal value) {
			addCriterion("SALMONEY <>", value, "salmoney");
			return this;
		}

		public Criteria andSalmoneyGreaterThan(BigDecimal value) {
			addCriterion("SALMONEY >", value, "salmoney");
			return this;
		}

		public Criteria andSalmoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("SALMONEY >=", value, "salmoney");
			return this;
		}

		public Criteria andSalmoneyLessThan(BigDecimal value) {
			addCriterion("SALMONEY <", value, "salmoney");
			return this;
		}

		public Criteria andSalmoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("SALMONEY <=", value, "salmoney");
			return this;
		}

		public Criteria andSalmoneyIn(List<BigDecimal> values) {
			addCriterion("SALMONEY in", values, "salmoney");
			return this;
		}

		public Criteria andSalmoneyNotIn(List<BigDecimal> values) {
			addCriterion("SALMONEY not in", values, "salmoney");
			return this;
		}

		public Criteria andSalmoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("SALMONEY between", value1, value2, "salmoney");
			return this;
		}

		public Criteria andSalmoneyNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("SALMONEY not between", value1, value2, "salmoney");
			return this;
		}

		public Criteria andApprovestsIsNull() {
			addCriterion("APPROVESTS is null");
			return this;
		}

		public Criteria andApprovestsIsNotNull() {
			addCriterion("APPROVESTS is not null");
			return this;
		}

		public Criteria andApprovestsEqualTo(String value) {
			addCriterion("APPROVESTS =", value, "approvests");
			return this;
		}

		public Criteria andApprovestsNotEqualTo(String value) {
			addCriterion("APPROVESTS <>", value, "approvests");
			return this;
		}

		public Criteria andApprovestsGreaterThan(String value) {
			addCriterion("APPROVESTS >", value, "approvests");
			return this;
		}

		public Criteria andApprovestsGreaterThanOrEqualTo(String value) {
			addCriterion("APPROVESTS >=", value, "approvests");
			return this;
		}

		public Criteria andApprovestsLessThan(String value) {
			addCriterion("APPROVESTS <", value, "approvests");
			return this;
		}

		public Criteria andApprovestsLessThanOrEqualTo(String value) {
			addCriterion("APPROVESTS <=", value, "approvests");
			return this;
		}

		public Criteria andApprovestsLike(String value) {
			addCriterion("APPROVESTS like", value, "approvests");
			return this;
		}

		public Criteria andApprovestsNotLike(String value) {
			addCriterion("APPROVESTS not like", value, "approvests");
			return this;
		}

		public Criteria andApprovestsIn(List<String> values) {
			addCriterion("APPROVESTS in", values, "approvests");
			return this;
		}

		public Criteria andApprovestsNotIn(List<String> values) {
			addCriterion("APPROVESTS not in", values, "approvests");
			return this;
		}

		public Criteria andApprovestsBetween(String value1, String value2) {
			addCriterion("APPROVESTS between", value1, value2, "approvests");
			return this;
		}

		public Criteria andApprovestsNotBetween(String value1, String value2) {
			addCriterion("APPROVESTS not between", value1, value2, "approvests");
			return this;
		}

		public Criteria andStsIsNull() {
			addCriterion("STS is null");
			return this;
		}

		public Criteria andStsIsNotNull() {
			addCriterion("STS is not null");
			return this;
		}

		public Criteria andStsEqualTo(String value) {
			addCriterion("STS =", value, "sts");
			return this;
		}

		public Criteria andStsNotEqualTo(String value) {
			addCriterion("STS <>", value, "sts");
			return this;
		}

		public Criteria andStsGreaterThan(String value) {
			addCriterion("STS >", value, "sts");
			return this;
		}

		public Criteria andStsGreaterThanOrEqualTo(String value) {
			addCriterion("STS >=", value, "sts");
			return this;
		}

		public Criteria andStsLessThan(String value) {
			addCriterion("STS <", value, "sts");
			return this;
		}

		public Criteria andStsLessThanOrEqualTo(String value) {
			addCriterion("STS <=", value, "sts");
			return this;
		}

		public Criteria andStsLike(String value) {
			addCriterion("STS like", value, "sts");
			return this;
		}

		public Criteria andStsNotLike(String value) {
			addCriterion("STS not like", value, "sts");
			return this;
		}

		public Criteria andStsIn(List<String> values) {
			addCriterion("STS in", values, "sts");
			return this;
		}

		public Criteria andStsNotIn(List<String> values) {
			addCriterion("STS not in", values, "sts");
			return this;
		}

		public Criteria andStsBetween(String value1, String value2) {
			addCriterion("STS between", value1, value2, "sts");
			return this;
		}

		public Criteria andStsNotBetween(String value1, String value2) {
			addCriterion("STS not between", value1, value2, "sts");
			return this;
		}

		public Criteria andFlagIsNull() {
			addCriterion("FLAG is null");
			return this;
		}

		public Criteria andFlagIsNotNull() {
			addCriterion("FLAG is not null");
			return this;
		}

		public Criteria andFlagEqualTo(String value) {
			addCriterion("FLAG =", value, "flag");
			return this;
		}

		public Criteria andFlagNotEqualTo(String value) {
			addCriterion("FLAG <>", value, "flag");
			return this;
		}

		public Criteria andFlagGreaterThan(String value) {
			addCriterion("FLAG >", value, "flag");
			return this;
		}

		public Criteria andFlagGreaterThanOrEqualTo(String value) {
			addCriterion("FLAG >=", value, "flag");
			return this;
		}

		public Criteria andFlagLessThan(String value) {
			addCriterion("FLAG <", value, "flag");
			return this;
		}

		public Criteria andFlagLessThanOrEqualTo(String value) {
			addCriterion("FLAG <=", value, "flag");
			return this;
		}

		public Criteria andFlagLike(String value) {
			addCriterion("FLAG like", value, "flag");
			return this;
		}

		public Criteria andFlagNotLike(String value) {
			addCriterion("FLAG not like", value, "flag");
			return this;
		}

		public Criteria andFlagIn(List<String> values) {
			addCriterion("FLAG in", values, "flag");
			return this;
		}

		public Criteria andFlagNotIn(List<String> values) {
			addCriterion("FLAG not in", values, "flag");
			return this;
		}

		public Criteria andFlagBetween(String value1, String value2) {
			addCriterion("FLAG between", value1, value2, "flag");
			return this;
		}

		public Criteria andFlagNotBetween(String value1, String value2) {
			addCriterion("FLAG not between", value1, value2, "flag");
			return this;
		}

		public Criteria andMemberIdIsNull() {
			addCriterion("MEMBER_ID is null");
			return this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("MEMBER_ID is not null");
			return this;
		}

		public Criteria andMemberIdEqualTo(String value) {
			addCriterion("MEMBER_ID =", value, "memberId");
			return this;
		}

		public Criteria andMemberIdNotEqualTo(String value) {
			addCriterion("MEMBER_ID <>", value, "memberId");
			return this;
		}

		public Criteria andMemberIdGreaterThan(String value) {
			addCriterion("MEMBER_ID >", value, "memberId");
			return this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
			addCriterion("MEMBER_ID >=", value, "memberId");
			return this;
		}

		public Criteria andMemberIdLessThan(String value) {
			addCriterion("MEMBER_ID <", value, "memberId");
			return this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(String value) {
			addCriterion("MEMBER_ID <=", value, "memberId");
			return this;
		}

		public Criteria andMemberIdLike(String value) {
			addCriterion("MEMBER_ID like", value, "memberId");
			return this;
		}

		public Criteria andMemberIdNotLike(String value) {
			addCriterion("MEMBER_ID not like", value, "memberId");
			return this;
		}

		public Criteria andMemberIdIn(List<String> values) {
			addCriterion("MEMBER_ID in", values, "memberId");
			return this;
		}

		public Criteria andMemberIdNotIn(List<String> values) {
			addCriterion("MEMBER_ID not in", values, "memberId");
			return this;
		}

		public Criteria andMemberIdBetween(String value1, String value2) {
			addCriterion("MEMBER_ID between", value1, value2, "memberId");
			return this;
		}

		public Criteria andMemberIdNotBetween(String value1, String value2) {
			addCriterion("MEMBER_ID not between", value1, value2, "memberId");
			return this;
		}

		public Criteria andMemberTypeIsNull() {
			addCriterion("MEMBER_TYPE is null");
			return this;
		}

		public Criteria andMemberTypeIsNotNull() {
			addCriterion("MEMBER_TYPE is not null");
			return this;
		}

		public Criteria andMemberTypeEqualTo(String value) {
			addCriterion("MEMBER_TYPE =", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotEqualTo(String value) {
			addCriterion("MEMBER_TYPE <>", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeGreaterThan(String value) {
			addCriterion("MEMBER_TYPE >", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
			addCriterion("MEMBER_TYPE >=", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeLessThan(String value) {
			addCriterion("MEMBER_TYPE <", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeLessThanOrEqualTo(String value) {
			addCriterion("MEMBER_TYPE <=", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeLike(String value) {
			addCriterion("MEMBER_TYPE like", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotLike(String value) {
			addCriterion("MEMBER_TYPE not like", value, "memberType");
			return this;
		}

		public Criteria andMemberTypeIn(List<String> values) {
			addCriterion("MEMBER_TYPE in", values, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotIn(List<String> values) {
			addCriterion("MEMBER_TYPE not in", values, "memberType");
			return this;
		}

		public Criteria andMemberTypeBetween(String value1, String value2) {
			addCriterion("MEMBER_TYPE between", value1, value2, "memberType");
			return this;
		}

		public Criteria andMemberTypeNotBetween(String value1, String value2) {
			addCriterion("MEMBER_TYPE not between", value1, value2,
					"memberType");
			return this;
		}
	}
}