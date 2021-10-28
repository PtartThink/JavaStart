package c1028a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("AFile/test1");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String str = br.readLine();
        System.out.println(str);

        while(true){
            String line = br.readLine();
            if(line == null){
                break;
            }
            //System.out.println(br.readLine());
            System.out.println(line);
        }

        br.close();
        fileReader.close();






    }
}
