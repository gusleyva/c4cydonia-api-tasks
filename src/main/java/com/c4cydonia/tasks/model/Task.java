package com.c4cydonia.tasks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotNull
    // @Pattern(regexp = "^(?!\\s*$).+", message = "Task name must not be blank.")
    // @NotBlank(message = "Task name must not be blank")
    // @Size(max = 255, message = "Task name must be less than 255 characters")
    @Column(name = "description")
    private String description;

    @Pattern(regexp = "^[0-9]{1}$", message = "Priority should be only digits with a max of 5 characters.")
    @Column(name = "priority")
    private Long priority;
}
