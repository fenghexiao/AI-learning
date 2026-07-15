import java.util.ArrayList;
public class Day3Collection {
    public static void main (String[]args ){
        ArrayList<String> books=new ArrayList<>();
        books.add("java");
        books.add("Python");
        books.add("AI");

        books.remove("Python");
        System.out.println("第一本书" + books.get(0));
        System.out.println("共有" + books.size());
        for(String name : books){
            System.out.println("书的名字"+name);
        }

    }

}
