package com.day1106.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName dept
 */
@Data
public class Dept implements Serializable {
    private Integer deptNo;

    private String dName;

    private String loc;

    private static final long serialVersionUID = 1L;
}