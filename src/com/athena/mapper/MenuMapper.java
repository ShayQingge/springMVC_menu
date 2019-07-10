package com.athena.mapper;

import java.util.List;

import com.athena.pojo.Menu;

public interface MenuMapper {
	List<Menu> selByPid(int pid);
}
