import java.util.ArrayList;

public class Main {
    public static void main(String[]args) {

        ArrayList<Workable> worklist = new ArrayList<>();

        worklist.add(new Student());
        worklist.add(new Teacher());

        for(Workable w : worklist){

            w.work();
         }





    }
}
