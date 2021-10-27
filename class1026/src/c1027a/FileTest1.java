package c1027a;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("File/data1");
        if(file.exists()){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
            //file.createNewFile();
        }
        if(file.isFile()){
            System.out.println("是文件");
        }
        if(file.isDirectory()){
            System.out.println("是文件夹");
        }
        System.out.println(file.length());


    }
}
