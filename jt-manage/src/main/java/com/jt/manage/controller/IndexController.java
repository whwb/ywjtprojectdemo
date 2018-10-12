package com.jt.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	//利用restful风格的路径来接收参数
	//用注解来接收参数
	@RequestMapping("/page/{moduleName}")
	public String item_add(@PathVariable String moduleName){
		return moduleName;
	}
	
	
	
	
}
