package com.project.jk.common;

public class OrderPage {


	private String s_name;
	private String p_photo1;
	private String p_name;
	private int p_price;
	private int o_quantidey;
	private int sumPrice;

	
	public OrderPage() {
		// TODO Auto-generated constructor stub
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public String getP_photo1() {
		return p_photo1;
	}


	public void setP_photo1(String p_photo1) {
		this.p_photo1 = p_photo1;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}


	public int getP_price() {
		return p_price;
	}


	public void setP_price(int p_price) {
		this.p_price = p_price;
	}


	public int getO_quantidey() {
		return o_quantidey;
	}


	public void setO_quantidey(int o_quantidey) {
		this.o_quantidey = o_quantidey;
	}


	public int getSumPrice() {
		return sumPrice;
	}


	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}


	public OrderPage(String s_name, String p_photo1, String p_name, int p_price, int o_quantidey, int sumPrice) {
		super();
		this.s_name = s_name;
		this.p_photo1 = p_photo1;
		this.p_name = p_name;
		this.p_price = p_price;
		this.o_quantidey = o_quantidey;
		this.sumPrice = sumPrice;
	}
	
	
	
}
