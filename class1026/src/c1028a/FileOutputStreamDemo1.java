package c1028a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        File file = new File("AFile/test1");
        FileOutputStream fos = new FileOutputStream(file,true);//默认否，覆盖。true则是追加内容。
        String str = "aaabbb";
        for(int i = 0;i < str.length();i++){
            fos.write(str.charAt(i));
        }
        fos.close();

    }
}
