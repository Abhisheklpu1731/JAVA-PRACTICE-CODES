/*Tara has been assigned a task by her friends to retrieve a character that appears most number of the times in a given sequence.if the frequency of two or more characters is same than return any among them

Input Format

str = “takeforward”

Constraints

The string will contain only ASCII characters, from the ranges ('a'-z',A-Z,0'-9'),

Output Format

a

Sample Input 0

takeforward
Sample Output 0

Maximum occurring character is a
-------------------------------------------------------main code below-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.util.*;
import java.util.Arrays;
public class Solution {
   static char maxOccurringChar(String str) {
      char ans = str.charAt(0);
      int i, curr_freq = 0, max_freq = 0, n = str.length();
      for (i = 1; i < n; i++) {
         if (str.charAt(i) == str.charAt(i - 1)) {
            curr_freq++;
         } 
         else {
            if (max_freq < curr_freq) {
               max_freq = curr_freq;
               ans = str.charAt(i - 1);
            }
            curr_freq = 0;
         }
      }
      if (max_freq < curr_freq) {
         max_freq = curr_freq;
         ans = str.charAt(i - 1);
      }
      return ans;
   }

   public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      String str = ip.nextLine();
      char charArr[] = str.toCharArray();
      Arrays.sort(charArr);
      str = new String(charArr);
      System.out.println("Maximum occurring character is " + maxOccurringChar(str));
   }
}
