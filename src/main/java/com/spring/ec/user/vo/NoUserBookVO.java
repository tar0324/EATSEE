package com.spring.ec.user.vo;

import java.sql.Date;
import java.sql.Time;

import org.springframework.stereotype.Component;

@Component("nouserbookVO")
public class NoUserBookVO {
	private int book_num;
	private String seller_id;
	private String seller_name;
	private String user_name;
	private Date reserv_date;
	private Time reserv_time;
	private String user_tel;
	private int count_pp;
	private String user_email;
	private int reserv_pay;
	private Date reg_date;
	private String order_id;
	private int reserv_status;

	public NoUserBookVO() {
		
	}
	public NoUserBookVO(int book_num, String seller_id, String seller_name, String user_name,Date reserv_date,Time reserv_time, String user_tel, int count_pp,String user_email, int reserv_pay,Date reg_date, String order_id,int reserv_status) {
		
	}


	public int getBook_num() {
		return book_num;
	}


	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}


	public String getSeller_id() {
		return seller_id;
	}


	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	
	


	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public Date getReserv_date() {
		return reserv_date;
	}


	public void setReserv_date(Date reserv_date) {
		this.reserv_date = reserv_date;
	}


	public Time getReserv_time() {
		return reserv_time;
	}


	public void setReserv_time(Time reserv_time) {
		this.reserv_time = reserv_time;
	}


	public String getUser_tel() {
		return user_tel;
	}


	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}


	public int getCount_pp() {
		return count_pp;
	}


	public void setCount_pp(int count_pp) {
		this.count_pp = count_pp;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public int getReserv_pay() {
		return reserv_pay;
	}


	public void setReserv_pay(int reserv_pay) {
		this.reserv_pay = reserv_pay;
	}


	public Date getReg_date() {
		return reg_date;
	}


	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}


	public String getOrder_id() {
		return order_id;
	}


	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}


	public int getReserv_status() {
		return reserv_status;
	}


	public void setReserv_status(int reserv_status) {
		this.reserv_status = reserv_status;
	}
	
	

	
	
}
