package c1028a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {

        File file = new File("AFile/test1");
        FileInputStream fis = new FileInputStream(file);
        byte[] bys = new byte[(int)file.length()];
        fis.read(bys);//读入数组
        System.out.println(bys);
        System.out.println(Arrays.toString(bys));
        String str = new String(bys);
        System.out.println(str);

    }
}
