package com.sorts;

/**
 * Created by huaaijia on 2017/2/4.
 */
public class B_HeapSort {

    public static void main(String[] args){
        int[] data = new int[]{33, 5, 35, 3, 6, 2, 23, 90, 1, 9, 32, 4, 12, 8, 7};
        System.out.println("HeapSort");
        print("Begin:", data);
        heapSort(data);
        print("End:", data);
    }

    /**
     * 1 关键是将最大数据放置在堆顶，然后将堆顶的数据和还没有被排序的最后一个数据对掉
     * 2 此时出去堆末尾已经排序好的数据，将生于数据再重新进行最大堆的创建
     * @param data
     */
    public static void heapSort(int[] data){
        for(int i=0; i<data.length-1; i++){
            createMacHeap(data, data.length-1-i);//需要创建堆的最大下标值
            //创建完堆之后，堆顶是最大数据，将其与创建堆集合中的最后一个数据对掉
            swap(data, 0, data.length-1-i);
            print("第" + (i + 1) + "次:", data);
        }
    }

    /**
     * i parentNode     (i-1)/2 的整数部分
     * i leftChildNode  2i+1
     * i rightChildNode 2i+2
     * @param data
     * @param lastIndex
     */
    public static void createMacHeap(int[] data, int lastIndex){
        for(int i=(lastIndex-1)/2; i>=0; i--){//循环当前堆的层数次，取lastIndex的父节点第一次循环
            //保存当前节点到k，这一步很重要，因为当从最后的数据往上创建最大堆的时候，到了堆的中部，
            //这时，有可能替换到子节点的数据，还有子节点，此时当前数据不一定比他的子节点数据大
            int k=i;
            //若当前节点的子节点存在
            while((2*k+1)<=lastIndex){
                // biggerIndex 记录子节点中较大数值的index，先赋值为左子节点
                int biggerIndex = 2*k+1;
                if(biggerIndex < lastIndex){
                    // 若左子节点存在
                    if(data[biggerIndex] < data[biggerIndex+1]){
                        //若左子节点大于右子节点的值，则将biggerIndex赋值为右子节点的index
                        biggerIndex = biggerIndex+1;
                    }
                }
                //此时将子节点中较大的数据和父节点，也就是i位置上的数据进行比较
                if(data[k]<data[biggerIndex]){
                    swap(data, k, biggerIndex);
                    k = biggerIndex;//如果当前子节点还有他自己堆子节点，那么继续向下创建堆，保证父节点最大
                }else{
                    break;
                }
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
}
