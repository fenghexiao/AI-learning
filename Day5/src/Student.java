public class Student extends Person {

    public Student(String name,int age){
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("你好，我是学生");
        super.sayHello();
    }
}
