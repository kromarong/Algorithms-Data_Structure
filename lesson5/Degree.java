package lesson5;

public class Degree {
    public static void main(String[] args) {
        System.out.println(degree(2,4));
    }

    private static int degree(int a, int b) {
        if (b == 1){
            return a;
        }
        return a * degree(a, --b);
    }
}
