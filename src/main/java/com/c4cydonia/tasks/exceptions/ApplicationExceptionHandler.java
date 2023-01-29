package com.c4cydonia.tasks.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.c4cydonia.tasks.dto.TaskExceptionDto;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(TaskAdviceException.class)
    public ResponseEntity<TaskExceptionDto> taskException(TaskAdviceException ex) {
        TaskExceptionDto taskExceptionDto = new TaskExceptionDto(ex.getMessage(), ex.getStatus());
        return new ResponseEntity<>(taskExceptionDto, new HttpHeaders(), ex.getStatus());
    }
}
