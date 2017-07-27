package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.fkit.domain.Book;
import org.fkit.domain.Collect;
import org.fkit.domain.Shop;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理图书请求控制器
 * */
@Controller
public class BookController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/main")
	 public String main(Model model){
		// 获得所有图书集合
		List<Book> book_list = bookService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到main页面
		return "main";
	}
	
	/**
	 * 处理/qinggan请求
	 * */
	@RequestMapping(value="/qinggan")
	 public String qinggan(Model model){
		// 获得情感类图书集合
		List<Book> book_list = bookService.getAllqinggan();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到qingganForm页面
		return "qinggan";
	}
	
	/**
	 * 处理/encouragement请求
	 * */
	@RequestMapping(value="/encouragement")
	 public String lizhi(Model model){
		// 获得励志类图书集合
		List<Book> book_list = bookService.getAllencouragement();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到encouragement页面
		return "encouragement";
	}
	
	/**
	 * 处理/reasoning请求
	 * */
	@RequestMapping(value="/reasoning")
	 public String tuili(Model model){
		// 获得推理类图书集合
		List<Book> book_list = bookService.getAllreasoning();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到reasoning页面
		return "reasoning";
	}
	
	/**
	 * 处理/novel请求
	 * */
	@RequestMapping(value="/novel")
	 public String changpian(Model model){
		// 获得长篇小说类图书集合
		List<Book> book_list = bookService.getAllnovel();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到novel页面
		return "novel";
	}
	
	/**
	 * 处理/detail/{id}
	 */
	@RequestMapping(value="/bookdetail")
	public ModelAndView detail(@RequestParam("id") Integer id, Model model,ModelAndView mv){
		Book book = bookService.getBookDetail(id);
		mv.addObject("book",book);
		mv.setViewName("bookdetail");
		return mv;
		
	}
	
	/**
	 * 处理添加请求
	 * @param Book book 要添加书本的对象
	 * @param ModelAndView mv
	 **/
	@RequestMapping(value = "/addBook")
	public ModelAndView addBook(
			@ModelAttribute Book book,MultipartFile image1,MultipartFile picture1,
			ModelAndView mv) throws Exception{
		String image=image1.getOriginalFilename();
		String picture=picture1.getOriginalFilename();
		book.setImage(image);
		book.setPicture(picture);
		bookService.addBook(book);
		mv.setViewName("addbook");
		return mv;
	}
	
	
	/**
	 * 处理删除请求
	 * @param String ids 需要删除书本的id字符串
	 * @param ModelAndView mv
	 **/
	@RequestMapping(value="/removeBook")
	public String removeBook(Model model,HttpServletRequest request){
		String id = request.getParameter("id");
		int id_ = Integer.parseInt(id);
		bookService.removeBook(id_);
		List<Book> book_list = bookService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到cart页面
		return "deletebook";
	}
	
	
	/**
	 * 处理修改请求
	 * @param Book book 要修改书本的对象
	 * @param ModelAndView mv
	 **/
	@RequestMapping(value = "/updateBook")
	public ModelAndView updateBook(
			@ModelAttribute Book book,
			ModelAndView mv){
				bookService.modifyBook(book);
		mv.setViewName("updatebook");
		return mv;
	}
	/**
	 * 处理/deletebook请求
	 * */
	@RequestMapping(value="/deletebook")
	 public String deletebook(Model model){
		// 获得所有图书集合
		List<Book> book_list = bookService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到main页面
		return "deletebook";
	}
}
