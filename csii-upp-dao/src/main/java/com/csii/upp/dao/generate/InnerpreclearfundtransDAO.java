package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Innerpreclearfundtrans;
import com.csii.upp.dto.generate.InnerpreclearfundtransExample;

public class InnerpreclearfundtransDAO extends BasePayDAO {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int countByExample(InnerpreclearfundtransExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("INNERPRECLEARFUNDTRANS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int deleteByExample(InnerpreclearfundtransExample example) throws SQLException {
        int rows = getSqlMap().delete("INNERPRECLEARFUNDTRANS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String innerfundtransnbr) throws SQLException {
        Innerpreclearfundtrans _key = new Innerpreclearfundtrans();
        _key.setInnerfundtransnbr(innerfundtransnbr);
        int rows = getSqlMap().delete("INNERPRECLEARFUNDTRANS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static void insert(Innerpreclearfundtrans record) throws SQLException {
        getSqlMap().insert("INNERPRECLEARFUNDTRANS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static void insertSelective(Innerpreclearfundtrans record) throws SQLException {
        getSqlMap().insert("INNERPRECLEARFUNDTRANS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Innerpreclearfundtrans> selectByExample(InnerpreclearfundtransExample example) throws SQLException {
        List<Innerpreclearfundtrans> list = getSqlMap().queryForList("INNERPRECLEARFUNDTRANS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static Innerpreclearfundtrans selectByPrimaryKey(String innerfundtransnbr) throws SQLException {
        Innerpreclearfundtrans _key = new Innerpreclearfundtrans();
        _key.setInnerfundtransnbr(innerfundtransnbr);
        Innerpreclearfundtrans record = (Innerpreclearfundtrans) getSqlMap().queryForObject("INNERPRECLEARFUNDTRANS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Innerpreclearfundtrans record, InnerpreclearfundtransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("INNERPRECLEARFUNDTRANS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByExample(Innerpreclearfundtrans record, InnerpreclearfundtransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("INNERPRECLEARFUNDTRANS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Innerpreclearfundtrans record) throws SQLException {
        int rows = getSqlMap().update("INNERPRECLEARFUNDTRANS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Innerpreclearfundtrans record) throws SQLException {
        int rows = getSqlMap().update("INNERPRECLEARFUNDTRANS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INNERPRECLEARFUNDTRANS
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends InnerpreclearfundtransExample {
        private Object record;

        public UpdateByExampleParms(Object record, InnerpreclearfundtransExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}