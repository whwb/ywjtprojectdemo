package com.jt.manage.service;

import com.jt.common.vo.EasyUIResult;
import com.jt.manage.pojo.Item;

public interface ItemService {

	EasyUIResult findItemByPage(int page, int rows);

	void addItem(Item item,String itemDesc);

	
	
}
