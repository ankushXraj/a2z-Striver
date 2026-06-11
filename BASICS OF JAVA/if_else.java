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
        //  scanner.close();
    
//    }}
// INPUT - 18 
// OUTPUT - You are an adult.
 



        // if - else if statement is used to test multiple conditions. It allows you to check for 
        // more than two possible outcomes. The syntax is as follows:

      import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
       int marks = 90;

       if (marks <25 ){
        System.out.println("you are failed");
       }
       else if (marks>25 && marks <40 )
       {System.out.println("grade d");

       }
        else if (marks >40 && marks <60 )
       {
        System.out.println("grade c ");
       } 
       else if (marks >60 && marks <80)
       {
        System.out.println("grade b");
       } 
       else {
        System.out.println("grade a");
       } 

    }
} 

// output = grade a 