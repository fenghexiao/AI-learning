public class Day4Main {
    public static void main(String[]args){

        Pstudent student = new Pstudent("小明",18,90);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
        student.setScore(95);
        System.out.println(student.getScore());
    }

}
