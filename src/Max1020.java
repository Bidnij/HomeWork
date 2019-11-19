public class Max1020 {
    public static int max1020Solution(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)){
            if (a>b){
                return a;
            }else return b;
        }else
            return 0;
    }
}
