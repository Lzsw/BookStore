package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import junittest.junittest;

public class BookControllerTest extends junittest{
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Test
	public void testMain() {
		List<Book> book_list = bookService.getAll();
		System.out.println("测试所有图书");
		System.out.println(book_list);
	}

	@Test
	public void testQinggan() {
		List<Book> book_list = bookService.getAllqinggan();
		System.out.println("测试情感类图书");
		System.out.println(book_list);
	}

	@Test
	public void testLizhi() {
		List<Book> book_list = bookService.getAllencouragement();
		System.out.println("测试励志类图书");
		System.out.println(book_list);
	}

	@Test
	public void testTuili() {
		List<Book> book_list = bookService.getAllreasoning();
		System.out.println("测试推理类图书");
		System.out.println(book_list);
	}

	@Test
	public void testChangpian() {
		List<Book> book_list = bookService.getAllnovel();
		System.out.println("测试长篇小说类图书");
		System.out.println(book_list);
	}
	
}
