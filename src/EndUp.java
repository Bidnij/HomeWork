public class EndUp {
    public static String endUpSolution(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            int part = str.length() - 3;
            String first = str.substring(0, part);
            String last = str.substring(part);

            return first + last.toUpperCase();
        }
    }
}
