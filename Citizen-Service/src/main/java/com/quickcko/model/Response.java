package com.quickcko.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author chetan d.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Response {

	public Response() {
		
	}
	
	public Response(String msg, int statusCode) {
		super();
		this.msg = msg;
		this.statusCode = statusCode;
	}
	
	public Response(List<Currency> data, int statusCode) {
		super();
		this.data = data;
		this.statusCode = statusCode;
	}
	
	
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	private List<Currency> data;
	private int statusCode;
	private String msg;


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Currency> getData() {
		return data;
	}

	public void setData(List<Currency> data) {
		this.data = data;
	}
}
