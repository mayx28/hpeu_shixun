package com.xzl.model;

public class Movie {
	private String name;
	private String type;
	private String leadingRole;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLeadingRole() {
		return leadingRole;
	}

	public void setLeadingRole(String leadingRole) {
		this.leadingRole = leadingRole;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 显示电影信息
	 */
	public void showMovie() {
		System.out.println("电影名称\t电影类型\t电影主演\t电影价格");
		System.out.println(name + "\t" + type + "\t" + leadingRole + "\t" + price);
	}

}
