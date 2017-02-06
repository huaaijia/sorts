package com.sorts;

/**
 * Created by huaaijia on 2017/2/4.
 */
public class C_BubbleSort {

    public static void main(String[] args){
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};

        System.out.println("HeapSort");
        print("Begin:\t", data);
        bubbleSort(data);
        print("End:\t", data);
    }

    public static void bubbleSort(int[] data){
        int loopTimes = 0;
        for(int i=data.length-1; i>0; i--){
            loopTimes = loopTimes + 1;

            //记录在接下来这次冒泡操作是否有交换的操作发生
            boolean swapped = false;
            for(int j=0; j<i; j++){
                if(data[j]>data[j+1]){
                    swap(data, j, j+1);
                    swapped = true;
                    print("第" + formatNumber(loopTimes) + "-" +formatNumber(j+1)+ "次:", data);
                }
            }
            if(!swapped){
                //如果这一次循环没有进行任何交换，证明数据已经进入有序状态，接下来的冒泡操作可以不做了，节约开销。
                break;
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

    public static String formatNumber(int n){
        if(n<10){
            return "0"+n;
        }else{
            return n+"";
        }
    }
}
