package Father;

/**
 * @author Gujm
 * @date 2021/8/1 6:27 下午
 */
//父类void，子类也只能是void；不是void是A类，子类返回值类型则A或A的子类，
// 在不同包的子类中不能调用夫类的private 和 缺省
// 在不同包的非子类，只能调用public，super（形参列表）调用fulei构造器
public class Student extends Person{
    String major;
    public Student(){
    }
    public Student(String major){
        this.major = major;
    }
    public void study(){
        System.out.println("学习专业是"+major);
    }
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }
    private void show(){
        System.out.println("zilei");
    }
}
