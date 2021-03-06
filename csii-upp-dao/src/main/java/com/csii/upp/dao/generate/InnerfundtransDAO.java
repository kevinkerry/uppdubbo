package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Innerfundtrans;
import com.csii.upp.dto.generate.InnerfundtransExample;
import com.csii.upp.supportor.IDGenerateFactory;
import com.csii.upp.util.StringUtil;

public class InnerfundtransDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int countByExample(InnerfundtransExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("INNERFUNDTRANS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int deleteByExample(InnerfundtransExample example) throws SQLException {
        int rows = getSqlMap().delete("INNERFUNDTRANS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String innerfundtransnbr) throws SQLException {
        Innerfundtrans _key = new Innerfundtrans();
        _key.setInnerfundtransnbr(innerfundtransnbr);
        int rows = getSqlMap().delete("INNERFUNDTRANS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static void insert(Innerfundtrans record) throws SQLException {
    	if(StringUtil.isStringEmpty(record.getInnerfundtransnbr())){
    		record.setInnerfundtransnbr(IDGenerateFactory.generateInnerFundTransNbr());
    	}
        getSqlMap().insert("INNERFUNDTRANS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static void insertSelective(Innerfundtrans record) throws SQLException {
    	if(StringUtil.isStringEmpty(record.getInnerfundtransnbr())){
    		record.setInnerfundtransnbr(IDGenerateFactory.generateInnerFundTransNbr());
    	}
        getSqlMap().insert("INNERFUNDTRANS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Innerfundtrans> selectByExample(InnerfundtransExample example) throws SQLException {
        List<Innerfundtrans> list = getSqlMap().queryForList("INNERFUNDTRANS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static Innerfundtrans selectByPrimaryKey(String innerfundtransnbr) throws SQLException {
        Innerfundtrans _key = new Innerfundtrans();
        _key.setInnerfundtransnbr(innerfundtransnbr);
        Innerfundtrans record = (Innerfundtrans) getSqlMap().queryForObject("INNERFUNDTRANS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Innerfundtrans record, InnerfundtransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("INNERFUNDTRANS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByExample(Innerfundtrans record, InnerfundtransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("INNERFUNDTRANS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Innerfundtrans record) throws SQLException {
        int rows = getSqlMap().update("INNERFUNDTRANS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Innerfundtrans record) throws SQLException {
        int rows = getSqlMap().update("INNERFUNDTRANS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INNERFUNDTRANS
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends InnerfundtransExample {
        private Object record;

        public UpdateByExampleParms(Object record, InnerfundtransExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}