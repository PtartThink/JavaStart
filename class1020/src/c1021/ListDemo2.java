package c1021;

import java.util.ArrayList;

//迭代器遍历
public class ListDemo2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xxx");
        list.add("aaa");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
