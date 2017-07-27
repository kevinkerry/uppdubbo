package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Merplatformsetting;
import com.csii.upp.dto.generate.MerplatformsettingExample;

public class MerplatformsettingDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int countByExample(MerplatformsettingExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("MERPLATFORMSETTING.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int deleteByExample(MerplatformsettingExample example) throws SQLException {
        int rows = getSqlMap().delete("MERPLATFORMSETTING.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String merplatformnbr) throws SQLException {
        Merplatformsetting _key = new Merplatformsetting();
        _key.setMerplatformnbr(merplatformnbr);
        int rows = getSqlMap().delete("MERPLATFORMSETTING.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static void insert(Merplatformsetting record) throws SQLException {
        getSqlMap().insert("MERPLATFORMSETTING.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static void insertSelective(Merplatformsetting record) throws SQLException {
        getSqlMap().insert("MERPLATFORMSETTING.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Merplatformsetting> selectByExample(MerplatformsettingExample example) throws SQLException {
        List<Merplatformsetting> list = getSqlMap().queryForList("MERPLATFORMSETTING.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static Merplatformsetting selectByPrimaryKey(String merplatformnbr) throws SQLException {
        Merplatformsetting _key = new Merplatformsetting();
        _key.setMerplatformnbr(merplatformnbr);
        Merplatformsetting record = (Merplatformsetting) getSqlMap().queryForObject("MERPLATFORMSETTING.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Merplatformsetting record, MerplatformsettingExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("MERPLATFORMSETTING.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int updateByExample(Merplatformsetting record, MerplatformsettingExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("MERPLATFORMSETTING.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Merplatformsetting record) throws SQLException {
        int rows = getSqlMap().update("MERPLATFORMSETTING.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Merplatformsetting record) throws SQLException {
        int rows = getSqlMap().update("MERPLATFORMSETTING.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MERPLATFORMSETTING
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends MerplatformsettingExample {
        private Object record;

        public UpdateByExampleParms(Object record, MerplatformsettingExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}