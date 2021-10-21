package c1021;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        //有一个list集合，存放了5个字符串，分别是 aaa aaa aaa bbb bbb 去掉重复元素，打印每个元素。

        List<String> list;
        String[] strs = {"aaa","aaa","aaa","bbb","bbb"};
        list = Arrays.asList(strs);//数组转list
        Set<String> set = new HashSet<String>();
        for(String s:list){
            set.add(s);
        }
        System.out.println("去重后");
        for (String s:set){
            System.out.println(s);
        }


    }



}
