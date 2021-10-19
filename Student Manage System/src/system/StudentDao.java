package system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    List<Student> studentsList = new ArrayList<Student>();
    Scanner input = new Scanner(System.in);

    //返回所有学生信息。
    public List<Student> getAllStudent(){
        return studentsList;
    }

    //学生添加
    public void addStudent(List<Student> stu){
        studentsList.add((Student) stu);

    }

    //根据学号查询学生

    public Student getStudentByID(int id){
        for(int i = 0;i<studentsList.size();i++){
            if (studentsList.get(i)!=null&& (studentsList.get(i).getId())==id){
                return studentsList.get(i);
            }
        }
        return null;
    }


}
