package test1;

import java.util.Scanner;

public class test1 {

    Scanner input = new Scanner(System.in);

    private int age;
    private char sex;
    private String name;
    public test1(){ //无参的构造方法

    }

    public test1(int age, char sex, String name){
        this.age = age;
        this.sex = sex;
        this.name = name;
    }


    //private 私有化
    //需要配套get-取值和set-存值方法
    //

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public char getSex(){
        return sex;
    }

    public void setSex(char sex){

        if(sex == '女'){
            this.sex = '女';
        }else {
            this.sex = '男';
        }
        //this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
