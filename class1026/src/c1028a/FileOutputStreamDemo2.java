package c1028a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("AFile/test1");
        FileOutputStream fos = new FileOutputStream(file);
        String str = "xxddea111";
        byte[] arr = str.getBytes();
        fos.write(arr);
        fos.close();
    }
}
