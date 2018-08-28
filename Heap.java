package sort;

public class Heap extends Sort {
// 分类 -------------- 内部比较排序
// 数据结构 ---------- 数组
// 最差时间复杂度 ---- O(nlogn)
// 最优时间复杂度 ---- O(nlogn)
// 平均时间复杂度 ---- O(nlogn)
// 所需辅助空间 ------ O(1)
// 稳定性 ------------ 不稳定
    @Override
    public void sort(int[] arrays){
        //建立堆
        for (int i=arrays.length/2;i>=0;i--){
            heapSort(arrays,i,arrays.length);
        }
        // 进行n-1次循环，完成排序
        for (int i = arrays.length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            Sort.exchange(arrays,0,i);
            // 筛选 R[0] 结点，得到i-1个结点的堆
            heapSort(arrays, 0, i);
        }
    }
    private static void heapSort(int[] arrays, int parent, int length){
    /**
    * 交换第一个和最后一个元素，输出最后一个元素（最大值），然后把剩下元素重新调整为大根堆
     * 左节点为2*i+1,右节点为2*(i+1)
    */
        int temp = arrays[parent];
        int child =2*parent+1;
        while(child<length){//如果有左节点
            if(child+1<length && arrays[child]<arrays[child+1])
              //如果有右节点并且右节点的值大于左节点,则选择右节点
               child++;
            if(temp>=arrays[child])
               break;
            arrays[parent] = arrays[child];
            // 选取孩子结点的左孩子结点,继续向下筛选
            parent = child;
            child = 2 * child + 1;
        }
        arrays[parent] = temp;
    }

}
