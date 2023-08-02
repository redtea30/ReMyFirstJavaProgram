package experimentalTest;

/**
 * ClassName:Child
 * Package: experimentalTest
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20238:56 pm
 * @Version 1.0
 */
class Child extends Parent {
    private String school;

    public Child(String school) {
        this.school = school;
    }
    public void printSchool () {
        System.out.println("School" + school);
    }

}
