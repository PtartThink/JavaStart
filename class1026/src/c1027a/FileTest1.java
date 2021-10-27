package c1027a;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("file1");
        if(file.exists()){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
    }
}
