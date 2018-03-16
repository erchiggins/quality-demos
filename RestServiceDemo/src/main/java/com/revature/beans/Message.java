package com.revature.beans;

public class Message {
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String text) {
		super();
		this.text = text;
	}

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
