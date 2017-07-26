package org.fkit.service;

import org.fkit.domain.Admin;

public interface AdminService {
	/**
	 * 判断管理员登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回Admin对象，没有找到返回null
	 * */
	Admin adminlogin(String loginname,String password);
	
}
