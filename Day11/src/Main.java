import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[]args) throws Exception{
        ArrayList<Student>students = FileUtil.load();
        StudentService service = new StudentService(students);

        Scanner sc = new Scanner(System.in);

        //查询系统，循环问候
        while(true){
            System.out.println("==========");
            System.out.println("学生管理系统");
            System.out.println("1.查询学生");
            System.out.println("2.增加学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("5.查看全部学生");
            System.out.println("0.退出系统");
            System.out.println("==========");

            System.out.println("请输入选择:");

            int choice = sc.nextInt();

            //选择系统，专用来选择
            switch (choice){
                case 1:
                    System.out.println("请输入查询名称");
                    String searchName = sc.next();
                    service.findByName(searchName);

                    break;

                case 2:
                    System.out.println("请输入姓名：");
                    String name =sc.next();

                    System.out.println("请输入年龄：");
                    int age = sc.nextInt();

                    System.out.println("请输入成绩：");
                    double score = sc.nextDouble();

                    Student newstudent = new Student(name, age, score);

                    service.addStudent(newstudent);

                    FileUtil.save(students);

                    System.out.println("增加成功");

                    break;

                case 3:
                    System.out.println("请输入修改学生姓名：");
                    String updateName =sc.next();

                    System.out.println("请输入新的年龄：");
                    int newAge = sc.nextInt();

                    System.out.println("请输入新的成绩:");
                    double newScore = sc.nextDouble();

                    service.updataStudent(
                            updateName,
                            newAge,
                            newScore
                    );

                    FileUtil.save(students);

                    break;

                case 4:
                    System.out.println("请输入删除名字:");
                    String deleteName = sc.next();

                    service.deleteStudent(deleteName);

                    FileUtil.save(students);
                    break;

                case 5:
                    System.out.println("全部学生信息:");
                    for(Student s : students){
                        s.show();
                    }
                    break;

                case 0:
                    System.out.println("退出");
                    return;

                default:
                    System.out.println("输入错误，请重新选择");
                    break;

            }
        }

    }
}