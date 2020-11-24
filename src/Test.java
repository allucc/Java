import ch8.DynamicArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(123);
        intList.add(456);
        intList.add(789);
        reverseTraverse(intList);
        for (Integer a : intList) {
            System.out.println(a);
        }
        removeAll(intList);
//        intList.clear();
        for (Integer a : intList) {
//            System.out.println(a);
            intList.remove(a);
        }
    }

    public static <T extends Comparable<? super T>> T max(DynamicArray<T> arr) {
        T max = arr.get(0);
        for (int i = 1; i < arr.size(); ++i) {
            if (arr.get(i).compareTo(max) > 0) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void reverseTraverse(List<Integer> list) {
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    public static void removeAll(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

}
