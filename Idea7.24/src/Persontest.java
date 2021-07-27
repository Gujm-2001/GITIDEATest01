import java.sql.SQLOutput;

/**
 * @author Gujm
 * @date 2021/7/27 9:04 上午
 */
public class Persontest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Tom";
        System.out.println(p1.name);
        p1.age = 18;
        p1.isMale = true;
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        Person p2 = new Person();
        p2 = p1;
        p2.age =13;
        System.out.println(p1.age);

    }
}
class Person{
    String name;
    int age = 1;
    boolean isMale;
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，说的是"+ language);
    }
}
