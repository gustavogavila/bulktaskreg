package com.gus.bulktaskreg.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("task")
public class Task {

    @Id
    private Long id;
    private String description;
}
