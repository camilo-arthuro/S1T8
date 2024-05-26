package level1.exercise8;

import level1.exercise8.interfaces.ReverseMethod;

public class Program {
    public static void runProgram(){
        //create lambda expression
        ReverseMethod chain = value -> new StringBuilder(value).reverse().toString();

        //call the method
        System.out.println(chain.reverse("Camilo Arthuro Delgado Lince"));
    }
}
