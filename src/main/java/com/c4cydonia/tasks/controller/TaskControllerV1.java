package com.c4cydonia.tasks.controller;

import java.util.Optional;
import java.util.logging.Logger;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.c4cydonia.tasks.model.Task;
import com.c4cydonia.tasks.repository.TaskRepository;

import static com.c4cydonia.tasks.exceptions.ExceptionCatalogue.TASK_DESCRIPTION_MANDATORY;
import static com.c4cydonia.tasks.exceptions.ExceptionCatalogue.TASK_MANDATORY;
import static com.c4cydonia.tasks.exceptions.ExceptionCatalogue.TASK_NOT_FOUND;
import static java.util.Objects.isNull;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/tasks")
public class TaskControllerV1 {

    private static Logger log = Logger.getLogger("TaskControllerV1");
    @Autowired
    private TaskRepository taskRepository;

    @PutMapping("/v1/{id}")
    @ResponseBody
    public ResponseEntity updateTask(@PathVariable("id") Long id, @Valid @RequestBody @NotNull Task task) {
        if(isNull(id) || isNull(task)) {
            return new ResponseEntity<>(TASK_MANDATORY, BAD_REQUEST);
        }

        Optional<Task> currentTask = taskRepository.findById(id);
        if(currentTask.isEmpty()) {
            return new ResponseEntity<>(TASK_NOT_FOUND, NOT_FOUND);
        }

        if(isNull(task.getDescription()) || task.getDescription().isEmpty()) {
            return new ResponseEntity<>(TASK_DESCRIPTION_MANDATORY, BAD_REQUEST);
        }

        Task taskToUpdate = currentTask.get();
        taskToUpdate.setDescription(isNull(task.getDescription()) ? taskToUpdate.getDescription() : task.getDescription());
        taskToUpdate.setPriority(isNull(task.getPriority()) ? taskToUpdate.getPriority() : task.getPriority());
        taskRepository.save(taskToUpdate);
        return new ResponseEntity<>(taskToUpdate, OK);
    }
}
