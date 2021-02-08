package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the nth number");
        int b = sc.nextInt();
        if(a<0 ||b<0){
            System.out.println("Invalid Input");
            return;
        }
        boolean odd = false;
        int sum = 0;
        for(int i=a; i<b+a; i++){
            if(!odd) {
                System.out.print("-" + i);
                sum -= i;
                odd = true;
            }
            else {
                System.out.print("+" + i);
                odd = false;
                sum += i;
            }
        }
        System.out.print("="+sum);
        System.out.println();
        if(sum>=0){
            System.out.println("The sum of the series is a positive number");
        }
        else
            System.out.println("The sum of the series is a negative number");
    }
}
