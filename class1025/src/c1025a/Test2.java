package c1025a;

public class Test2 {
    public static void main(String[] args) {
        char[] chs = {'A','q','1','3','X','N'};

        //for (int i = 0;i<chs.length;i++){
        for (char ch:chs){
            if(Character.isDigit(ch)){
                System.out.println(ch+"是数字");
            }
            if(Character.isUpperCase(ch)){
                System.out.println(ch+"是大写字母");
            }
            if(Character.isLowerCase(ch)){
                System.out.println(ch+"是小写字母");
            }
        }



    }
}
