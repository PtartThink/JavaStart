package c1028a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {

        File file = new File("AFile/test1");
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("ad");
        bw.newLine();
        bw.write("aad");
        bw.newLine();
        bw.write("aaddf");
        bw.newLine();
        bw.close();
        fw.close();


    }
}
