package com.jt.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.manage.mapper.ItemCatMapper;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public String queryItemNameById(Long itemId) {
		String itemCatName=itemCatMapper.queryItemNameById(itemId);
		
		return itemCatName;
	}
	
	

}
