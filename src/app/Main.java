package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        int a = 8;
        int b = 2;
        double aV2 = 8.0;
        double bV2 = 2.0;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = subtraction(a, b);
        System.out.println(e);
        double f = division(aV2, bV2);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
    private static int subtraction(int a, int b) {
        return a - b;
    }
    private static double division(double aV2, double bV2) {
        return aV2 / bV2;
    }
}
