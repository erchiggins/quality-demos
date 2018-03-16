package com.revature.beans;

public class Surfer {
	
	public Surfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Surfer(String name, int numOfBoards) {
		super();
		this.name = name;
		this.numOfBoards = numOfBoards;
	}
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

}
