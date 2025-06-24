package homework;
//19-Jun-2025;
//convert the number given by user to digits. i/p = 12345 o/p = 1 2 3 4 5;
//and return the tum of the digits
import java.util.Scanner;

public class NumberToDigit {
    public static void main(String[] args) {
        long num = 0;
        long sum = 0;
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLong();

        while(num!=0) {
            System.out.print(num%10+"\t");
            sum += num%10;
            num = num / 10;
        }
        System.out.println("\nSum : "+sum);
    }
}
