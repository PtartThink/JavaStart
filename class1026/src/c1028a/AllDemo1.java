package c1028a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AllDemo1 {

    public static void main(String[] args) throws IOException {

        File file = new File("AFile/test1");
        FileInputStream fis = new FileInputStream(file);
        byte[] bys = new byte[(int)file.length()];
        fis.read(bys);//读入数组
        String str = new String(bys);

        File file1 = new File("AFile/test2");
        FileOutputStream fos = new FileOutputStream(file1);
        byte[] arr = str.getBytes();
        fos.write(arr);
        fos.close();

        fis.close();



    }

}
