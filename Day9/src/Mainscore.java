public class Mainscore {
    public static void main(String[]args){

        checkScore check = new checkScore();

        try{
            check.checkScore(120);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
