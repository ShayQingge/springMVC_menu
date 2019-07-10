package com.athena.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.athena.mapper.MenuMapper;
import com.athena.pojo.Menu;
import com.athena.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	@Resource 
	private MenuMapper menuMapper;//从spring容器中通过byname注入bean
	
	@Override
	public List<Menu> show() {
		return menuMapper.selByPid(0);
	}

}
