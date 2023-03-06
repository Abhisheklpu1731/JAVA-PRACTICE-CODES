/*Kumar has been given a string and asked to determine whether it can be converted into a palindrome after removing at most one character

Input Format

str="abcbea"

Constraints

1<=Str.length<=10^3 Str consists of Lowercase English characters

Output Format

true

Sample Input 0

abceba
Sample Output 0

true
Explanation 0

you can remove character 'e' to make it palindrome
-------------------------------------------------------------------main code below------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindromePossible(str));
    }
    
    public static boolean isPalindromePossible(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                if (isPalindrome(str.substring(0, left) + str.substring(left + 1))) {
                    return true;
                }
                if (isPalindrome(str.substring(0, right) + str.substring(right + 1))) {
                    return true;
                }
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
