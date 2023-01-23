package com.c4cydonia.tasks.exceptions;

import org.springframework.http.HttpStatus;

public class ExceptionCatalogue {
    public static TaskException TASK_MANDATORY = new TaskException("Task Id and task object are mandatory",HttpStatus.BAD_REQUEST);
    public static TaskException TASK_NOT_FOUND = new TaskException("Cannot find task with given id", HttpStatus.NOT_FOUND);
    public static TaskException TASK_DESCRIPTION_MANDATORY
            = new TaskException("Task description is required", HttpStatus.BAD_REQUEST);
}
