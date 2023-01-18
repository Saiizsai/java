package L4__Constructor;

/*
code block 2 myo shi
static / instance
method hte ka code block so local block loh call

*variable twy ko ta chr file initialize lod chin yin code block ko tone

method out ka code block ka lock block
class out ka code block ka initalization block
2myo shi static / instance

static variable ko access lod chin yin static block ko tone
 */

import java.io.FileInputStream;
import java.util.Properties;

public class CodeBlock {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.show();
    }
}

class Hello{

    //device ma tu ll kaw p run loh ya
    String name;
    int count;
    {
        try(FileInputStream input = new FileInputStream("settings.propeties")){

            Properties props = new Properties();
            props.load(input);

            name = props.getProperty("name");
            count = Integer.parseInt(props.getProperty("count"));

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    void show(){
        for (int i = 0 ; i<count ;i ++){
            System.out.println(name);
        }
    }
}

class staticDemo{
    static {

    }
}
