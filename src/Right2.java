public class Right2 {
    public static String right2Solution(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() -2);
        } else return str;
    }
}
