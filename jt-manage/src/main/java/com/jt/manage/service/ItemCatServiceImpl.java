package com.jt.manage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.manage.mapper.ItemCatMapper;
import com.jt.manage.pojo.ItemCat;
import com.jt.manage.vo.EasyUITree;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public String queryItemNameById(Long itemId) {
		String itemCatName=itemCatMapper.queryItemNameById(itemId);
		
		return itemCatName;
	}
	
	@Override
	public List<EasyUITree> queryNodeByParentId(Long parentId) {
		ItemCat itemCat = new ItemCat();
		itemCat.setParentId(parentId);
		List<ItemCat> itemCatList = itemCatMapper.select(itemCat);
		List<EasyUITree>  easyUITreeList=new ArrayList<>();
		for(ItemCat temp:itemCatList){
			EasyUITree easyUITree = new EasyUITree();
			easyUITree.setId(temp.getId());
			easyUITree.setText(temp.getName());
			//解释state：节点状态，'open' 或 'closed'，默认是 'open'。当设置为 'closed' 时，
			//该节点有子节点，并且将从远程站点加载它们。
			String state=temp.getIsParent()?"closed":"open";
			easyUITree.setState(state);
			easyUITreeList.add(easyUITree);
		}
		return easyUITreeList;
	}
	
	

}
