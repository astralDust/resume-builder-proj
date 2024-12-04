import java.util.Scanner;

public class UserInterface {

    static Scanner scnr = new Scanner(System.in);

    public static void Menu() {

        System.out.println("Welcome to the resume builder program!");
        System.out.println("What would you like to do?");
        System.out.println("""
                1: Create new resume
                2: Open existing resume
                3: Exit the program
                """);

        

    }

}
