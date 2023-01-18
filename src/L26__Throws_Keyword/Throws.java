package L26__Throws_Keyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException{
        met();
    }

    public static void met() throws FileNotFoundException {
        File file = new File("text.txt");

        FileReader fileReader = new FileReader(file);

    }
}
