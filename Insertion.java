package sort;

public class Insertion extends Sort {
    // 分类 ------------- 内部比较排序
    // 数据结构 ---------- 数组
    // 最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
    // 最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
    // 平均时间复杂度 ---- O(n^2)
    // 所需辅助空间 ------ O(1)
    // 稳定性 ------------ 稳定

    public void sort(int arrays[]) {
        int length = arrays.length;
        int i;
        for (i = 1; i < length; i++) {
            int j=i;
            while (j >= 1) {
                if (arrays[j - 1] > arrays[j]) {
                    Sort.exchange(arrays, j, j - 1);
                    j--;
                } else
                    break;
            }
        }
    }
}

