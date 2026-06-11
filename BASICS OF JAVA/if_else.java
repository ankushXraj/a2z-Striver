// If the test condition in the if statement is true, a block of code inside the if block will be executed.
// If the test condition is false, the code inside the else block (if present) will be executed.
// Code:
// Import Scanner class to take user input
import java.util.Scanner;

public class if_else {
   public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter your age");
    int age = scanner.nextInt(); 
    if (age >=18){

        System.out.println("you are an adult");
    
    } else { 
        System.out.println("you are not an adult");

    }
         scanner.close();
    
   }}
// INPUT - 18 
// OUTPUT - You are an adult.
