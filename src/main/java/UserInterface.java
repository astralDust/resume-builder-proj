package main.java;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    static Scanner scnr = new Scanner(System.in);
    static String UserInput = "";

    public static void Menu() {

        System.out.println("Welcome to the resume builder program!");
        System.out.println("What would you like to do?");
        System.out.println("""
                1: [C]reate new resume
                2: [O]pen existing resume
                3: E[x]it the program
                """);


        UserInput = scnr.next();
        Set<String> validInputs = Set.of("C", "O", "x");
        
        do { 

            UserInput = scnr.next();
            if (!validInputs.contains(UserInput)) {
                System.out.println("Enter a valid input!");
            }

        } while (!validInputs.contains(UserInput));

        switch (UserInput) {
            case "C" -> {
                System.out.println("Creating new resume...");
                // createNewResume();
            }
            case "O" -> {
                System.out.println("Opening existing resume...");
                // openExistingResume();
            }
            case "x" -> {
                System.out.println("Exiting the program...");
                // exitProgram();
            }
            default -> System.out.println("Invalid option!");
        }

    }

}
