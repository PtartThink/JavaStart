package h1019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentListDemo {

    public static void main(String[] args) {
        // 向list中存放三个学生
        List<Student> studentsList = new ArrayList<Student>();
        Student student1 = new Student(1,"a",10);
        Student student2 = new Student(2,"b",20);
        Student student3 = new Student(3,"c",30);

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要查询的ID：");
        int id = input.nextInt();
        boolean ans = false;

        for(int i = 0;i<studentsList.size();i++){
            if (studentsList.get(i).getId() == id){
                System.out.println("有");
                ans = true;
                break;
            }

        }
        if(ans == false){
            System.out.println("没有");
        }



    }

}

