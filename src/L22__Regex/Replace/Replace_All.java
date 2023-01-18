package L22__Regex.Replace;

public class Replace_All {
    public static void main(String[] args) {

        String original = "Original";
        String modified ;
        modified = original.replaceAll("[aeiou]" , "@");
        System.out.println(modified);

        String originalText = "This is OOP";
        String modifiedText  ;
        modifiedText = originalText.replaceAll("OOP", "Object oriented program");
        System.out.println(modifiedText);

        String str = "123-45-6789";
        str = str.replaceAll("[0-9]{3}-[0-9]{2}-[0-9]{4}","xxx-xx-xxxx");
        System.out.println(str);

        //o bl lout twae" o2 lone htk po yin o2 lone nk a sr hto
        String str1 = "this is oooooooop ";
        str1 = str1.replaceAll("o{2,}", "oo");
        System.out.println(str1);

        //   \\b blah blah \\b space twae my replace lod py
        String str2 = "attempt and temp";
        str2 = str2.replaceAll("\\btemp\\b" , "temporary");
        System.out.println(str2);
    }
}
