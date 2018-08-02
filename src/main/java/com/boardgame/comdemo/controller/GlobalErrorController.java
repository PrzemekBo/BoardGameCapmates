package com.boardgame.comdemo.controller;

import com.boardgame.comdemo.dao.error.UserNotFoundException;
import com.boardgame.comdemo.domain.ErrorMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalErrorController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalErrorController.class);
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorMessage playerExceptionHandler(Exception ex) {
		LOGGER.error("Error in user service: ", ex);
		return new ErrorMessage(ex.getMessage());
	}

	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorMessage userNotFoundException(Exception ex) {
		LOGGER.error("Error in user service: ", ex);
		return new ErrorMessage(ex.getMessage());
	}
	

	

}
