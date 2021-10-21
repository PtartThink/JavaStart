package c1021;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {

    public static void main(String[] args) {
        //向一个map中存放三分person，person的id作为key，person本身做value。
        Map<Integer,Person> map1 = new HashMap<Integer,Person>();
        Person person1 = new Person(1,"a",1000);
        Person person2 = new Person(2,"b",2000);
        Person person3 = new Person(3,"c",3000);

        map1.put(person1.getId(),person1);
        map1.put(person2.getId(),person2);
        map1.put(person3.getId(),person3);
        //查询1号人的名字。

        System.out.println(map1.get(1).getName());

        if(map1.get(10)!=null){
            System.out.println(map1.get(10).getName());

        }else{
            System.out.println("查无此人");
        }


        //删除
        if (map1.get(4)!=null){
            map1.remove(3);
        }else {
            System.out.println("查无此人");
        }

    }



}
