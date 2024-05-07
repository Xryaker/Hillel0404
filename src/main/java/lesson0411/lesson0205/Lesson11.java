package lesson0411.lesson0205;

import org.apache.maven.surefire.shade.org.codehaus.plexus.util.StringUtils;

import java.util.Arrays;

public class Lesson11 {
    public static void main(String[] args) {
        String str="vasiliy Shevchenko Bogdan";
        System.out.println(str.length());
        System.out.println(str.substring(3,7).toUpperCase());
        System.out.println(str.contains("Shev"));
        if(str.contains("vasliy")){
            System.out.println("Hello");
        }else{
            System.out.println("Vasiliy ===");
        }
        System.out.println(str.replace("vasiliy", "Oleg"));
        System.out.println(str);
        str=str.replace("vasiliy","oleg");
        System.out.println(str);


        String sentence = "Hello my dear friend!";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words[1]);

        String result = "AniMaL ".trim().toLowerCase().replaceFirst("a", "A");
        System.out.println(result);
        System.out.println("AniMaL ".substring(0, 1).toUpperCase() + "AniMaL ".substring(1).toLowerCase());
        System.out.println(StringUtils.capitalise("animal"));
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("vasiliy");
        stringBuilder.append("Shevchenko");
        System.out.println(stringBuilder);
    }
}
