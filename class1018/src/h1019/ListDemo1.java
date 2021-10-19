package h1019;

import java.util.ArrayList;

public class ListDemo1 {

    public static void main(String[] args) {
        //定义存放String类型的list集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //获得list的元素的个数
        System.out.println(list.size());
        System.out.println(list.get(1));//获得第二个元素
        //实现使用循环遍历每一个元素打印出来
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //list.set(2, "xxxx");//把第三个位置替换成xxxx
        //list.remove(1);//根据索引删除
        list.remove("ccc");//根据对象删除
        //for(循环变量的类型  循环变量:遍历的集合)
        System.out.println("遍历~~~~~");
        for(String str:list){
            System.out.println(str);
        }
        list.clear();//清空
        System.out.println(list.size());
    }

}
