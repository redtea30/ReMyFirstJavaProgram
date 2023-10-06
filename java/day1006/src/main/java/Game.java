import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Game {
    private String name;
    private int star;
    private double money;

    private GenericClass<Student, Game, String> genericClass;

    public String country = "China";

    String people;
    protected int code;
    private String syntheticField;

    private List<String> heroes;
    private Map<String, Integer> map;
}
