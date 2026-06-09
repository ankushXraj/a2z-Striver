            // 1- LIBRARY provide pre - built classes and methods to perform various task 

            // import java.util.Scanner; // Scanner is a class in java.util 
            // package used to take input from user

            public class InputOutput {
                public static void main(String[] args) { 
                }
                
            }

            // 2- TO PRINT OUTPUT ON THE SCREEN

            public class InputOutput {
                public static void main(String[] args) {
                    System.out.println("Hello World"); // println is a method used to
                    // print output on the screen
                }
            }

            // output - Hello World

            // 3- PRINTING MULTIPLE LINES

            public class InputOutput {

                public static void main(String[] args) {

                    System.out.println("ANKUSH ");

                    System.out.println("ANKUSH");

                }

            }

            // OUTPUT - ANKUSH
            // ANKUSH

            // WE CAN ALSO USE \n TO PRINT MULTIPLE LINES

            public class InputOutput {

                public static void main(String[] args) {

                    System.out.print("ANKUSH\n");

                    System.out.print("ANKUSH");

                }

            }

            // 4-- TAKING USER INPUT WITH SCANNER

            // import java.util.Scanner;

            public class InputOutput {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    int x = sc.nextInt();

                    System.out.println("Value of x: " + x);

                    sc.close();
                }
            }

            TAKING THE INPUT=10 OUTPUT=
            Value of x:10

            // 5- TAKING MULTIPLE INPUTS
            import java.util.Scanner;

            public class InputOutput {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Value of x --  " + x + " and y -- " + y);

                    sc.close();

                }
}

// input - x = 10 and y = 20
// output -- Value of x -- 10 and y -- 20

// 6-- Different Data Types Input
// import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt(); // READ AN INTEGER INPUT
        double salary = sc.nextDouble(); // READ A DOUBLE OR DECIMAL INPUT
        char grade = sc.next().charAt(0); // sc.next() reads a String (word).
        // charAt(0) gets the first character of that String, which is our grade.
        // EXAMPLE -- sc.next() // "Apple"
        // charAt(0) // 'A'

        String name = sc.next(); // next() reads a single word strings

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);

        sc.close();
    }
}
        // input --
        // 21
        // 50000.5
        // A
        // Ankush

        // Output -- 
        // age = 21;
        // salary = 50000.5;
        // grade = 'A';
        // name = "Ankush";