public class Student {

    private String name;

    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写 equals 和 hashCode 方法

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;

        if (this == obj) return true;

        // 名字和年龄一样就是同一个 student  getClass / instanceof
        if (obj.getClass() == this.getClass()){

        }
        if (obj instanceof Student stu){
            if (stu.name.equals(this.name)){
                if (this.age == stu.age){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 1;
        result = result * 31 + name.hashCode();
        result = result * 31 + age;

        return result;
    }
}
