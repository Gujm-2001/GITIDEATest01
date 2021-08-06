package exer3;

/**
 * @author Gujm
 * @date 2021/8/3 3:12 下午
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}
class instanceTest{
    public void method(Person e){
        String ingo = e.getInfo();
        if (e instanceof Graduate){
            System.out.println("ddd");
        }
    }

}

