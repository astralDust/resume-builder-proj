package resumemanager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.Scanner;

public class ResumeManager{
    public static void createresume(Scanner scnr){
        System.out.println("Creating Resume...");
        System.out.println("Enter Your Name: ");
        String name = scnr.next();
        System.out.println("Enter email: ");
        String email = scnr.next();
        System.out.println("Enter your age: ");
        int age = scnr.nextInt();
        System.out.println("Enter past experiences: ");
        String experience = scnr.next();
        System.out.println("Enter any skills: ") 
        String skills = scnr.next();


        //Saving details to a file
        try(FileWriter writer = new FileWriter(name + "resune.txt")) {
            writer.write("Name: "+name+"\n" );
            writer.write("Age: "+age+"\n");
            writer.write("Email: "+email+"\n");
            writer.write("Experience: "+experience+ "\n");
            writer.write("Skills: "+skills+"\n");
            System.out.println("Resume created successfully."); 
        } catch (IOException e) {
             System.out.println("An error occurred while creating the resume."); e.printStackTrace();
            
    
    
    }
    }

    public static void openExistingResume(Scanner scnr){
        System.out.println("Opening resume..");
        System.out.println("Enter the name on the resume: ");
        String name = scnr.next();
        File file = new File(name + "_resume.txt");

        if (file.exists()) {
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            }catch (IOException e){
                System.out.println("An error occured while reading the resume");
                e.printStackTrace();
            }
            }else{
                System.out.println("Resume not found");

            }   
         }
            }
        
