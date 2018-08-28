package sort;

public class Selection extends Sort {
    // 分类 -------------- 内部比较排序
// 数据结构 ---------- 数组
// 最差时间复杂度 ---- O(n^2)
// 最优时间复杂度 ---- O(n^2)
// 平均时间复杂度 ---- O(n^2)
// 所需辅助空间 ------ O(1)
// 稳定性 ------------ 不稳定
    @Override
        public void sort(int[] arrays) {
            int length = arrays.length;
            for (int i = 0; i < length; i++) {
                int min=i;
                for (int j = i + 1; j < length ; j++) {
                    if (arrays[min] > arrays[j]) {
                        min=j;
                    }
                }
                Sort.exchange(arrays,i,min);
            }
        }
}
