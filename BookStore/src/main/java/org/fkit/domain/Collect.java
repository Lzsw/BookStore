package org.fkit.domain;

import java.io.Serializable;
import java.util.List;

public class Collect implements Serializable {
    public List<Book> getBook(){
    	return book;
    }
    public void setBook(List<Book> book){
    	this.book=book;
    }
	
	private int id;
	private List<Book> book;
	private Integer book_id;
	private String book_name;
	private String book_price;
	private String book_image;
	private String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_mage() {
		return book_image;
	}
	public void setImage(String book_image) {
		this.book_image = book_image;
	}
	public String getBook_price() {
		return book_price;
	}
	
	public void setPrice(String book_price) {
		this.book_price = book_price;
	}
	
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_ame(String book_name) {
		this.book_name = book_name;
	}
	@Override
	public String toString() {
		return "Collect [id=" + id + ", book_id=" + book_id + ",username=" + username + ",book_name=" + book_name + ",book_price="
				+ book_price + ", book_image=" + book_image + "]";
	}
}