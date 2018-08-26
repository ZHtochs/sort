package sort;
/*  冒泡排序
    分类 -------------- 内部比较排序
    数据结构 ---------- 数组
    最差时间复杂度 ---- O(n^2)
    最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
    平均时间复杂度 ---- O(n^2)
    所需辅助空间 ------ O(1)
    稳定性 ------------ 稳定 */
public class Bubble extends Sort {
    public void sort(int[] arrays) {
        int length=arrays.length;
        int i,j;
        for(i=0;i<length;i++){
            for (j=length-1;j>0;j--){
                if(arrays[j]<=arrays[j-1]){
                    Sort.exchange(arrays,j-1,j);
                }
            }
        }
    }

}
