package com.tasker.demo.data.entity;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Project {
    private long id;
    private String title;
}
