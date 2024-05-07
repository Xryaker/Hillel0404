package lesson0411.lesson0205;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lesson12 {
    public static void main(String[] args) {

        String[] worlds=new String[2];
        worlds[0]="Vasiliy";
        worlds[1]="Oleg";

        List<String> list=new ArrayList();
        list.add("jdsjjjd");
        list.add("vasiliy");
        list.add("oleg");
        System.out.println(list);
        list.remove(0);
        list.remove("vasiliy");
        System.out.println(list);
        list.add("oleg");
        list.add("oleg");
        System.out.println(list);

        for (String str : list) {
            System.out.println(str+"====");
        }

        Set<String> strings=new TreeSet<>();
        strings.add("Василий");
        strings.add("Вааилий");
        strings.add("+?:%;%");
        strings.add("Viktoria");
        strings.add("Vasiliy");
        System.out.println(strings);

        for (String string : strings) {
            System.out.println(string+"----");
        }

    }
}
