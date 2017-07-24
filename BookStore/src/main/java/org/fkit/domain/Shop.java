package org.fkit.domain;


import java.io.Serializable;
import java.util.List;


public class Shop implements Serializable {
    public List<Book> getBook(){
    	return book;
    }
    public void setBook(List<Book> book){
    	this.book=book;
    }
	
	private Integer id;//id
	private List<Book> book;
	private Integer book_id;	// book_id
	private String book_name;//book_name
	private Integer count;//count
	private String book_image;//book_image
	private String book_price;
	private String username;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}

	public void setName(String book_name) {
		this.book_name =book_name;
	}
	

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getBook_image() {
		return book_image;
	}

	public void setPicture(String book_image) {
		this.book_image = book_image;
	}
	public String getBook_price() {
		return book_price;
	}
	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString(){
		return"Shop[id="+id+",book="+book+",book_id="+book_id+",book_name="+book_name+",count="+count+",book_image="+book_image+",book_price="+book_price+",username="+username+"]";
	}
	
}
