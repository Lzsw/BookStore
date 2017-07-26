package org.fkit.service.impl;

import org.fkit.domain.Admin;
import org.fkit.mapper.AdminMapper;
import org.fkit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

	/**
	 * Admin服务层接口实现类
	 * @Service("adminService")用于将当前类注释为一个Spring的bean，名为adminService
	 * */
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Service("adminService")
	public class AdminServiceImpl implements AdminService {
		
		/**
		 * 自动注入UserMapper
		 * */
		@Autowired
		private AdminMapper adminMapper;

		/**
		 * AdminService接口login方法实现
		 * @see { UserService }
		 * */
		@Transactional(readOnly=true)
		@Override
		public Admin adminlogin(String loginname, String password) {
			return adminMapper.findWithLoginnameAndPassword(loginname, password);
		}
	
}
