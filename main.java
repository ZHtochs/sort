package sort;

public class main {
    /**
     * 执行入口，intArrays：待排序的数组，displaySort：是否显示排序前和排序后的内容
     */
    public static void run(int intArrays[],Sort sort){
        int arrays[]= intArrays.clone();
            NumberUtils.display(arrays,false);
        long startTime=System.currentTimeMillis();
        if(Quick.class == sort.getClass())
            sort.sort(arrays,0,arrays.length-1);//快排
        else
            sort.sort(arrays);
        long endTime=System.currentTimeMillis();
            NumberUtils.display(arrays,true);
        System.out.println(sort.getClass()+"排序用时："+(endTime-startTime)+"毫秒");
    }
    /**
     * 测试排序用的主方法
     */
    public static void main(String[] args){
        //数组长度
        int length=30000;
        //最大值
        int max =1000000;;
        //随机获取的排序数组
        int arrays[]= NumberUtils.getRandomArs(length,max);
        Sort Insertion=new Insertion();//插入排序
        Sort quick=new Quick();//快速排序
        run(arrays,Insertion);
        run(arrays,quick);
    }
}
