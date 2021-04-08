package win.icpc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        test();
    }
    
    public static boolean isInZeroToOne(double x, double y) {
        if (x <= 0d || x >= 1d) {
            return false;
        }
        if (y <= 0d || y >= 1d) {
            return false;
        }
        return true;
    }

    public static void test() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; ++i) {
            System.out.println(f);
            f += g;
            g = f - g;
        }
    }
}
