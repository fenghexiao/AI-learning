public class checkScore {
    public void checkScore(double score) throws Exception {


        if (score > 100 || score < 0) {
            throw new Exception("成绩不合法");
        }
        System.out.println("成绩正常");

    }
}
