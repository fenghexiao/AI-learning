import  java.util.ArrayList;
public class MainSt {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("小明", 18, 95.5));
        students.add(new Student("小红", 19, 88.0));
        students.add(new Student("小刚", 18, 92.0));

        for (Student student : students) {
            System.out.println(
                    "姓名：" + student.name +
                            "，年龄：" + student.age +
                            "，成绩：" + student.score
            );
        }
    }
}
