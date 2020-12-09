package com.tal.bean;
import java.util.ArrayList;

public class UserInfoReply {
	
	private String name; 
	
	private int age; 
	
	private String birthday; 
	
	private String description; 
	
	private ArrayList<String> tag; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<String> getTag() {
		return tag;
	}

	public void setTag(ArrayList<String> tag) {
		this.tag = tag;
	}
	
}