/*Rohit is pursuing his B.Tech degree in CSE. His java teacher given the assignment to write java code to accept a string/sentence in upper case if the string/sentence in not upper case than convert it in uppercase and Display the longest word and the length of the longest word present in the string. If the string contains number or string is null then display the massage “Invalid input”.
Sample 1:
Enter string: Lovely Professional University
Longest word : PROFESSIONAL

Sample 2:
Enter string: 123 cse 45 lpu 56789
Invalid input

Input Format

First line read the input as String

Constraints

numbers of word in string > 1

Output Format

Display longest string in Uppercase

Sample Input 0

Lovely Professional University
Sample Output 0

PROFESSIONAL
--------------------------------------------------main code below----------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()<=1){
            System.out.println("Invalid input");
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='1'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='2'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='3'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='4'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='5'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='6'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='7'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='8'){
              System.out.println("Invalid input");
                return;
            }else if(ch=='9'){
              System.out.println("Invalid input");
                return;
            }
            
        }
        
        int maxLength=0;
        String s1="";
        
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>maxLength){
                maxLength=arr[i].length();
                s1=arr[i];
            }
        }
        System.out.println(s1.toUpperCase());
    }
}
