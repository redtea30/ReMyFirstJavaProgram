package assignment;

import com.google.gson.Gson;

import java.io.*;
import java.util.Objects;

public class DeepCopy {
    public static void main(String[] args) {
        Person person1 = new Person("张三", "张三是三号", null);
        Person person2 = new Person("李四", "李四是四号", person1);
        Person person3 = new Person("王五", "王五是五号", person2);
        System.out.println(person3);
        Gson gson = new Gson();
        String getPerson3 = gson.toJson(person3);
        System.out.println(getPerson3);

        Person person4 = gson.fromJson(getPerson3, Person.class);
        System.out.println(person4.toString());
        System.out.println("address Compare" + (person4 == person3));
        System.out.println("Objects.equals" + Objects.equals(person4, person3));
        System.out.println("equals" + person4.equals(person3));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("Day0915/src/assignment/Test.txt")));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("Day0915/src/assignment/Test.txt")));
        ) {

            out.writeObject(person3);
            Object person6 = in.readObject();
            System.out.println("Person6     " + person6);
            System.out.println("person6 == person4  " + (person6 == person4) + "    person4.equals(person6) "+person4.equals(person6));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String jsonSimulate = """
                {"name":"孙六","no":"孙六是六号","son":null}
                """;
        Person person5 = gson.fromJson(jsonSimulate, Person.class);
        System.out.println(person5.toString());

    }
}

