package com.jt.manage.service;

import java.util.List;

import com.jt.manage.vo.EasyUITree;

public interface ItemCatService {

	String queryItemNameById(Long itemId);

	List<EasyUITree> queryNodeByParentId(Long parentId);

	
}
