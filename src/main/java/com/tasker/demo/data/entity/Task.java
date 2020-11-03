package com.tasker.demo.data.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Task {
    private long id;
    private String title;
    private int priority;
    private boolean done;
    private Date deadline;
    private long projectId;
}
