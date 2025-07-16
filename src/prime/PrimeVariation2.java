package prime;

import java.util.Scanner;
//print next prime
public class PrimeVariation2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice = '\0';
        do {

            //Main logic
            System.out.print("Enter a number : ");
            int num = scanner.nextInt();
            int i = 2;
            while (i < num) {
                if (num % i == 0)
                    break;

                i++;
            }
            if (i == num)
                System.out.println(num + " is prime");
            else
                System.out.println(num + " is not prime");
            //end main logic

            System.out.println("Enter y to continue");
            choice = scanner.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');
    }
}
