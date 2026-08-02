import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileUtil {
    //读取
    public static ArrayList<Student> load() throws Exception {
        ArrayList<Student> students = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("Day11/student.txt"));

        //读取系统，专门用来打开
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            String name = data[0];
            int age = Integer.parseInt(data[1]);
            double score = Double.parseDouble(data[2]);

            Student student = new Student(name, age, score);

            students.add(student);
        }
        reader.close();
        return students;
    }

    //用来存储添加新内容的前置
    public static void save(ArrayList<Student>students)throws Exception{
        FileWriter writer = new FileWriter("Day11/student.txt");
        for(Student s : students){
            writer.write(s.getName()+","+s.getAge()+","+s.getScore()+"\n");

        }
        writer.close();
    }

}