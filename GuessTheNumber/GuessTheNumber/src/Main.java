import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber =(int)(Math.random()*100);
        int userNumber ;
        do {
            System.out.println("Guess the number (0-100): ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber){
                System.out.println("WHOOO ... CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number is too large !");

            }else {
                System.out.println("Your number is too small !");

            }
        }while(userNumber >= 0);
        System.out.print("My number is : ");
        System.out.println(myNumber);
    }
}