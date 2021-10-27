package c1027a;

import java.io.File;
import java.util.Arrays;

public class FileTest2 {
    public static void main(String[] args) {

        File file = new File("File");
        System.out.println(file.getAbsolutePath());
        System.out.println(Arrays.toString(file.listFiles()));

    }
}
