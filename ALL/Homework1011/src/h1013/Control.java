package h1013;

public class Control{
    public void control(Teacher teacher){
        System.out.println("开始评估");

        if(teacher instanceof JavaTeacher){
            System.out.println("传入了Java老师");

        }
        if(teacher instanceof NetTeacher){
            System.out.println("传入了Net老师");
        }
        if(teacher instanceof DBTeacher){
            System.out.println("传入了DB老师");
        }
        teacher.PG();
    }
}
