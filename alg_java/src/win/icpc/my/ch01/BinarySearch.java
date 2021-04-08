package win.icpc.my.ch01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author lucy
 * @date 2021/1/2 18:36
 */
public class BinarySearch {
    private static long leftCount = 0L;
    private static long equalCount = 0L;
    public static int rank(int key, int[] a) {
        // 数组必须有序
        int lo = 0;
        leftCount = 0L;
        equalCount = 0L;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                while(a[lo++] < key) {
                }
                leftCount = lo;
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = new In(args[0]).readAllInts();
        Arrays.sort(whiteList);
        System.out.println(Arrays.toString(whiteList));
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
//            System.out.println("order: " + rank(key, whiteList));
            if(rank(key, whiteList) < 0) {
                StdOut.println(key);
            }
        }

    }

}
