package com.pb.Kazachuk.HW10;

import java.util.Arrays;

public class NumBox<T extends Number> {
    private final T[] array;
    private int size = 0;

    @SuppressWarnings("unchecked")
    NumBox(int maxLength) {
        this.array = (T[]) new Number[maxLength];
    }

    public void add(T num) {
        if (size >= array.length) {
            throw new IllegalStateException("Array is full, You can't add new items.");
        }
        array[size] = num;
        size++;
    }

    public T get(int index) {
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("You try to get number for a wrong index");
        }
        return array[index];
    }

    public int length() {
        return size;
    }

    public double average() {
        return sum() / length();
    }

    public double sum() {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += array[i].doubleValue();
        }
        return result;
    }

    public T max() {
        T[] copiedArray = Arrays.copyOf(array, size);
        T max = copiedArray[0];

        for (int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] = max;

            for (int j = i + 1; j < copiedArray.length; j++) {
                if (copiedArray[j].doubleValue() > max.doubleValue()) {
                    max = copiedArray[j];
                }
            }
        }

        return max;
    }
}
