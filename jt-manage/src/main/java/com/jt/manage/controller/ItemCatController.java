package com.jt.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.manage.service.ItemCatService;
import com.jt.manage.vo.EasyUITree;


@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	/**
	 * 这个方法根据商品id来查找商品所属的分类
	 * @param itemId 商品的id
	 * @return
	 */
	@RequestMapping(value="/queryItemName",produces="text/html;charset=utf-8")
	@ResponseBody
	public String queryItemName(Long itemId){
		String itemCatName=itemCatService.queryItemNameById(itemId);
		return itemCatName;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITree> queryItemCat(@RequestParam(value="id",defaultValue="0") Long parentId){
		return itemCatService.queryNodeByParentId(parentId);
		
	}
	
}
