package com.sorts;

/**
 * Created by huaaijia on 2017/2/13.
 */
public class H_MergeSort {
    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};
        System.out.println("MergeSort");
        print("Begin:", data);
        mergeSort(data);
        print("End:", data);
    }

    public static void mergeSort(int[] data) {

        sortImpl(data, 0, data.length-1);

    }

    public static void sortImpl(int[] data, int left, int right){
        if(left>=right){
            return;
        }
        int center = (left+right)/2;
        sortImpl(data, left, center);
        sortImpl(data, center+1, right);
        mergeSort(data, left, center, right);
        print("", data);
    }

    /**
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序（归并两边的数组已经是有序数组）
     *
     * @param data
     *            数组对象
     * @param left
     *            左数组的第一个元素的索引
     * @param center
     *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right
     *            右数组最后一个元素的索引
     */
    public static void mergeSort(int[] data, int left, int center, int right){
        int[] tempArr = new int[data.length];
        int left2 = center+1;//右侧数组起始索引
        int index = left;//归并数组起始索引

        int temp = left;//缓存起始索引

        while(left<=center && left2<=right){
            if(data[left]<data[left2]){
                tempArr[index] = data[left];
                index++;
                left++;
            }else{
                tempArr[index] = data[left2];
                index++;
                left2++;
            }
        }

        //一下两个if只可能成立一个
        while(left<=center){
            tempArr[index] = data[left];
            index++;
            left++;
        }

        while(left2<=right){
            tempArr[index] = data[left2];
            index++;
            left2++;
        }

        //将tempArr回data
        for(int i=temp; i<=right; i++){
            data[i] = tempArr[i];
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
