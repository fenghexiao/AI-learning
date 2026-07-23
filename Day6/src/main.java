import java.util.ArrayList;

public  class main {
    public static void main(String[]args){
        ArrayList<Person> people = new ArrayList<>();

        people.add(
                new Student("小明",18,99)
        );

        people.add(
                new Teacher("王子子",25,100)
        );

        for(Person person: people){
            person.introduce();
        }





    }
}
