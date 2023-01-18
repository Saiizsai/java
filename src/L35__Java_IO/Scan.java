package L35__Java_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Scan {
    String data = "this scanner \n hello i'm sai haling phyo aung";
    String filename = "mine.txt";

    public static void main(String[] args)throws IOException {
        new Scan().doRead();
    }

    public void doRead() throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
