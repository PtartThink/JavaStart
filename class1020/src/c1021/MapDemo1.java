package c1021;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //integer int类型的包装类。
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(10,"aaa");
        map.put(20,"bbb");
        map.put(30,"sss");

        System.out.println(map.get(1));
        System.out.println(map.get(10));
        System.out.println(map.get(30));
        //如何遍历？
        //获得所有的key，遍历。
        for(Integer key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        //获得value，遍历。
        for (String value:map.values()){
            System.out.println(value);
        }

    }
}
