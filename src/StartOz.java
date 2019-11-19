public class StartOz {
    public static String startOzSolution (String str) {
        String text = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            text += str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            text += str.charAt(1);
        }

        return text;
    }
}
