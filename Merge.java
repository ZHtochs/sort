package sort;

public class Merge extends  Sort {
    // 分类 -------------- 内部比较排序
    // 数据结构 ---------- 数组
    // 最差时间复杂度 ---- O(nlogn)
    // 最优时间复杂度 ---- O(nlogn)
    // 平均时间复杂度 ---- O(nlogn)
    // 所需辅助空间 ------ O(n)
    // 稳定性 ------------ 稳定
    //每次合并操作的平均时间复杂度为O(n)，而完全二叉树的深度为|log2n|。总的平均时间复杂度为O(nlogn)。
    @Override
    public void sort(int[] arrays){
        int[] temp=new int[arrays.length];
        sort(arrays,temp,0,arrays.length-1);
    }
    private static void sort(int[] arrays,int[] temp,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            sort(arrays,temp,left,mid);//归并左边
            sort(arrays,temp,mid+1,right);//归并右边
            merge(arrays,temp,mid,left,right);//合并两个有序数组
        }
    }
    private static void merge(int[] arrays,int[] temp,int mid,int left,int right){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid && j<=right){
            if(arrays[i]<=arrays[j]){
                temp[t++]=arrays[i++];
            }
            else {
                temp[t++]=arrays[j++];
            }
        }
        while (i<=mid){
            temp[t++]=arrays[i++];
        }while (j<=right){
            temp[t++]=arrays[j++];
        }
        t=0;
        while (left<=right){
            arrays[left++]=temp[t++];
        }

    }
}
