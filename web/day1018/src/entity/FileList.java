package entity;

import lombok.Data;

import java.util.Date;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 19/10/2023-10-2023 09-05
 * Describe：
 */

@Data
public class FileList {
    private int id;
    private String name;
    private String type;
    private Double size;
    private Date date;

}
