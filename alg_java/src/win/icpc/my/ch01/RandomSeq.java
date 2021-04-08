package win.icpc.my.ch01;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

/**
 * @author lucy
 * @date 2021/1/2 18:05
 */
public class RandomSeq {
    public static void main(String[] args) {
        // 打印 N 个（lo, hi） 之间的随机值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        Random random = new Random();
        for (int i = 0; i < N; ++i) {
            double x = StdRandom.uniform(lo, hi);
        }
    }
}
