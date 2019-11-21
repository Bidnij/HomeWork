public class FirstHalf {
    public static String firstHalfSolution (String str) {
        if (str.length()%2 ==0) {
            return str.substring(0, str.length()/2);
        }else
            return str.substring(0, str.length()/2+1);
    }
}
