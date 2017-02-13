package com.sorts;

/**
 * Created by huaaijia on 2017/2/13.
 */
public class F_BinaryInsertSort {
    public static void main(String[] args) {
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};
        System.out.println("BinaryInsertSort");
        print("Begin:", data);
        bineryInsertSort(data);
        print("End:", data);
    }

    /**
     * 从第二个元素开始，将其插入到前面有序数列的对应位置，将对应位置后面的数据整体后移
     * @param data
     */
    public static void bineryInsertSort(int[] data) {

        for(int i=1; i<data.length; i++){
            if(data[i]<data[i-1]){
                int temp = data[i];
                int low = 0;
                int high = i-1;
                while(low<=high){//重点<=
                    int mid = (low+high)/2;
                    if(data[mid]<temp){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
                for(int j=i; j>low; j--){
                    data[j] = data[j-1];
                }
                data[low] = temp;
                print("第"+i+"次：", data);
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
