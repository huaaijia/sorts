package com.sorts;


/**
 * Created by huaaijia on 2017/2/6.
 */
public class G_ShellSort {

    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};
        System.out.println("ShellSort");
        print("Begin:", data);
        shellSort(data);
        print("End:", data);
    }

    public static void shellSort(int[] data) {

    }

    public static void print(String profix, int[] data) {
        System.out.print(profix + "\t");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}