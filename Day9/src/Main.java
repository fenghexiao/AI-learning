public class Main {
    public static void main(String[]args){
        int [] nums ={10,20,30};
        try{
            System.out.println(nums[5]);
        }catch (Exception e){
            System.out.println("没有此数据");
        }

        System.out.println("数据继续运行");

    }
}
