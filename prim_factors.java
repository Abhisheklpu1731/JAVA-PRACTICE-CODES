/*Richa and her daughter Ahaana are playing a game. Richa is going to tell one number and Ahaana need to tell the prime factors of the number. Help Ahaana by completing the code to find prime factor of the number. Write a method which calculate prime factors and print and call the method in main.

Input Format

An integer value

Constraints

N will be lie between 10-50

Output Format

All the prime factors will be printed exectly once with space.*/
//---------------------------------------------------main code below-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {
    static void printprime(double n){
        int j = 0;
        int arr[] =new int[20];
        for(int i = 2; i<n+1; i++) {
         while(n%i == 0) {
            arr[j++]=i;
            n = n/i;
         }
        }
        int k = 0;
        for(int i=0;i<j;i++){
            if(arr[i] != arr[i+1]){
                arr[k++]=arr[i];
            }
        }
        for(int i=0;i<k;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        if(n > 10 && n < 50){
            if(n == (int)n){
                printprime(n);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
