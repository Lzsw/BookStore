package org.fkit.domain;

public class Collect{

	/**
	 * 
	 */
	
	private int id;
	private String name;
	private Double price;
	private String image;
	private String loginname;
	private int book_id;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	@Override
	public String toString() {
		return "Collect [id=" + id + ",name=" + name + ", price=" + price + ", image=" + image + ",loginname=" + loginname + ",book_id=" + book_id + "]";
	}

}