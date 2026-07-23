public class Student extends Person{

    private double score;

    public Student(String name,int age,double score){
        super(name, age);
        this.score =score;

    }
    @Override
    public  void introduce(){
        System.out.println(
                "我是学生,姓名:"
                + getName()
                + " 成绩:"
                + getAge()
                + " 分数"
                + score
        );


    }

}


