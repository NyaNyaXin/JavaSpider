package com.cx.spider.dao;

import com.cx.spider.bean.Office;
import com.cx.spider.bean.OfficeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeMapper {

	long countByExample(OfficeExample example);

	int deleteByExample(OfficeExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Office record);

	int insertSelective(Office record);

	List<Office> selectByExample(OfficeExample example);

	Office selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Office record, @Param("example") OfficeExample example);

	int updateByExample(@Param("record") Office record, @Param("example") OfficeExample example);

	int updateByPrimaryKey(Office record);
}