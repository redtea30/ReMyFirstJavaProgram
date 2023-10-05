package org.example;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Operation_log {
    private Integer log_id;
    private String description;
    private Timestamp operation_time;
}
