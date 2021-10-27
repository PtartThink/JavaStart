package c1027a;

public class Test1 {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Java");

        strBuf.append(" Guide Ver1/");  //连接
        System.out.println(strBuf);
        strBuf.append(3);
        System.out.println(strBuf);

        strBuf.insert(5, "Student");    //插入
        System.out.println(strBuf);

        strBuf.setCharAt(20, '.');      //替换字符
        System.out.println(strBuf);

        strBuf.reverse();               //倒序
        System.out.println(strBuf);

        String str = strBuf.toString();
        System.out.println(str);
    }
}
