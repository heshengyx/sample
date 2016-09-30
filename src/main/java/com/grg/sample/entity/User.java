package com.grg.sample.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {

	private Long id;
	private String name;
	
	@JSONField (format="yyyy-MM-dd HH:mm:ss")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
