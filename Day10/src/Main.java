import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main {
    public static void main(String[]args) throws Exception{

        //使用方法将文档阅读
        BufferedReader reader = new BufferedReader(new FileReader("student.txt"));

        String line;

        //ArrayList将数据存入
        ArrayList<Student>students = new ArrayList<>();

        //循环读，直到无
        while((line = reader.readLine())!=null) {
            String[] data = line.split(",");

            //转换String形式
            int age = Integer.parseInt(data[1]);

            //同上
            double score = Double.parseDouble(data[2]);

            Student student = new Student(
                    data[0],
                    age,
                    score
            );
            students.add(student);
        }

        //查询信息
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入查询姓名:");

            String searchName = scanner1.nextLine();

        for(Student s : students){
            if(s.getName().equals(searchName)){
            s.show();
        }
        }

        //存储信息
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生名字");
        String name = scanner.nextLine();

        System.out.println("请输入年龄");
        int age = scanner.nextInt();

        System.out.println("请输入成绩");
        double score = scanner.nextDouble();

        Student student1 = new Student(
                name,
                age,
                score
        );

        students.add(student1);
        FileWriter writer = new FileWriter("student.txt");
        for(Student s : students){
            writer.write(
                    s.getName()+","+
                            s.getAge()+","+
                            s.getScore()+"\n"
            );
        }
writer.close();

        reader.close();

    }
}
