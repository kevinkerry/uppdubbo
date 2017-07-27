package com.csii.upp.qrcodeplatform.generate.dao;

import com.csii.upp.qrcodeplatform.generate.dao.model.Channeltrans;
import com.csii.upp.qrcodeplatform.generate.dao.model.ChanneltransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChanneltransMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int countByExample(ChanneltransExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int deleteByExample(ChanneltransExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int deleteByPrimaryKey(String transnbr);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int insert(Channeltrans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int insertSelective(Channeltrans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    List<Channeltrans> selectByExample(ChanneltransExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    Channeltrans selectByPrimaryKey(String transnbr);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int updateByExampleSelective(@Param("record") Channeltrans record, @Param("example") ChanneltransExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int updateByExample(@Param("record") Channeltrans record, @Param("example") ChanneltransExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int updateByPrimaryKeySelective(Channeltrans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channeltrans
     *
     * @mbggenerated Mon Jun 19 00:09:08 CST 2017
     */
    int updateByPrimaryKey(Channeltrans record);
}