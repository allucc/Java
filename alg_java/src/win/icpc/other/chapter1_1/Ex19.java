package win.icpc.other.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex19 {
	private static long[] f = new long[100];
	public static void F(int N) {
		f[0] = 0L;
		f[1] = 1L;
		for (int i = 2; i <= N; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
	}

	public static void main(String[] args) {
		F(99);
		for (int N = 0; N < f.length; N++) {
			StdOut.println(N + " " + f[N]);
		}
	}
}
