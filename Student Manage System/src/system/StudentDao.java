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
    public void addStudent(Student stu){
        studentsList.add(stu);

    }

    //根据学号查询学生

    public boolean getStudentByID(int id){
        for(int i = 0;i<studentsList.size();i++){
            if (studentsList.get(i)!=null&& (studentsList.get(i).getId())==id){
                return true;//studentsList.get(i);
            }
        }
        return false;
    }

    //根据学号删除学生

    public boolean deleteStudentByID(int id){
        for(int i = 0;i<studentsList.size();i++){
            if (studentsList.get(i)!=null&& (studentsList.get(i).getId())==id){
                studentsList.remove(i);
                return true;
            }
        }
        return false;

    }

    //输入ID，修改其他属性

    public boolean updateStudentData(Student students){

        for(int i = 0;i<studentsList.size();i++){
            if (studentsList.get(i)!=null&& (studentsList.get(i).getId())==students.getId()){
                studentsList.set(i,students);
                return true;
            }
        }
        return false;
    }

    //名字查询学生。

    public Student getStudentByName(String name){

        for(int i = 0;i<studentsList.size();i++){
            if (studentsList.get(i)!=null&& (studentsList.get(i).getName())==name){
                return studentsList.get(i);

            }
        }
        return null;

    }






}
