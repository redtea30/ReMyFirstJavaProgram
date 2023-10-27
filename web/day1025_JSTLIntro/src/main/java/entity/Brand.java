package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 25-10-2023  15:15
 * Describe：
 */

@Data
class Brand implements Serializable {
    //  这里省事省略private
    public String brand;
    public String advertisement;
    public String speakOut;
}