package com.c4cydonia.tasks.exceptions;

import org.springframework.http.HttpStatus;

public class ExceptionCatalogue {
    public static TaskAdviceException
            TASK_ADVICE_MANDATORY = new TaskAdviceException("Task Id and task object are mandatory",HttpStatus.BAD_REQUEST);
    public static TaskAdviceException
            TASK_ADVICE_NOT_FOUND = new TaskAdviceException("Cannot find task with given id", HttpStatus.NOT_FOUND);
    public static TaskAdviceException TASK_ADVICE_DESCRIPTION_MANDATORY
            = new TaskAdviceException("Task description is required", HttpStatus.BAD_REQUEST);

    public static TaskException
            TASK_MANDATORY = new TaskException("Task Id and task object are mandatory",HttpStatus.BAD_REQUEST);
    public static TaskException
            TASK_NOT_FOUND = new TaskException("Cannot find task with given id", HttpStatus.NOT_FOUND);
    public static TaskException TASK_DESCRIPTION_MANDATORY
            = new TaskException("Task description is required", HttpStatus.BAD_REQUEST);
}
