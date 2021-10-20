package system;

import java.util.List;
import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        StudentDao dao = new StudentDao();
        do{
            System.out.println("学生管理系统");
            System.out.println("1.一览学生信息");
            System.out.println("2.学生信息添加");
            System.out.println("3.学生信息删除");
            System.out.println("4.学生信息修改");
            System.out.println("5.学号查询学生");
            System.out.println("6.名字查询学生");
            System.out.println("7.退出程序");
            System.out.println("请输入所需操作：");
            input = scan.nextInt();
            while(input<1||input>7){
                System.out.println("输入错误，请重输！");
                input = scan.nextInt();
            }
            switch(input){

                case 1 ->{
                    System.out.println("一览学生信息:");
                    List<Student> stu = dao.getAllStudent();
                    System.out.println("id\t姓名\t年龄");
                    /*if(stu == null){
                        System.out.println("没有数据！");
                    }*/
                    for(Student h :stu){
                        //if (h!=null){
                            System.out.println(h.getId() + "\t" + h.getName() + "\t" + h.getAge());
                        //}
                    }
                }
                case 2 ->{
                    System.out.println("学生信息添加：");
                    System.out.println("请输入要添加的名字");
                    String addName = scan.next();
                    Student student = dao.getStudentByName(addName);
                    if(student==null){
                        System.out.println("请输入要添加的ID:");
                        int addid = scan.nextInt();
                        System.out.println("请输入要添加的年龄:");
                        int addage = scan.nextInt();
                        Student addstudent = new Student(addid,addName,addage);
                        dao.addStudent(addstudent);

                    }else{
                        System.out.println("名字已经存在，添加失败");
                    }

                }
                case 3 ->{
                    System.out.println("学生删除:");
                    System.out.println("请输入想要删除的学生的ID");
                    int deleteName = scan.nextInt();
                    boolean deleteFlag = dao.deleteStudentByID(deleteName);
                    if (deleteFlag) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败");
                    }

                }
                case 4 ->{
                    System.out.println("学生修改:");
                    System.out.println("请输入要修改的id");
                    int updateId = scan.nextInt();
                    if(dao.getStudentByID(updateId)){

                        System.out.println("请输入要添加的年龄:");
                        int updateAge = scan.nextInt();
                        System.out.println("请输入要添加的名字");
                        String updateName = scan.next();
                        Student updateStudent = new Student(updateId,updateName,updateAge);
                        dao.updateStudentData(updateStudent);
                        System.out.println("修改成功");
                    }else {
                        System.out.println("id未找到，修改失败");
                    }


                }
                case 5 ->{
                    System.out.println("学生ID查询:");
                    System.out.println("请输入要查询的ID");
                    int findId = scan.nextInt();
                    boolean h = dao.getStudentByID(findId);
                    if (h) {
                        System.out.println("找到了");
                        //System.out.println(h.getId() + "\t" + h.getName() + "\t" + h.getAge());
                    } else {
                        System.out.println("查无此人！");
                    }

                }
                case 6 ->{
                    System.out.println("学生名字查询:");
                    System.out.println("请输入要查询的名字");
                    String findName = scan.next();
                    Student h = dao.getStudentByName(findName);
                    if (h != null) {
                        System.out.println("找到了");
                        System.out.println(h.getId() + "\t" + h.getName() + "\t" + h.getAge());
                    } else {
                        System.out.println("查无此人！");
                    }

                }
                case 7 ->{
                    System.out.println("退出程序!");
                }
            }
        }while(input != 7);


    }
}
