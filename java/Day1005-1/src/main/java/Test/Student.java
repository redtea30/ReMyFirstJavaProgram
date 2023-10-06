package Test;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private int id;
    private Date birth;
    private String name;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    private Student(int id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

}
