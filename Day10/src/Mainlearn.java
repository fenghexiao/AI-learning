import java.io.FileWriter;

public class Mainlearn {
    public static void main(String[]args) throws Exception {
        FileWriter writer = new FileWriter("student.txt");

        writer.write("小明,18,99\n");
        writer.write("小强,19,88");

        writer.close();

    }
}
