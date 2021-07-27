/**
 * @author Gujm
 * @date 2021/7/27 11:42 上午
 */
public class Object01 {
    public static void main(String[] args) {
        Student1[] stu = new Student1[5];
        stu[0] = new Student1();
        stu[0].name = "tom";
        System.out.println(stu[0].name);
        System.out.println(stu[0].state);
        System.out.println(stu[0].score);
        System.out.println(stu[1]);
    }

}
class Student1{
    String name;
    int state;
    int score;
}