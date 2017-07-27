package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Upersyschecknotice;
import com.csii.upp.dto.generate.UpersyschecknoticeExample;

public class UpersyschecknoticeDAO extends BasePayDAO {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int countByExample(UpersyschecknoticeExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("UPERSYSCHECKNOTICE.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int deleteByExample(UpersyschecknoticeExample example) throws SQLException {
        int rows = getSqlMap().delete("UPERSYSCHECKNOTICE.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String checknoticenbr) throws SQLException {
        Upersyschecknotice _key = new Upersyschecknotice();
        _key.setChecknoticenbr(checknoticenbr);
        int rows = getSqlMap().delete("UPERSYSCHECKNOTICE.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static void insert(Upersyschecknotice record) throws SQLException {
        getSqlMap().insert("UPERSYSCHECKNOTICE.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static void insertSelective(Upersyschecknotice record) throws SQLException {
        getSqlMap().insert("UPERSYSCHECKNOTICE.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Upersyschecknotice> selectByExample(UpersyschecknoticeExample example) throws SQLException {
        List<Upersyschecknotice> list = getSqlMap().queryForList("UPERSYSCHECKNOTICE.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static Upersyschecknotice selectByPrimaryKey(String checknoticenbr) throws SQLException {
        Upersyschecknotice _key = new Upersyschecknotice();
        _key.setChecknoticenbr(checknoticenbr);
        Upersyschecknotice record = (Upersyschecknotice) getSqlMap().queryForObject("UPERSYSCHECKNOTICE.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Upersyschecknotice record, UpersyschecknoticeExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("UPERSYSCHECKNOTICE.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int updateByExample(Upersyschecknotice record, UpersyschecknoticeExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("UPERSYSCHECKNOTICE.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Upersyschecknotice record) throws SQLException {
        int rows = getSqlMap().update("UPERSYSCHECKNOTICE.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Upersyschecknotice record) throws SQLException {
        int rows = getSqlMap().update("UPERSYSCHECKNOTICE.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table UPERSYSCHECKNOTICE
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends UpersyschecknoticeExample {
        private Object record;

        public UpdateByExampleParms(Object record, UpersyschecknoticeExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}