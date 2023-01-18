package L35__Java_IO;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write_And_Read {
    String data = "This is file read and file write";
    String filename = "Mine.txt";

    public static void main(String[] args) throws IOException{
        //new File_Writer_1().doWrite();
        new File_Write_And_Read().doRead();
    }

    public void doWrite () throws IOException{
        /*
        //File file = new File("Mine.txt");
        FileWriter fw = new FileWriter(filename);
        fw.write(data);
        fw.close();
       */


        // append     lo tr twy htk yay loh ya
        FileWriter fw = new FileWriter(filename , true);
        fw.append("\nthis is append");
        fw.close();
    }

    public void doRead () throws IOException{
        File file = new File(filename);
        FileReader fr = new FileReader(file);

        int ch;
        while ( (ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
    }
}
