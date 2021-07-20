package com.naproject.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long depid;
	private String depname;
	private String depaddress;
	private String depcode;
	public Long getDepid() {
		return depid;
	}
	public void setDepid(long depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getDepaddress() {
		return depaddress;
	}
	public void setDepaddress(String depaddress) {
		this.depaddress = depaddress;
	}
	public String getDepcode() {
		return depcode;
	}
	public void setDepcode(String depcode) {
		this.depcode = depcode;
	}
	public Department(long depid, String depname, String depaddress, String depcode) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.depaddress = depaddress;
		this.depcode = depcode;
	}
	
	public Department()
	{
		
	}
	@Override
	public String toString() {
		return "Department {depid=" + depid + ", depname=" + depname + ", depaddress=" + depaddress + ", depcode="
				+ depcode + "}";
	}

}
