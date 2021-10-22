package h1022;

public class AgeException extends Exception {
    public AgeException(){
        super("年龄异常");//Exception有一个String类型构造器，为message赋值
    }
}
