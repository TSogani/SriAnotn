package com.ann.beans;

import org.springframework.beans.factory.annotation.Value;

public class Chain {
	private String name;
	private String size;

	public String getName() {
		return name;
	}

	@Value(value = "#{propsVal.chain_name}")
	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	@Value(value = "#{propsVal.chain_size}")
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Chain [name=" + name + ", size=" + size + "]";
	}

}