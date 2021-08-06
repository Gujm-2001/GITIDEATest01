package exer4;

import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.awt.*;

/**
 * @author Gujm
 * @date 2021/8/3 3:27 下午
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject shape1 = new Circle("red", 2, 3);
        GeometricObject shape2 = new MyRectangle("blue", 7, 4, 7);
        GeometricTest test1 = new GeometricTest();
        test1.displayGeometricObject(shape1);
        test1.displayGeometricObject(shape2);
        System.out.println(test1.equalsArea(shape1, shape2));
        System.out.println(shape1.getColor());
    }

    public boolean equalsArea(GeometricObject shape1, GeometricObject shape2){
        return shape1.findArea() == shape2.findArea();
    }
    public void displayGeometricObject(GeometricObject shape){
        System.out.println((int)shape.findArea());
    }

    @Override
    public String toString() {
        return "GeometricTest{}";
    }
}
