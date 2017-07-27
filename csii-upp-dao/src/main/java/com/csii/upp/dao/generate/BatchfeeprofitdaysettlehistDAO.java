package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Batchfeeprofitdaysettlehist;
import com.csii.upp.dto.generate.BatchfeeprofitdaysettlehistExample;

public class BatchfeeprofitdaysettlehistDAO extends BasePayDAO{

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int countByExample(BatchfeeprofitdaysettlehistExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("BATCHFEEPROFITDAYSETTLEHIST.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int deleteByExample(BatchfeeprofitdaysettlehistExample example) throws SQLException {
        int rows = getSqlMap().delete("BATCHFEEPROFITDAYSETTLEHIST.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int deleteByPrimaryKey(String settleseqnbr) throws SQLException {
        Batchfeeprofitdaysettlehist _key = new Batchfeeprofitdaysettlehist();
        _key.setSettleseqnbr(settleseqnbr);
        int rows = getSqlMap().delete("BATCHFEEPROFITDAYSETTLEHIST.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  void insert(Batchfeeprofitdaysettlehist record) throws SQLException {
        getSqlMap().insert("BATCHFEEPROFITDAYSETTLEHIST.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  void insertSelective(Batchfeeprofitdaysettlehist record) throws SQLException {
        getSqlMap().insert("BATCHFEEPROFITDAYSETTLEHIST.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static  List<Batchfeeprofitdaysettlehist> selectByExample(BatchfeeprofitdaysettlehistExample example) throws SQLException {
        List<Batchfeeprofitdaysettlehist> list = getSqlMap().queryForList("BATCHFEEPROFITDAYSETTLEHIST.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  Batchfeeprofitdaysettlehist selectByPrimaryKey(String settleseqnbr) throws SQLException {
        Batchfeeprofitdaysettlehist _key = new Batchfeeprofitdaysettlehist();
        _key.setSettleseqnbr(settleseqnbr);
        Batchfeeprofitdaysettlehist record = (Batchfeeprofitdaysettlehist) getSqlMap().queryForObject("BATCHFEEPROFITDAYSETTLEHIST.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int updateByExampleSelective(Batchfeeprofitdaysettlehist record, BatchfeeprofitdaysettlehistExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("BATCHFEEPROFITDAYSETTLEHIST.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int updateByExample(Batchfeeprofitdaysettlehist record, BatchfeeprofitdaysettlehistExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("BATCHFEEPROFITDAYSETTLEHIST.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int updateByPrimaryKeySelective(Batchfeeprofitdaysettlehist record) throws SQLException {
        int rows = getSqlMap().update("BATCHFEEPROFITDAYSETTLEHIST.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    public static  int updateByPrimaryKey(Batchfeeprofitdaysettlehist record) throws SQLException {
        int rows = getSqlMap().update("BATCHFEEPROFITDAYSETTLEHIST.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BATCHFEEPROFITDAYSETTLEHIST
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends BatchfeeprofitdaysettlehistExample {
        private Object record;

        public UpdateByExampleParms(Object record, BatchfeeprofitdaysettlehistExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}