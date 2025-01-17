package com.example.todolist.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TaskResponseDto {

    private Long id;

    private String description;

    private Boolean isCompleted;
}
