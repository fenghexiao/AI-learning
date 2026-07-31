import java.io.FileReader;

public class Mainreader {
    public static void main(String[]args) throws Exception{

        FileReader reader = new FileReader("student.txt");

        int data;

        while((data = reader.read())!= -1){
            System.out.print((char)data);
        }

        reader.close();
    }
}
