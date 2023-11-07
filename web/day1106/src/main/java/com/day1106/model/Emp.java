package com.day1106.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName emp
 */
@Data
public class Emp implements Serializable {
    private Integer empNo;

    private String eName;

    private String job;

    private Integer mgr;

    private Date hirdate;

    private Double sal;

    private Double comm;

    private Integer deptNo;

    private static final long serialVersionUID = 1L;
}