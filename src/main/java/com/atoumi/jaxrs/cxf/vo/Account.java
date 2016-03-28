package com.atoumi.jaxrs.cxf.vo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ahmed.ettoumi@gmail.com <br />
 * 26 mars 2016
 *
 */
@XmlRootElement(name = "Account")
public class Account {
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
