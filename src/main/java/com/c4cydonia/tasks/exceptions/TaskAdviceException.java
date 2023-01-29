package com.c4cydonia.tasks.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class TaskAdviceException extends RuntimeException {
    private HttpStatus status;

    public TaskAdviceException(String message, HttpStatus httpStatus) {
        super(message);
        this.status = httpStatus;
    }
}
