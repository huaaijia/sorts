package com.sorts;

/**
 * Created by huaaijia on 2017/2/6.
 */
public class D_QuickSort {

    static int loopTimes = 0;

    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};
        System.out.println("HeapSort");
        print("Begin:\t\t", data);
        quickSort(data, 0, data.length - 1);
        print("End:\t\t", data);
    }

    /**
     * 从待排数据中任取一个数（比如第一个数）作为分界值
     * 所有比他小的数据元素都放在左边，比他大的放在右边
     * 然后再将左右两侧数据进行递归，以此类推，知道每侧剩下一个元素
     *
     * @param data
     */
    public static void quickSort(int[] data, int start, int end) {

        if (start >= end) {
            return;
        }

        loopTimes = loopTimes + 1;
        int subLoopTimes = 0;

        //将第一个元素作为分界值
        int pivot = data[start];
        int i = start + 1;
        int j = end;

        while (true) {
            subLoopTimes = subLoopTimes + 1;
            while (i < end && data[i] <= pivot) {
                i++;
            }
            while (j > start && data[j] >= pivot) {
                j--;
            }
            if (i < j) {
                swap(data, i, j);
                print("交换左右 第" + loopTimes + "-" + subLoopTimes + "次:", data);
            } else {
                break;
            }
        }
        //将分界点start上的数据放到真正的分界点j的位置上
        swap(data, start, j);
        print("交换pivot 第" + loopTimes + "次:", data);

        //递归
        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    public static void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
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
