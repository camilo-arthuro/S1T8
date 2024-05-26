package level1.exercise5;

import level1.exercise5.interfaces.PiValue;

public class Program {
    public static void runProgram(){
        PiValue value = () -> 3.1415;
        System.out.println("Result " + value.getPiValue());
    }
}
