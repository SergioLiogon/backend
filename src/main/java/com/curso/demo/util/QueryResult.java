package com.curso.demo.util;

import java.util.*;

public class QueryResult {
	
	private int totalRecors;
	
	public int getTotalRecors() {
		return totalRecors;
	}

	public void setTotalRecors(int totalRecors) {
		this.totalRecors = totalRecors;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	private List<Object> list;

}
