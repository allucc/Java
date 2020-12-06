package ch12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lucy
 */
public class Test {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{
                35, 24, 13, 12, 8, 7, 1
        }));
        System.out.println(Collections.binarySearch(list, 6, Collections.reverseOrder()));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list, 1));

        List list1 = new ArrayList<Integer>();
        list1 = Collections.checkedList(list1, Integer.class);
        list1.add("hello");
        System.out.println(list1);
    }
}
