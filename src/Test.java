public class Test {
    public static void test() {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Значение b:" + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Значение b:" + b);
    }
}
