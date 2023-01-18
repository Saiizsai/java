package L35__Java_IO;

import javax.annotation.processing.Filer;
import java.io.*;

public class Buffer_Write_And_Read {
    String data = "this is buffer reader and writer";
    String filename = "sai.txt";

    public static void main(String[] args) throws IOException {
        //new Buffer_Write_And_Read().doWrite();
        new Buffer_Write_And_Read().doRead();
    }

    public void doWrite() throws IOException{
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(data);
        bw.close();

        // 1 sint hte nk yay
        //BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
        //bw.write(data);
        //bw.close();
    }

    public void doRead()throws IOException{
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
