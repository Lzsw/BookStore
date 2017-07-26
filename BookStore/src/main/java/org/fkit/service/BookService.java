package org.fkit.service;

import java.util.List;

import org.fkit.domain.Book;

/**
 * Book服务层接口
 * */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Book> getAll();
	
	/**
	 * 查找情感类图书
	 * @return Book对象集合
	 * */
	List<Book> getAllqinggan();
	
	/**
	 * 查找励志类图书
	 * @return Book对象集合
	 * */
	List<Book> getAllencouragement();
	
	/**
	 * 查找推理类图书
	 * @return Book对象集合
	 * */
	List<Book> getAllreasoning();
	
	/**
	 * 查找长篇小说类图书
	 * @return Book对象集合
	 * */
	List<Book> getAllnovel();
	
	/**
	 * 查找选择详情商品
	 * @return Book选择详情对象集合
	 */
	 Book getBookDetail(Integer id);
		// TODO Auto-generated method stub
		
	/**
	 * 添加商品
	 * @param Book 用户对象
	 * */
	void addBook(Book book);
	
	/**
	 * 根据id删除商品
	 * @param id 
	 * */
	public void removeBookById(Integer id);
	
	/**
	 * 修改商品
	 * @param Book 用户对象
	 * */
	void modifyBook(Book book);
	
	

}
