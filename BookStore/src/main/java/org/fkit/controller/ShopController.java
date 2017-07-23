package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.fkit.domain.Shop;
import org.fkit.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("shopService")
	private ShopService shopService;
	
	@RequestMapping(value = "/cart")
	public String cart(Model model) {
		
		// 获得所有图书集合
		List<Shop> shop_list = shopService.getAll();
		// 将图书集合添加到model当中
		
		model.addAttribute("shop_list", shop_list);
		// 跳转到cart页面
		return "cart";
	
	}
	
	@RequestMapping(value = "/save")
	public String save(HttpServletRequest request,Model model) {
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		Shop shop=shopService.findShop(book_id_);
		if (shop == null) {
			shopService.saveShop(book_id_);
		}else {			
			shopService.addShop(book_id_);	
		}
		List<Shop> shop_list = shopService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("shop_list", shop_list);
		// 跳转到cart页面
		return "cart";
	}
	
	//从购物车里减少数量
	@RequestMapping(value="/reduce")
	public String reduce(Model model,HttpServletRequest request){
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		shopService.reduceShop(book_id_);
		List<Shop> shop_list = shopService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("shop_list", shop_list);
		// 跳转到cart页面
		return "cart";
	}
	//从购物车里增加数量
		@RequestMapping(value="/increase")
		public String increase(Model model,HttpServletRequest request){
			String book_id = request.getParameter("book_id");
			int book_id_ = Integer.parseInt(book_id);
			shopService.increaseShop(book_id_);
			List<Shop> shop_list = shopService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("shop_list", shop_list);
			// 跳转到cart页面
			return "cart";
		}
	//取消购物车的东西
	@RequestMapping(value="/remove")
	public String remove(Model model,HttpServletRequest request){
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		shopService.removeShop(book_id_);
		List<Shop> shop_list = shopService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("shop_list", shop_list);
		// 跳转到cart页面
		return "cart";
	}
	
}
