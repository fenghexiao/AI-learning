public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public double getScore(){ return score; }

    public void setAge(int newAge){
        this.age=newAge;
    }



    public void show(){
        System.out.println("姓名："+name+
                " 年龄"+age+
                " 成绩"+score
        );
    }

    public void setScore(double newScore) {
        this.score=newScore;
    }
}
