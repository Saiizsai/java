package L31__Process_Builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder builder = new ProcessBuilder("adb" , "-d" , "logcat");
        try {
            Process process = builder.start();
            InputStreamReader in = new InputStreamReader(process.getInputStream());
            BufferedReader br = new BufferedReader(in);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
