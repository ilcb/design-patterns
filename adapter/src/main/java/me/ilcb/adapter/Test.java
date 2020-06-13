package me.ilcb.adapter;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public void sort(int[] array, int low, int high) {
        int start = low;
        int end = high;

        int pivot = array[low];
        while (end > start) {
            while(end > start && array[end] >= pivot) {
                end--;
            }

            if (array[end] <= pivot) {
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }

            while(end > start && array[start] <= pivot) {
                start++;
            }

            if (array[start] >= pivot) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }

        Arrays.stream(array).forEach(item -> System.out.print(item + "  "));
        System.out.println();

        if (start > low) {
            sort(array, low, start - 1);
        }

        if (end < high) {
            sort(array, end + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 20, 5, 16, 15, 1, 30, 45};

        System.out.print("初始:");
        Arrays.stream(array).forEach(item -> System.out.print(item + "  "));
        System.out.println();
        Test test = new Test();
        test.sort(array, 0, array.length - 1);

        System.out.print("结果:");
        for (Integer num : array) {
            System.out.print(num + "  ");
        }

    }

}
