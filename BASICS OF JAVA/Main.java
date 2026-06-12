//  A switch statement is used when we want to compare one variable with multiple fixed values.

// Instead of writing many if-else if conditions, we can use switch to make the code cleaner and easier to read.
 
    import java.util.Scanner;

    public class Main {
    
        public static void main(String[]args) {
         int day ; 
        Scanner scanner = new Scanner (System.in); 

        System.out.print("Enter A Number(1-7) :");
        day = scanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday"); 
                break; 

                case 2 : 
                System.out.println("tuesday");
                break; 

                case 3 :
                    System.out.println("wednesday");
                    break;

                case 4 :
                    System.out.println("thrusday");
                    break;

                    case 5 :
                        System.out.println("friday");
                         break; 
                    case 6 :
                        System.out.println("saturday"); 
                        break ; 

                        case 7:
                             System.out.println("sunday");
                             break;

                             default:
                                System.out.println("invalid input");


        }  scanner.close();


    }
        
} 

   