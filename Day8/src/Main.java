import java.util.HashMap;
public class Main {
    public static void main(String[]args){

        HashMap<String,Students>students = new HashMap();
        students.put("001",new Students("小明",18));
        students.put("002",new Students("小强",21));
        students.put("001",new Students("小明",20));

        System.out.println("学生人数:"+students.size());


        for(String key : students.keySet()){
            Students s = students.get(key);
            s.show();
        }

        Students l = students.get("001");
        l.show();
    }
}
