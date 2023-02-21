/*Sushant and Virat are playing a game. Virat tells 2 numbers to Sushant, who need to check whether the first is bigger than second. Implement a method boolean isBigger(int a, int b) which returns true if a is bigger than b and false otherwise.

Input Format

Two space separated integer value representing numbers given by Virat.

Constraints

Numbers will lie between 10 and 1000.

Output Format

true/false according to the value returned by the method or will print Invalid Input in case of numbers did not match the constraints.

Sample Input 0

50 40
Sample Output 0

true
---------------------------------------------------------main code below----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean bigNumber(int a, int b){
        if(a > b){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= 10 && a <= 1000 && b >= 10 && b <= 1000){
            boolean res = bigNumber(a,b);
        	System.out.println(res);
        } else{
            System.out.println("Invalid Input");
        }
        
            
    }
}
