public class Teacher extends Person {
    private double score;

    public Teacher(String name,int age,double score){
        super(name, age);
        this.score = score;
    }

    @Override
    public void introduce(){
        System.out.println(
                "我是老师,姓名:"
                        + getName()
                        + " 成绩:"
                        + getAge()
                        + " 分数"
                        + score);
    }
}