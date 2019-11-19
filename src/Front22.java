public class Front22 {
    public static String front22Solution(String str) {
        if (str.length() > 1) {
            String text = str.substring(0, 2);
            return text+str+text;
        } else return str+str+str;
    }
}
