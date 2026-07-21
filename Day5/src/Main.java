public class Main {
    public static void main(String[]args){

        Student student= new Student("小明",18);
        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.sayHello();
    }


}
