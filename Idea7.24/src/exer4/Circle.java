package exer4;

/**
 * @author Gujm
 * @date 2021/8/3 3:26 下午
 */
public class Circle extends GeometricObject{
    double radius;
    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * getRadius() *getRadius();
    }
}
