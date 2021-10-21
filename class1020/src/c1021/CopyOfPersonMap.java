package c1021;

import java.util.HashMap;
import java.util.Map;

public class CopyOfPersonMap {

    public static void main(String[] args) {
        //向一个map中存放三个person
        Person person1 = new Person(1,"tom",99999);
        Person person2 = new Person(2,"jack",8888);
        Person person3 = new Person(3,"rose",77777);
        HashMap<String, Person> map = new HashMap<String, Person>();
        map.put(person1.getName(), person1);
        map.put(person2.getName(), person2);
        map.put(person3.getName(), person3);
        //删除名字是tom
        map.remove("tom");
        //查询rose的工资
        map.get("rose").getSalary();
    }

}
