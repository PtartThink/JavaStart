package systemTeacher;

import java.util.ArrayList;

public class StudentDao {
    private static ArrayList<Student> list = new ArrayList<Student>();
    static{
        list.add(new Student(1,"tom", 20));
        list.add(new Student(2,"jack",15));
        list.add(new Student(3,"rose",20));
    }
    //遍历：一览学生信息
    public ArrayList<Student> getAllStudents(){
        return list;
    }
    //根据名字查询对应的下标，没有返回-1
    public int getIndexByName(String name){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getNameString().equals(name)){
                return i;//返回下标
            }
        }
        return -1;
    }
    //6、根据名字查询学生
    public Student getStudentByName(String name){
        //调用获得下标方法，判断是否有学生
        int index = getIndexByName(name);
        if(index != -1){
            return list.get(index);
        }
        return null;
    }
    //3、根据名字删除英雄，没有名字删除失败
    public boolean deleteStudentByName(String name){
        //调用获得下标方法，判断是否有学生
        int index = getIndexByName(name);
        if(index != -1){
            list.remove(index);
            return true;
        }
        return false;
    }
    //2、学生添加，ID自动生成，名字不能重名，其余的自己填
    public  boolean addStudent(String name,int age) {
        int index = getIndexByName(name);
        if(index == -1){//可以添加
            int max = 0;
            for(Student student:list){
                if(student.getId()>max){
                    max = student.getId();
                }
            }
            Student addStudent = new Student(max+1, name, age);
            list.add(addStudent);
            return true;
        }else{
            return false;
        }
    }
    //4、输入ID，修改其他属性
    public boolean updateStudent(Student student){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId() == student.getId()){//找着了
                list.get(i).setNameString(student.getNameString());
                list.get(i).setAge(student.getAge());
                return true;
            }
        }
        return false;
    }
    //根据年龄查询学生
    public ArrayList<Student> getStudentsByAge(int age){
        ArrayList<Student> ageList = new ArrayList<Student>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getAge() == age){
                ageList.add(list.get(i));
            }
        }
        return ageList;
    }
}
