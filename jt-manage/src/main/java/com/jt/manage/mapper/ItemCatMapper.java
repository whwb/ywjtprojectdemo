package com.jt.manage.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jt.common.mapper.SysMapper;
import com.jt.manage.pojo.ItemCat;

public interface ItemCatMapper extends SysMapper<ItemCat>{
	@Select("select name from tb_item_cat where id=#{itemId}")
	String queryItemNameById(Long itemId);
	

}
