package level1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void runProgram(){
        //create the list
        List<String> months = new ArrayList<>();

        //add months
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        //print with method reference
        months.forEach(System.out::println);
    }
}
