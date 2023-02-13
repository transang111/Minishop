package com.sangyen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int productid;
    int categoryid;
    String productname;
    String price;
    String painted;
    String productpicture;
    String fors;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPainted() {
		return painted;
	}
	public void setPainted(String painted) {
		this.painted = painted;
	}
	public String getProductpicture() {
		return productpicture;
	}
	public void setProductpicture(String productpicture) {
		this.productpicture = productpicture;
	}
	public String getFors() {
		return fors;
	}
	public void setFors(String fors) {
		this.fors = fors;
	}
    
    
}
