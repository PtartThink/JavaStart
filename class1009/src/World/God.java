package World;

import java.util.Random;

public class God {

    /*繁衍后代的方法
      要求是一男一女*/

    private static Person[] canMakeSonPerson = new Person[2];
    private static Person[] son = new Person[1];

    public static boolean addPerson(Person person){

        // static
        for(int i=0;i<canMakeSonPerson.length;i++){
            //找位置
            if(canMakeSonPerson[i]==null){
                canMakeSonPerson[i] = person;
                return true;
            }
        }
        return false;//没有空位添加失败
    }
    public static String canMakeSon(){
        if(!canMakeSonPerson[0].getSex().equals(canMakeSonPerson[1].getSex())){
            if(canMakeSonPerson[0].getAge()>=23&&canMakeSonPerson[1].getAge()>=20){
                System.out.println("孩子的姓名是"+canMakeSonPerson[0].getXing()+canMakeSonPerson[1].getXing());
                return "生育成功！";
                //son[0] = Person(canMakeSonPerson[0].getXing(),canMakeSonPerson[1].getXing(),1,"男");


            }else {
                return "年龄不够 无法生育！";
            }
        }else {
            return "性别相同 无法生育！";
        }
    }


}
