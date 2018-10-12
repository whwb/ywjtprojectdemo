package com.jt.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jt.common.mapper.SysMapper;
import com.jt.manage.pojo.Item;

public interface ItemMapper extends SysMapper<Item>{

	@Select("select * from tb_item order by updated desc limit #{startIndex},#{rows}")
	List<Item> findItemByPage(@Param("startIndex") int startIndex,
			@Param("rows")int rows);

	
	
}
