package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Fundchannelcleartranshist;
import com.csii.upp.dto.generate.FundchannelcleartranshistExample;

public class FundchannelcleartranshistDAO extends BasePayDAO {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int countByExample(FundchannelcleartranshistExample example)
			throws SQLException {
		Integer count = (Integer) getSqlMap().queryForObject(
				"FUNDCHANNELCLEARTRANSHIST.countByExample", example);
		return count;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int deleteByExample(FundchannelcleartranshistExample example)
			throws SQLException {
		int rows = getSqlMap().delete(
				"FUNDCHANNELCLEARTRANSHIST.deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int deleteByPrimaryKey(String cleartransnbr) throws SQLException {
		Fundchannelcleartranshist _key = new Fundchannelcleartranshist();
		_key.setCleartransnbr(cleartransnbr);
		int rows = getSqlMap().delete(
				"FUNDCHANNELCLEARTRANSHIST.deleteByPrimaryKey", _key);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static void insert(Fundchannelcleartranshist record) throws SQLException {
		getSqlMap().insert("FUNDCHANNELCLEARTRANSHIST.insert", record);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static void insertSelective(Fundchannelcleartranshist record)
			throws SQLException {
		getSqlMap()
				.insert("FUNDCHANNELCLEARTRANSHIST.insertSelective", record);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	@SuppressWarnings("unchecked")
	public static List<Fundchannelcleartranshist> selectByExample(
			FundchannelcleartranshistExample example) throws SQLException {
		List<Fundchannelcleartranshist> list = getSqlMap().queryForList(
				"FUNDCHANNELCLEARTRANSHIST.selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static Fundchannelcleartranshist selectByPrimaryKey(String cleartransnbr)
			throws SQLException {
		Fundchannelcleartranshist _key = new Fundchannelcleartranshist();
		_key.setCleartransnbr(cleartransnbr);
		Fundchannelcleartranshist record = (Fundchannelcleartranshist) getSqlMap()
				.queryForObject("FUNDCHANNELCLEARTRANSHIST.selectByPrimaryKey",
						_key);
		return record;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int updateByExampleSelective(Fundchannelcleartranshist record,
			FundchannelcleartranshistExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMap().update(
				"FUNDCHANNELCLEARTRANSHIST.updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int updateByExample(Fundchannelcleartranshist record,
			FundchannelcleartranshistExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMap().update(
				"FUNDCHANNELCLEARTRANSHIST.updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int updateByPrimaryKeySelective(Fundchannelcleartranshist record)
			throws SQLException {
		int rows = getSqlMap()
				.update("FUNDCHANNELCLEARTRANSHIST.updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	public static int updateByPrimaryKey(Fundchannelcleartranshist record)
			throws SQLException {
		int rows = getSqlMap().update(
				"FUNDCHANNELCLEARTRANSHIST.updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table FUNDCHANNELCLEARTRANSHIST
	 * @mbggenerated
	 */
	protected static class UpdateByExampleParms extends
			FundchannelcleartranshistExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				FundchannelcleartranshistExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}