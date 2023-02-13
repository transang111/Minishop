package com.minishop.dto;

public class ProductDto {
	private int id;

	private int categoryid;

	private String name;

	private String price;

	private String painted;

	private String image;

	private String fors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFors() {
		return fors;
	}

	public void setFors(String fors) {
		this.fors = fors;
	}

}
