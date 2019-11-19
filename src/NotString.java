public class NotString {
    public static String notStringSolution (String str) {
        if (str.substring(0, 3).equals("not")){
            return str;
        }else
            return "not " + str;
    }
}
