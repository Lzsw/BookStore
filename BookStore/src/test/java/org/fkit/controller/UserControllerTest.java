package org.fkit.controller;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import junittest.junittest;

public class UserControllerTest extends junittest{
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Test
	public void testLogin() {
		User user = userService.login("Jack", "123456");
		if (user!=null){
		System.out.println("登陆成功");
	}else{
		System.out.println("登陆失败");}
	}

}
