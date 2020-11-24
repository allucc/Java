package ch9;

import java.util.Arrays;

public class MyCustomArrayList<E> {
//    private transient Object[] elementData;
//    private int size;
//
//    public boolean add(E e) {
//        ensureCapacityInternal(size + 1);
//        elementData[size++] = e;
//        return true;
//    }
//
//    private void ensureCapacityInternal(int minCapacity) {
//        if (elementData == EMPTY_ELEMENTDATA) {
//            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
//        }
//        ensureExplicitCapacity(minCapacity);
//    }
//
//    private void ensureExplicitCapacity(int minCapacity) {
//        modCount++;
//        if (minCapacity - elementData.length > 0) {
//            grow(minCapacity);
//        }
//    }
//
//    private void grow(int minCapacity) {
//        int oldCapacity = elementData.length;
//        int newCapacity = oldCapacity + (oldCapacity >> 1);
//        if (newCapacity - minCapacity < 0) {
//            newCapacity = minCapacity;
//        }
//        elementData = Arrays.copyOf(elementData, newCapacity);
//    }
//
//    public E remove(int index) {
//        rangeCheck(index);
//        modCount++;
//        E oldValue = elementData(index);
//        int numMoved = size - index - 1;
//        if (numMoved > 0) {
//            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
//        }
//        elementData[--size] = null;
//        return oldValue;
//    }


}
