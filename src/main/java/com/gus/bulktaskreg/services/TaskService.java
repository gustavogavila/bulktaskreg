package com.gus.bulktaskreg.services;

import com.gus.bulktaskreg.domain.Task;
import com.gus.bulktaskreg.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Flux<Task> listAll() {
        return taskRepository.findAll();
    }
}
