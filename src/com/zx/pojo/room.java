package com.zx.pojo;

public class room {
	private int type;
	private double price;
	private String info;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	public room(int type, double price, String info, int id) {
		super();
		this.type = type;
		this.price = price;
		this.info = info;
		this.id = id;
	}
	public room() {
		super();
	}
	@Override
	public String toString() {
		return "room [id=" + id + ", type=" + type + ", price=" + price + ", info=" + info + ", id=" + id
				+ "]";
	}
	
}

