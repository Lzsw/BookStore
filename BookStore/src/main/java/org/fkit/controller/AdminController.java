package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Admin;
import org.fkit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

	/**
	 * 处理用户请求控制器
	 * */
	@Controller
	public class AdminController {
		
		/**
		 * 自动注入AdminService
		 * */
		@Autowired
		@Qualifier("adminService")
		private AdminService adminService;

		/**
		 * 处理/adminlogin请求
		 * */
		@RequestMapping(value="/adminlogin")
		 public ModelAndView adminlogin(
				 String loginname,String password,
				 ModelAndView mv,
				 HttpSession session){
			// 根据登录名和密码查找管理员，判断管理员登录
			Admin admin = adminService.adminlogin(loginname, password);
			if(admin != null){
				// 登录成功，将user对象设置到HttpSession作用范围域
				session.setAttribute("admin", admin);
				// 转发到index请求
				mv.setView(new RedirectView("./adminbook"));
			}else{
				// 登录失败，设置失败提示信息，并跳转到登录页面
				mv.addObject("message", "登录名或密码错误，请重新输入!");
				mv.setViewName("adminloginForm");
			}
			return mv;
		}
		
}
