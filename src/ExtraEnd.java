public class ExtraEnd {
    public static String extraEndSolution(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        } else return str + str + str;
    }
}
