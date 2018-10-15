package com.jt.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.common.vo.EasyUIResult;
import com.jt.common.vo.SysResult;
import com.jt.manage.pojo.Item;
import com.jt.manage.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private  ItemService itemService;
	//返回一个包装过的easyUIResult 
	@RequestMapping("/query")
	@ResponseBody
	public EasyUIResult findItemByPage(int page,int rows){
		
		return itemService.findItemByPage(page,rows);
	}

	/**定义一个新增商品的方法，从前端传过来json字符串 处理完之后给前端传递一个sysResult 对象，包含，状态码和信息
	 * 
	 */
	@RequestMapping("/save")
	@ResponseBody
	public SysResult saveItem(Item item,String itemDesc){
		try {
			itemService.addItem(item,itemDesc);
			return SysResult.oK();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SysResult.build(201, "商品新增失败");
		
	}
	
	
}
