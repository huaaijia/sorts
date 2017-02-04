package com.sorts;

/**
 * Created by huaaijia on 2017/2/4.
 */
public class A_SelectSort {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        System.out.println("SelectSort");
        print("Begin:", data);
        selectSort(data);
        print("End:", data);
    }

    public static void selectSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(data, i, minIndex);
                print("第" + (i + 1) + "次:", data);
            }
        }
    }

    public static void swap(int[] data, int i, int j) {
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }

    public static void print(String profix, int[] data) {
        System.out.print(profix + "\t");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

}
