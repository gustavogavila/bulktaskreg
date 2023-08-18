package com.gus.bulktaskreg.repository;

import com.gus.bulktaskreg.domain.Task;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TaskRepository extends ReactiveCrudRepository<Task, Long> {
}
