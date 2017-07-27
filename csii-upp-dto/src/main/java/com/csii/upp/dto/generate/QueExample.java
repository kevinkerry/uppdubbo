package com.csii.upp.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class QueExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table QUE
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table QUE
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table QUE
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public QueExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	protected QueExample(QueExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
		this.distinct = example.distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUE
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table QUE
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected GeneratedCriteria() {
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

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andQuenbrIsNull() {
			addCriterion("QUENBR is null");
			return (Criteria) this;
		}

		public Criteria andQuenbrIsNotNull() {
			addCriterion("QUENBR is not null");
			return (Criteria) this;
		}

		public Criteria andQuenbrEqualTo(Long value) {
			addCriterion("QUENBR =", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrNotEqualTo(Long value) {
			addCriterion("QUENBR <>", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrGreaterThan(Long value) {
			addCriterion("QUENBR >", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrGreaterThanOrEqualTo(Long value) {
			addCriterion("QUENBR >=", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrLessThan(Long value) {
			addCriterion("QUENBR <", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrLessThanOrEqualTo(Long value) {
			addCriterion("QUENBR <=", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrIn(List<Long> values) {
			addCriterion("QUENBR in", values, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrNotIn(List<Long> values) {
			addCriterion("QUENBR not in", values, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrBetween(Long value1, Long value2) {
			addCriterion("QUENBR between", value1, value2, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrNotBetween(Long value1, Long value2) {
			addCriterion("QUENBR not between", value1, value2, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuetypcdIsNull() {
			addCriterion("QUETYPCD is null");
			return (Criteria) this;
		}

		public Criteria andQuetypcdIsNotNull() {
			addCriterion("QUETYPCD is not null");
			return (Criteria) this;
		}

		public Criteria andQuetypcdEqualTo(String value) {
			addCriterion("QUETYPCD =", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdNotEqualTo(String value) {
			addCriterion("QUETYPCD <>", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdGreaterThan(String value) {
			addCriterion("QUETYPCD >", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdGreaterThanOrEqualTo(String value) {
			addCriterion("QUETYPCD >=", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdLessThan(String value) {
			addCriterion("QUETYPCD <", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdLessThanOrEqualTo(String value) {
			addCriterion("QUETYPCD <=", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdLike(String value) {
			addCriterion("QUETYPCD like", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdNotLike(String value) {
			addCriterion("QUETYPCD not like", value, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdIn(List<String> values) {
			addCriterion("QUETYPCD in", values, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdNotIn(List<String> values) {
			addCriterion("QUETYPCD not in", values, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdBetween(String value1, String value2) {
			addCriterion("QUETYPCD between", value1, value2, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuetypcdNotBetween(String value1, String value2) {
			addCriterion("QUETYPCD not between", value1, value2, "quetypcd");
			return (Criteria) this;
		}

		public Criteria andQuedescIsNull() {
			addCriterion("QUEDESC is null");
			return (Criteria) this;
		}

		public Criteria andQuedescIsNotNull() {
			addCriterion("QUEDESC is not null");
			return (Criteria) this;
		}

		public Criteria andQuedescEqualTo(String value) {
			addCriterion("QUEDESC =", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescNotEqualTo(String value) {
			addCriterion("QUEDESC <>", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescGreaterThan(String value) {
			addCriterion("QUEDESC >", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescGreaterThanOrEqualTo(String value) {
			addCriterion("QUEDESC >=", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescLessThan(String value) {
			addCriterion("QUEDESC <", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescLessThanOrEqualTo(String value) {
			addCriterion("QUEDESC <=", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescLike(String value) {
			addCriterion("QUEDESC like", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescNotLike(String value) {
			addCriterion("QUEDESC not like", value, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescIn(List<String> values) {
			addCriterion("QUEDESC in", values, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescNotIn(List<String> values) {
			addCriterion("QUEDESC not in", values, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescBetween(String value1, String value2) {
			addCriterion("QUEDESC between", value1, value2, "quedesc");
			return (Criteria) this;
		}

		public Criteria andQuedescNotBetween(String value1, String value2) {
			addCriterion("QUEDESC not between", value1, value2, "quedesc");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintIsNull() {
			addCriterion("DATELASTMAINT is null");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintIsNotNull() {
			addCriterion("DATELASTMAINT is not null");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintEqualTo(Date value) {
			addCriterion("DATELASTMAINT =", value, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintNotEqualTo(Date value) {
			addCriterion("DATELASTMAINT <>", value, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintGreaterThan(Date value) {
			addCriterion("DATELASTMAINT >", value, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintGreaterThanOrEqualTo(Date value) {
			addCriterion("DATELASTMAINT >=", value, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintLessThan(Date value) {
			addCriterion("DATELASTMAINT <", value, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintLessThanOrEqualTo(Date value) {
			addCriterion("DATELASTMAINT <=", value, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintIn(List<Date> values) {
			addCriterion("DATELASTMAINT in", values, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintNotIn(List<Date> values) {
			addCriterion("DATELASTMAINT not in", values, "datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintBetween(Date value1, Date value2) {
			addCriterion("DATELASTMAINT between", value1, value2,
					"datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
			addCriterion("DATELASTMAINT not between", value1, value2,
					"datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastrunIsNull() {
			addCriterion("DATELASTRUN is null");
			return (Criteria) this;
		}

		public Criteria andDatelastrunIsNotNull() {
			addCriterion("DATELASTRUN is not null");
			return (Criteria) this;
		}

		public Criteria andDatelastrunEqualTo(Date value) {
			addCriterionForJDBCDate("DATELASTRUN =", value, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunNotEqualTo(Date value) {
			addCriterionForJDBCDate("DATELASTRUN <>", value, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunGreaterThan(Date value) {
			addCriterionForJDBCDate("DATELASTRUN >", value, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("DATELASTRUN >=", value, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunLessThan(Date value) {
			addCriterionForJDBCDate("DATELASTRUN <", value, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("DATELASTRUN <=", value, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunIn(List<Date> values) {
			addCriterionForJDBCDate("DATELASTRUN in", values, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunNotIn(List<Date> values) {
			addCriterionForJDBCDate("DATELASTRUN not in", values, "datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("DATELASTRUN between", value1, value2,
					"datelastrun");
			return (Criteria) this;
		}

		public Criteria andDatelastrunNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("DATELASTRUN not between", value1, value2,
					"datelastrun");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeIsNull() {
			addCriterion("STARTDATETIME is null");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeIsNotNull() {
			addCriterion("STARTDATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeEqualTo(Date value) {
			addCriterion("STARTDATETIME =", value, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeNotEqualTo(Date value) {
			addCriterion("STARTDATETIME <>", value, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeGreaterThan(Date value) {
			addCriterion("STARTDATETIME >", value, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("STARTDATETIME >=", value, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeLessThan(Date value) {
			addCriterion("STARTDATETIME <", value, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("STARTDATETIME <=", value, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeIn(List<Date> values) {
			addCriterion("STARTDATETIME in", values, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeNotIn(List<Date> values) {
			addCriterion("STARTDATETIME not in", values, "startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeBetween(Date value1, Date value2) {
			addCriterion("STARTDATETIME between", value1, value2,
					"startdatetime");
			return (Criteria) this;
		}

		public Criteria andStartdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("STARTDATETIME not between", value1, value2,
					"startdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeIsNull() {
			addCriterion("STOPDATETIME is null");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeIsNotNull() {
			addCriterion("STOPDATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeEqualTo(Date value) {
			addCriterion("STOPDATETIME =", value, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeNotEqualTo(Date value) {
			addCriterion("STOPDATETIME <>", value, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeGreaterThan(Date value) {
			addCriterion("STOPDATETIME >", value, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("STOPDATETIME >=", value, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeLessThan(Date value) {
			addCriterion("STOPDATETIME <", value, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("STOPDATETIME <=", value, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeIn(List<Date> values) {
			addCriterion("STOPDATETIME in", values, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeNotIn(List<Date> values) {
			addCriterion("STOPDATETIME not in", values, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeBetween(Date value1, Date value2) {
			addCriterion("STOPDATETIME between", value1, value2, "stopdatetime");
			return (Criteria) this;
		}

		public Criteria andStopdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("STOPDATETIME not between", value1, value2,
					"stopdatetime");
			return (Criteria) this;
		}

		public Criteria andSeqnbrIsNull() {
			addCriterion("SEQNBR is null");
			return (Criteria) this;
		}

		public Criteria andSeqnbrIsNotNull() {
			addCriterion("SEQNBR is not null");
			return (Criteria) this;
		}

		public Criteria andSeqnbrEqualTo(Long value) {
			addCriterion("SEQNBR =", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrNotEqualTo(Long value) {
			addCriterion("SEQNBR <>", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrGreaterThan(Long value) {
			addCriterion("SEQNBR >", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrGreaterThanOrEqualTo(Long value) {
			addCriterion("SEQNBR >=", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrLessThan(Long value) {
			addCriterion("SEQNBR <", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrLessThanOrEqualTo(Long value) {
			addCriterion("SEQNBR <=", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrIn(List<Long> values) {
			addCriterion("SEQNBR in", values, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrNotIn(List<Long> values) {
			addCriterion("SEQNBR not in", values, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrBetween(Long value1, Long value2) {
			addCriterion("SEQNBR between", value1, value2, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrNotBetween(Long value1, Long value2) {
			addCriterion("SEQNBR not between", value1, value2, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andAutorunIsNull() {
			addCriterion("AUTORUN is null");
			return (Criteria) this;
		}

		public Criteria andAutorunIsNotNull() {
			addCriterion("AUTORUN is not null");
			return (Criteria) this;
		}

		public Criteria andAutorunEqualTo(String value) {
			addCriterion("AUTORUN =", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunNotEqualTo(String value) {
			addCriterion("AUTORUN <>", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunGreaterThan(String value) {
			addCriterion("AUTORUN >", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunGreaterThanOrEqualTo(String value) {
			addCriterion("AUTORUN >=", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunLessThan(String value) {
			addCriterion("AUTORUN <", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunLessThanOrEqualTo(String value) {
			addCriterion("AUTORUN <=", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunLike(String value) {
			addCriterion("AUTORUN like", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunNotLike(String value) {
			addCriterion("AUTORUN not like", value, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunIn(List<String> values) {
			addCriterion("AUTORUN in", values, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunNotIn(List<String> values) {
			addCriterion("AUTORUN not in", values, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunBetween(String value1, String value2) {
			addCriterion("AUTORUN between", value1, value2, "autorun");
			return (Criteria) this;
		}

		public Criteria andAutorunNotBetween(String value1, String value2) {
			addCriterion("AUTORUN not between", value1, value2, "autorun");
			return (Criteria) this;
		}

		public Criteria andCornexperessIsNull() {
			addCriterion("CORNEXPERESS is null");
			return (Criteria) this;
		}

		public Criteria andCornexperessIsNotNull() {
			addCriterion("CORNEXPERESS is not null");
			return (Criteria) this;
		}

		public Criteria andCornexperessEqualTo(String value) {
			addCriterion("CORNEXPERESS =", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessNotEqualTo(String value) {
			addCriterion("CORNEXPERESS <>", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessGreaterThan(String value) {
			addCriterion("CORNEXPERESS >", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessGreaterThanOrEqualTo(String value) {
			addCriterion("CORNEXPERESS >=", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessLessThan(String value) {
			addCriterion("CORNEXPERESS <", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessLessThanOrEqualTo(String value) {
			addCriterion("CORNEXPERESS <=", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessLike(String value) {
			addCriterion("CORNEXPERESS like", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessNotLike(String value) {
			addCriterion("CORNEXPERESS not like", value, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessIn(List<String> values) {
			addCriterion("CORNEXPERESS in", values, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessNotIn(List<String> values) {
			addCriterion("CORNEXPERESS not in", values, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessBetween(String value1, String value2) {
			addCriterion("CORNEXPERESS between", value1, value2, "cornexperess");
			return (Criteria) this;
		}

		public Criteria andCornexperessNotBetween(String value1, String value2) {
			addCriterion("CORNEXPERESS not between", value1, value2,
					"cornexperess");
			return (Criteria) this;
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUE
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}