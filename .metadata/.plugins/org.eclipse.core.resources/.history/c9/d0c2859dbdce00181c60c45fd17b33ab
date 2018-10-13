package com.jt.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.manage.service.ItemCatService;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	@RequestMapping(value="/queryItemName",produces="text/html;charset=utf-8")
	@ResponseBody
	public String queryItemName(Long itemId){
		String itemCatName=itemCatService.queryItemNameById(itemId);
		return itemCatName;
	}
}
