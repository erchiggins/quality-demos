package com.revature.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("surfer")
@Scope("prototype")
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
