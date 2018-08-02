package com.boardgame.comdemo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ErrorMessage {
	
	private Date date;
	private String error;
	
	public ErrorMessage(String error) {
		this.date = new Date();
		this.error = error;
	}
	
}
