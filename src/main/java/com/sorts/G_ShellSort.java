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

    /**
     * 缩小步长排序
     * @param data
     */
    public static void shellSort(int[] data) {
        for(int step = data.length/2; step>=1; step = step/2){//步长
            for(int i=0; i<step; i++){//当前步长下，分多少组排序

                //改良版快速排序
                for (int j = i+step; j < data.length; j=j+step) {
                    if (data[j] < data[j - step]) {
                        int temp = data[j];
                        int j2 = j - step;
                        while (j2 >= 0 && temp < data[j2]) {
                            data[j2 + step] = data[j2];
                            j2=j2-step;
                        }
                        data[j2 + step] = temp;
                        print("第" + j + "次：", data);
                    }
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