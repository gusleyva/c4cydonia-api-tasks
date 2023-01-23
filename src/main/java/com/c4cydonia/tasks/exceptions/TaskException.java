package com.c4cydonia.tasks.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class TaskException {
    private String message;
    private HttpStatus status;

    public TaskException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.status = httpStatus;
    }
}
