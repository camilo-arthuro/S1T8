package level1.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void runProgram(){
        //create list
        List<String> list = new ArrayList<>();

        //add value
        list.add("Camilo");
        list.add("29");
        list.add("Adria");
        list.add("2.5");
        list.add("Carl");
        list.add("3");

        //order the list
        list.sort((v1,v2) -> Integer.compare(v2.length(),v1.length()));

        //show result
        System.out.println("Values ordered from the shortest to longest" + list);
    }
}
