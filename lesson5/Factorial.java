package lesson5;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factArray(5));
        System.out.println(factRec(5));
    }

    private static int factRec(int i) {
        if (i <= 1){
            return 1;
        }
        return i * factRec(--i);
    }

    private static int factArray(int x) {
        int fac = 1;
        for (int i = 1; i <= x; i++){
            fac = fac * i;
        }
        return fac;
    }


}
