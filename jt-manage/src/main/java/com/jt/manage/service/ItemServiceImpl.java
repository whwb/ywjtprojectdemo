package com.jt.manage.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.common.mapper.SysMapper;
import com.jt.common.vo.EasyUIResult;
import com.jt.manage.mapper.ItemMapper;
import com.jt.manage.pojo.Item;
import com.jt.manage.pojo.ItemDesc;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper itemMapper;
	//定义商品的分页信息   easyUIResult 里面定义了两个参数，一个是总记录数total，一个是包含当前页商品所有信息的list集合rows
	//所以如果通过easyUIResult对象传回数据，那么就要对这两个参数赋值
	@Override
	public EasyUIResult findItemByPage(int page, int rows) {
		System.out.println("111");
		//查询总记录数
		int total=itemMapper.selectCount(null);
		//查询当前页 根据起始的id和每页页数，来从数据库查询当前的数据 返回list
		int startIndex=(page-1)*rows;
		List<Item> itemList=itemMapper.findItemByPage(startIndex,rows);
		EasyUIResult easyUIResult = new EasyUIResult(total,itemList);
		System.out.println(easyUIResult.toString());
		return easyUIResult;
	
		
	}
	@Override
	public void addItem(Item item,String Desc) {
		//item 包含了从前端传递过来的数据
		item.setCreated(new Date());
		item.setUpdated(item.getCreated());
		item.setStatus(1);
		//使用通用mapper进行插入工作
		itemMapper.insert(item);
		
		//新建一个itemDesc对象，并对他赋值 ，使用通用mapper
		ItemDesc itemDesc = new ItemDesc();
		itemDesc.setCreated(item.getCreated());
		itemDesc.setItemDesc(Desc);
		itemDesc.setItemId(item.getId());
		itemDesc.setUpdated(item.getCreated());
		
		
	}
	

	

}
