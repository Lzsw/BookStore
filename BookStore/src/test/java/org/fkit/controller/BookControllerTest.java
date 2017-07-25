package org.fkit.controller;

import static org.junit.Assert.*;

import org.fkit.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BookControllerTest {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testQinggan() {
		fail("Not yet implemented");
	}

	@Test
	public void testLizhi() {
		fail("Not yet implemented");
	}

	@Test
	public void testTuili() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangpian() {
		fail("Not yet implemented");
	}

	@Test
	public void testDetail() {
		fail("Not yet implemented");
	}

}
