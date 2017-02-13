package com.sorts;


/**
 * Created by huaaijia on 2017/2/6.
 */
public class E_InsertSort {

    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};
        System.out.println("InsertSort");
        print("Begin:", data);
        insertSort(data);
        print("End:", data);
    }

    /**
     * 从第二个元素开始，将其插入到前面有序数列的对应位置，将对应位置后面的数据整体后移
     * @param data
     */
    public static void insertSort(int[] data) {

        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                int temp = data[i];
                int j = i - 1;
                while (j >= 0 && temp < data[j]) {
                    data[j + 1] = data[j];
                    j--;
                }
                data[j + 1] = temp;
                print("第" + i + "次：", data);
            }
        }

    }

    public static void print(String profix, int[] data) {
        System.out.print(profix + "\t");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}