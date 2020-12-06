package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lucy
 */
public class Test {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(11, Collections.reverseOrder());
        pq.offer(10);
        pq.add(22);
        pq.addAll(Arrays.asList(new Integer[]{
                11, 12, 34, 2, 7, 4, 15, 12, 8, 6, 19, 13
        }));
        while (pq.peek() != null) {
            System.out.print(pq.poll() + " ");
        }
    }
}
