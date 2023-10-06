import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private int id;
    private Date birth;
    private String name;

    public Student() {
    }

    public Student(int id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    private Student(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

}
