public class Students {

    String name;
    int age;

    public Students(String name,int age){
        this.name = name;
        this.age =age;
    }

    public void show(){
        System.out.println(
                "姓名:"+name+
                " 年龄:"+age);
    }
}
