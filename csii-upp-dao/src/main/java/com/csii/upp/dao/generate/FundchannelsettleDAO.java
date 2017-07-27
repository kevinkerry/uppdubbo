package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Fundchannelsettle;
import com.csii.upp.dto.generate.FundchannelsettleExample;

public class FundchannelsettleDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int countByExample(FundchannelsettleExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("FUNDCHANNELSETTLE.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int deleteByExample(FundchannelsettleExample example) throws SQLException {
        int rows = getSqlMap().delete("FUNDCHANNELSETTLE.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String settleseqnbr) throws SQLException {
        Fundchannelsettle _key = new Fundchannelsettle();
        _key.setSettleseqnbr(settleseqnbr);
        int rows = getSqlMap().delete("FUNDCHANNELSETTLE.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static void insert(Fundchannelsettle record) throws SQLException {
        getSqlMap().insert("FUNDCHANNELSETTLE.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static void insertSelective(Fundchannelsettle record) throws SQLException {
        getSqlMap().insert("FUNDCHANNELSETTLE.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Fundchannelsettle> selectByExample(FundchannelsettleExample example) throws SQLException {
        List<Fundchannelsettle> list = getSqlMap().queryForList("FUNDCHANNELSETTLE.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static Fundchannelsettle selectByPrimaryKey(String settleseqnbr) throws SQLException {
        Fundchannelsettle _key = new Fundchannelsettle();
        _key.setSettleseqnbr(settleseqnbr);
        Fundchannelsettle record = (Fundchannelsettle) getSqlMap().queryForObject("FUNDCHANNELSETTLE.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Fundchannelsettle record, FundchannelsettleExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("FUNDCHANNELSETTLE.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int updateByExample(Fundchannelsettle record, FundchannelsettleExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("FUNDCHANNELSETTLE.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Fundchannelsettle record) throws SQLException {
        int rows = getSqlMap().update("FUNDCHANNELSETTLE.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Fundchannelsettle record) throws SQLException {
        int rows = getSqlMap().update("FUNDCHANNELSETTLE.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FUNDCHANNELSETTLE
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends FundchannelsettleExample {
        private Object record;

        public UpdateByExampleParms(Object record, FundchannelsettleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}