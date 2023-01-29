/*
 * Copyright (c) 2023 Nextiva, Inc. to Present.
 * All rights reserved.
 */

package com.c4cydonia.tasks.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class TaskExceptionDto {
    private String message;
    private HttpStatus status;

    public TaskExceptionDto(String message, HttpStatus httpStatus) {
        this.message = message;
        this.status = httpStatus;
    }
}
