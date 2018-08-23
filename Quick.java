package sort;

public class Quick extends Sort{
    // 分类 ------------ 内部比较排序
    // 数据结构 --------- 数组
    // 最差时间复杂度 ---- 每次选取的基准都是最大（或最小）的元素，导致每次只划分出了一个分区，需要进行n-1次划分才能结束递归，时间复杂度为O(n^2)
    // 最优时间复杂度 ---- 每次选取的基准都是中位数，这样每次都均匀的划分出两个分区，只需要logn次划分就能结束递归，时间复杂度为O(nlogn)
    // 平均时间复杂度 ---- O(nlogn)
    // 所需辅助空间 ------ 主要是递归造成的栈空间的使用(用来保存left和right等局部变量)，取决于递归树的深度，一般为O(logn)，最差为O(n)
    // 稳定性 ---------- 不稳定
    /*Java系统提供的Arrays.sort函数。对于基础类型，底层使用快速排序。对于非基础类型，底层使用归并排序。请问是为什么？
　　答：这是考虑到排序算法的稳定性。
    对于基础类型，相同值是无差别的，排序前后相同值的相对位置并不重要，所以选择更为高效的快速排序，尽管它是不稳定的排序算法；
    而对于非基础类型，排序前后相等实例的相对位置不宜改变，所以选择稳定的归并排序。*/
    public void sort(int[] arrays,int left, int right){
        if(left>right)
            return;
        int i=left;
        int j=right;
        while (i!=j){
            //一定要j先动
            while (j>i && arrays[j]>=arrays[left]){
                j--;
            }
            while (i<j && arrays[i]<=arrays[left]){
                i++;
            }
            if(i<j){
                Quick.exchange(arrays,i,j);
            }
        }
        Sort.exchange(arrays,left,i);
        sort(arrays,left,i-1);
        sort(arrays,j+1,right);
    }
}
