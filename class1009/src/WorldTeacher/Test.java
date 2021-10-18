package WorldTeacher;

public class Test {
    public static void main(String[] args) {
        Person father = new Person("李","泳江",40, '男');
        Person mather = new Person("考","鱼",20, '女');
        //God canmakechild = new God();
        //Person child = canmakechild.makeChild(father,mather);
        Person child = God.makeChild(father,mather);
        if(child!=null){
            child.show();
        }else{
            System.out.println("没有孩子");
        }



    }
}
