package com.gus.bulktaskreg.controller;

import com.gus.bulktaskreg.domain.Task;
import com.gus.bulktaskreg.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public Flux<Task> listAll() {

        return taskService.listAll();
    }
}
