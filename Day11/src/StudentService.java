import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students;

    public StudentService(ArrayList<Student> students) {
        this.students = students;
    }

    public void findByName(String name) {

        for (Student s : students) {
            if (s.getName().equals(name)) {
                s.show();
            }
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void updataStudent(String name,int age,double score){
        for(Student s : students){
            if(s.getName().equals(name)){
                s.setAge(age);
                s.setScore(score);
                System.out.println("修改成功");
                return;
            }
        }
            System.out.println("没有找到该学生");
    }

    public void deleteStudent(String name){
        for(int i =0;i < students.size();i++){
            Student s = students.get(i);

            if(s.getName().equals(name)){
                students.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有找到该学生");

    }
}
