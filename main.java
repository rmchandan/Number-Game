import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber;

        do {
            System.out.println("Guess any number (1-100):");
            userNumber = sc.nextInt();

            if (myNumber == userNumber) {
                System.out.println("HEY ITS CORRECT");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (userNumber >= 0);
        System.out.println("The original number is:");
        System.out.println(myNumber);
    }
}
