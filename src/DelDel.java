public class DelDel {
    public static String delDelSolution(String str) {
        if (str.length()>3 && str.substring(1, 4).equals("del")) {
                return str.substring(0, 1) + str.substring(4);
            } else
                return str;

    }
}
