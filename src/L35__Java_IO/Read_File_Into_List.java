package L35__Java_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Read_File_Into_List {
    String data = "sfai asffwo ossaf sfjaosfi vafowp ow";
    String filename = "hello.txt";

    public static void main(String[] args) throws IOException {
        new Read_File_Into_List().doWrite();
        new Read_File_Into_List().doRead();
    }

    public void doWrite ()throws IOException{
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        fw.write(data);
        fw.close();
    }

    public void doRead()throws IOException{
        List<String>list = Collections.emptyList();
        list = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        for (String str : list){
            System.out.println(str);
        }


        //  Read test file as string
        String s = new String(Files.readAllBytes(Paths.get(filename)));
        System.out.println(s);
    }
}
