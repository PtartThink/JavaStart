package c1028a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {

    public static void main(String[] args) {
        //定义文件
        File file = new File("AFile/test1");
        FileInputStream fis = null;
        //定义字节输入流
        try {
            fis = new FileInputStream(file);
            for(int i=1;i<=file.length();i++) {
                char b =(char) fis.read();//逐个读
                System.out.print(b);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }finally {
            try {
                fis.close();//关闭流
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

}
