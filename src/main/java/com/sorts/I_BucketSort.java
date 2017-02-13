package com.sorts;

/**
 * Created by huaaijia on 2017/2/13.
 */
public class I_BucketSort {
    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7, 7, 8, 35, 0};
        System.out.println("BucketSort");
        print("Begin:", data);
        bucketSort(data);
        print("End:", data);
    }

    public static void bucketSort(int[] data){
        int[] temp = new int[101];
        for(int i=0; i<data.length; i++){
            temp[data[i]]++;
        }

        int dataIndex = 0;
        for(int i=0; i<temp.length; i++){
            if(temp[i]!=0){
                for(int j=0; j<temp[i]; j++){
                    data[dataIndex] = i ;
                    dataIndex++;
                }
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
