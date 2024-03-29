package com.athena.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.athena.pojo.Menu;
import com.athena.service.MenuService;

@Controller
public class MenuController {
	/**
	 * springmvc��������spring����������
	 */
	@Resource 
	private MenuService menuServiceImpl;
	
	@RequestMapping("show")
	@ResponseBody
	public List<Menu> show(){
		return menuServiceImpl.show();
	}
}