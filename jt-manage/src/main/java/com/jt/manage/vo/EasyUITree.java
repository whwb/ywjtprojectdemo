package com.jt.manage.vo;
/**
 * 这个vo对象返回给树形结构，形成参数分类列表
 * @author soft01
 *
 */
public class EasyUITree {
	private Long id;
	private String text;
	private String state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
