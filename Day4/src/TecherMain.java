public class TecherMain {
    public static void main(String[]args){

        Teacher teacher =new Teacher("小嘉嘉",20, 99);

        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getScore());
        teacher.setScore(100);
        System.out.println(teacher.getScore());



    }
}
