// If the test condition in the if statement is true, a block of code inside the if block will be executed.
// If the test condition is false, the code inside the else block (if present) will be executed.
// Code:
// Import Scanner class to take user input
// import java.util.Scanner;

// public class if_else {
//    public static void main(String[] args) {
//     Scanner scanner = new Scanner (System.in);
//     System.out.println("Enter your age");
//     int age = scanner.nextInt(); 
//     if (age >=18){

//         System.out.println("you are an adult");

//     } else { 
//         System.out.println("you are not an adult");

//     }
//          scanner.close();
    
//    }}
// INPUT - 18 
// OUTPUT - You are an adult.
 



        // if - else if statement is used to test multiple conditions. It allows you to check for 
        // more than two possible outcomes. The syntax is as follows:

      import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        // Declare and initialize marks variable
        int marks = 54;

        // Check grade conditions using if-else ladder
        if (marks < 25) {
            System.out.println("Grade: F");  // Less than 25 is Grade F
        } else if (marks >= 25 && marks <= 44) {
            System.out.println("Grade: E");  // Between 25 and 44 is Grade E
        } else if (marks >= 45 && marks <= 49) {
            System.out.println("Grade: D");  // Between 45 and 49 is Grade D
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");  // Between 50 and 59 is Grade C
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");  // Between 60 and 69 is Grade B
        } else if (marks >= 70) {
            System.out.println("Grade: A");  // 70 and above is Grade A
        } else {
            System.out.println("Invalid marks entered."); // Handles invalid inputs
        }
    }
}


