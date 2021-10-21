package c1021;

import java.util.ArrayList;
import java.util.Iterator;

//迭代器遍历
public class ListDemo1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("xxx");
        list.add("aaa");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
