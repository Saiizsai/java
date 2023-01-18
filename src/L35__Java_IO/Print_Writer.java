package L35__Java_IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer {
    String data = "this is print writer";
    String filename = "pw.txt";

    public static void main(String[] args)throws IOException {
        new Print_Writer().doWrite();
    }

    public void doWrite()throws IOException {
        File file = new File(filename);
        PrintWriter pw = new PrintWriter(file);
        pw.write("hey brown cow in down town");
        pw.close();
    }
}
