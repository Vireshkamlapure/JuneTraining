package prime;

import java.util.Scanner;

public class SimplePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int i=2;

        while(i<num){
            if(num%i == 0)
                break;

            i++;
        }
        if (i==num)
            System.out.println(num+" is prime ");
        else
            System.out.println(num+" is not prime");
    }
}
