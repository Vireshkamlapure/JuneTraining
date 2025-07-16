package com;

import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();

        System.out.println("Printing table of "+num);
        for(int i=1 ; i <= 10 ; i++){
            System.out.println(num + "*" + i + ": " + (num*i));
        }
    }
}
