package level1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void runProgram(){
        //list of Strings
        List<String> stringList = new ArrayList<>();

        //values of the list
        stringList.add("Camilo");
        stringList.add("Adrian");
        stringList.add("Carlos");
        stringList.add("Barbara");
        stringList.add("Ivan");

        //call the method returnList
        List<String> returnedList = returnList(stringList);

        //print result
        System.out.println(returnedList);
    }

    public static List<String> returnList(List<String> stringList){
        return stringList.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }
}
