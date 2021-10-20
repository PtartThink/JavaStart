package systemTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        //遍历：一览学生信息
//		2、学生添加，ID自动生成，名字不能重名，其余的自己填
//		3、根据名字删除英雄，没有名字删除失败
//		4、输入ID，修改其他属性
//		5、根据年龄查询
//		6、根据名字查询
//		7、退出程序
        Scanner scan = new Scanner(System.in);
        int input;
        StudentDao dao = new StudentDao();
        do{
            System.out.println();
            System.out.println("欢迎来到我的学生系统");
            System.out.println("1一览学生信息");
            System.out.println("2学生添加");
            System.out.println("3学生删除");
            System.out.println("4学生修改");
            System.out.println("5学生年龄查询");
            System.out.println("6学生名字查询");
            System.out.println("7退出程序");
            System.out.print("请输入操作符：");
            input = scan.nextInt();
            switch(input){
                case 1:
                    System.out.println("1一览学生信息");
                    ArrayList<Student> list = dao.getAllStudents();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 2:
                    System.out.println("2学生添加");
                    System.out.println("请输入添加的名字");
                    String addNameString = scan.next();
                    System.out.println("请输入年龄");
                    int addAge = scan.nextInt();
                    if(dao.addStudent(addNameString, addAge)){
                        System.out.println("添加成功");
                    }else{
                        System.out.println("添加失败");
                    }
                    break;
                case 3:
                    System.out.println("3学生删除");
                    System.out.println("请输入想要删除的名字");
                    String deleteName = scan.next();
                    if(dao.deleteStudentByName(deleteName)){
                        System.out.println("删除成功");
                    }else{
                        System.out.println("删除失败");
                    }
                    break;
                case 4:
                    System.out.println("4学生修改");
                    System.out.println("请输入修改的id");
                    int updateId = scan.nextInt();
                    System.out.println("请输入修改的名字");
                    String updateName = scan.next();
                    System.out.println("请输入修改的年龄");
                    int updateAge = scan.nextInt();
                    if(dao.updateStudent(new Student(updateId, updateName, updateAge))){
                        System.out.println("修改成功");
                    }else{
                        System.out.println("修改失败");
                    }
                    break;
                case 5:
                    System.out.println("5学生年龄查询");
                    System.out.println("请输入要查询的年龄");
                    int findAge = scan.nextInt();
                    ArrayList<Student> list2 = dao.getStudentsByAge(findAge);
                    if(list2.size()==0){
                        System.out.println("该年龄没有学生");
                    }else{
                        for (int i = 0; i < list2.size(); i++) {
                            System.out.println(list2.get(i));
                        }
                    }
                    break;
                case 6:
                    System.out.println("6英雄名字查询");
                    System.out.println("请输入要查询的名字");
                    String findName = scan.next();
                    Student findStudent = dao.getStudentByName(findName);
                    if(findStudent!=null){
                        System.out.println(findStudent);
                    }else {
                        System.out.println("没有这个人");
                    }
                    break;
                case 7:
                    System.out.println("7退出程序");
                    break;
            }
        }while(input != 7);
    }

}


