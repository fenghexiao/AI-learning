//全程自己写，通过自己的理解来重新构造
public class Teacher {

    private String name;
    private int age;
    private double score;

    //构造
    public Teacher(String name,int age,double score){
        this.name =name;
        this.age = age;
        this.score = score;

    }

     public String getName(){
        return name;
     }

     public  int getAge(){
        return age;
     }

     public double getScore(){
         return score;
     }

     public void setScore(double score){
        this.score = score;
     }





}


