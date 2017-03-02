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
     *
     * @param data
     */
    public static void shellSort(int[] data) {
        for (int step = data.length / 2; step >= 1; step = step / 2) {//步长
            for (int i = 0; i < step; i++) {//当前步长下，分多少组排序

                //改良版插入排序
                for (int index = i + step; index < data.length; index = index + step) {
                    if (data[index] < data[index - step]) {
                        int temp = data[index];
                        int idx_pro_its = index - step; //当前索引前面那些需要比较的对象
                        while (idx_pro_its >= 0 && temp < data[idx_pro_its]) {
                            data[idx_pro_its + step] = data[idx_pro_its];
                            idx_pro_its = idx_pro_its - step;
                        }
                        data[idx_pro_its + step] = temp;
                    }


                    print("步长-分组-idx   " + step + "-" + (i+1) + "-" + index + "：", data);
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