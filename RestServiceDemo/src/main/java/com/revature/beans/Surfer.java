package com.revature.beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Surfer {
	
	public Surfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Surfer(int id, String name, int numOfBoards) {
		super();
		this.id = id;
		this.name = name;
		this.numOfBoards = numOfBoards;
	}
	
	private int id;
	private String name;
	private int numOfBoards;
	
	@XmlElement 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public int getNumOfBoards() {
		return numOfBoards;
	}
	public void setNumOfBoards(int numOfBoards) {
		this.numOfBoards = numOfBoards;
	}
	@Override
	public String toString() {
		return "Surfer [name=" + name + ", numOfBoards=" + numOfBoards + "]";
	}
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
