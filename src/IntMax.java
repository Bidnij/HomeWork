public class IntMax {
    public static int intMaxSolution (int a, int b, int c){
        int[] mas = new int [] {a, b, c};
        int max= mas[0];
        for (int i=0; i<mas.length; i++){
            if (mas[i]>max){
                max = mas[i];
            }
        }
        return max;
    }
}
