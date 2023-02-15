/*WAP to accpet one array of stings and integers.and count the number of stings and integers present in the array.
Example
Input:
First line Accept size of array
second line accept all elements like Array = {"Raj", "77", "101", "99", "Jio"}

Output:
3
2

Input Format

First line accept sixe of the array(n)
second line accepts the n elements/values .

Constraints

the array is one string type array and
n>0

Output Format

First line print the number of Integers present
Second line prints the number of Strings present

Sample Input 0

5
Raj 77 101 99 Jio
Sample Output 0
3
2
------------------------------------------------------------------------------main code below-----------------------------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String arg[]) {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String str[]=new String[n];
    int cn = 0, cs = 0;
    for (int i = 0; i < str.length; i++) {
      str[i]=sc.next();
    }
    for (int i = 0; i < str.length; i++) {
      try {
        int j = Integer.parseInt(str[i]);
        cn++;
      } catch (NumberFormatException e) {
        cs++;
      }
    }
    System.out.println(cn);
    System.out.println(cs);
  }
}
