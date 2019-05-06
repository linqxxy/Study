package test1.wwh.src;

public class Add {
    //数组方法实现多个参数，等同于int...sum，不构成重载方法，因为参数列表相同。
    public static int add(int[]sum){
        int add=0;
        for(int i=0;i<sum.length;i++){
            add+=sum[i];
        }
        return add;
    }
    //可变参数（必须定义在参数列表的最后）在使用时当做数组使用
    //在调用时可以传入多个参数，不传时默认为空数组。
    public static final int sum(int ... data){
        int sum=0;
//        for(int i=0;i<data.length;i++){
//            sum+=data[i];
//        }
        //不需要通过下标访问元素，避免下标越界，在需要下标访问时，还是使用for循环。
        //可以遍历各种集合。
        for (int x:data
             ) {
            sum+=x;
        }
        return sum;
    }
}
