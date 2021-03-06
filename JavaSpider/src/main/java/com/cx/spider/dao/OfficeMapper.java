package com.cx.spider.dao;

import com.cx.spider.bean.Office;
import com.cx.spider.bean.OfficeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    long countByExample(OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int deleteByExample(OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int insert(Office record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int insertSelective(Office record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    List<Office> selectByExample(OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    Office selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int updateByExampleSelective(@Param("record") Office record, @Param("example") OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int updateByExample(@Param("record") Office record, @Param("example") OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int updateByPrimaryKeySelective(Office record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table java_recruitment_msg
     *
     * @mbg.generated Wed Jun 28 17:17:02 CST 2017
     */
    int updateByPrimaryKey(Office record);

	void deleteAll();
}