public class Pstudent {

    private String name;
    private int age;
    private double score;

    //构造方法
    public Pstudent(String name,int age,double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}


