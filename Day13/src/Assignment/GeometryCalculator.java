package Assignment;

/**
 * ClassName:GeometryCalculator
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20237:38 pm
 * @Version 1.0
 */
public class GeometryCalculator {
    //S=πr² 圆面积公式
    double radius;
    double width;
    double height;

    public static void main(String[] args) {
        GeometryCalculator circle = new GeometryCalculator();
        circle.radius = 5;
        System.out.println(calculateCircleArea(circle.radius));

        GeometryCalculator rectangle = new GeometryCalculator();
        rectangle.height = 5.0;
        rectangle.width = 10.0;
        System.out.println(calculateRectangleArea(rectangle.width, rectangle.height));

    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double calculateRectangleArea(double width, double height) {
        double area = width * height;
        return area;
    }

}
