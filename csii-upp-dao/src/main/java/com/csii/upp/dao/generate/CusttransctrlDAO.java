package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Custtransctrl;
import com.csii.upp.dto.generate.CusttransctrlExample;

public class CusttransctrlDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int countByExample(CusttransctrlExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("CUSTTRANSCTRL.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int deleteByExample(CusttransctrlExample example) throws SQLException {
        int rows = getSqlMap().delete("CUSTTRANSCTRL.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String signnbr, String signtypcd) throws SQLException {
        Custtransctrl _key = new Custtransctrl();
        _key.setSignnbr(signnbr);
        _key.setSigntypcd(signtypcd);
        int rows = getSqlMap().delete("CUSTTRANSCTRL.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static void insert(Custtransctrl record) throws SQLException {
        getSqlMap().insert("CUSTTRANSCTRL.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static void insertSelective(Custtransctrl record) throws SQLException {
        getSqlMap().insert("CUSTTRANSCTRL.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Custtransctrl> selectByExample(CusttransctrlExample example) throws SQLException {
        List<Custtransctrl> list = getSqlMap().queryForList("CUSTTRANSCTRL.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static Custtransctrl selectByPrimaryKey(String signnbr, String signtypcd) throws SQLException {
        Custtransctrl _key = new Custtransctrl();
        _key.setSignnbr(signnbr);
        _key.setSigntypcd(signtypcd);
        Custtransctrl record = (Custtransctrl) getSqlMap().queryForObject("CUSTTRANSCTRL.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Custtransctrl record, CusttransctrlExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("CUSTTRANSCTRL.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int updateByExample(Custtransctrl record, CusttransctrlExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("CUSTTRANSCTRL.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Custtransctrl record) throws SQLException {
        int rows = getSqlMap().update("CUSTTRANSCTRL.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Custtransctrl record) throws SQLException {
        int rows = getSqlMap().update("CUSTTRANSCTRL.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CUSTTRANSCTRL
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends CusttransctrlExample {
        private Object record;

        public UpdateByExampleParms(Object record, CusttransctrlExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}