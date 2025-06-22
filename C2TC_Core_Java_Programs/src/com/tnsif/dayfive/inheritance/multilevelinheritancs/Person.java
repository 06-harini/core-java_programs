package com.tnsif.dayfive.inheritance.multilevelinheritancs;
import java.util.Date;

public class Person {
	private String name;
	private long contactno;
	private Date dateofBirth;
	public Person(String name, long contactno, Date dateofBirth) {
		super();
		this.name = name;
		this.contactno = contactno;
		this.dateofBirth = dateofBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contactno=" + contactno + ", dateofBirth=" + dateofBirth + "]";
	}
	
	
	

}
