package com.sorts;

/**
 * Created by huaaijia on 2017/2/13.
 */
public class J_RadixSort {
    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7, 7, 8, 35,    1100, 192, 221, 12, 23};
        System.out.println("RadixSort");
        print("Begin:", data);
        radixSort(data, 4);
        print("End:", data);
    }

    /**
     * 基数排序已经不再是一种常规的排序方式，它更多地像一种排序方法的应用，基数排序必须依赖于另外的排序方法(稳定的)。
     * 基数排序的总体思路就是将待排序数据拆分成多个关键字进行排序，也就是说，基数排序的实质是多关键字排序。
     *
     * 4 4位数，每位0-9，子排序方法 桶排序
     */
    public static void radixSort(int[] data, int num){


    }

    public static void print(String profix, int[] data) {
        System.out.print(profix + "\t");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}
