package win.icpc;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author lucy
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Integer.MIN_VALUE);
        int a = Integer.MIN_VALUE;
        for(int i=0;i<32;i++){
            int t=(a & 0x80000000>>>i)>>>(31-i);
            System.out.print(t);
        }
        System.out.println();
        a = 8;
        for(int i=0;i<32;i++){
            int t=(a & 0x80000000>>>i)>>>(31-i);
            System.out.print(t);
        }
        System.out.println();
        a = -8;
        for(int i=0;i<32;i++){
            int t=(a & 0x80000000>>>i)>>>(31-i);
            System.out.print(t);
        }
        System.out.println();

        System.out.println(Math.abs(-2147483648));
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
