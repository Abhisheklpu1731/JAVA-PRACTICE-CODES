/*Write a program to take the input of String and display all the characters present in the input string in sorted order with their count. If the length of the string will be less than equal to 5, display the message “Invalid Input”.

Input Format

Your program should take the input of one string.

Constraints

Length of strings should be greater than 5.

Output Format

Your program should display the characters present in the string in sorted order with their count.

Sample Input 0

hurrey
Sample Output 0

e1h1r2u1y1
Sample Input 1

hhello
Sample Output 1

e1h2l2o1
---------------------------------------main code below----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        if (inputString.length() <= 5) {
            System.out.println("Invalid Input");
            return;
        }
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);
        char currentChar = charArray[0];
        int currentCount = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == currentChar) {
                currentCount++;
            } else {
                System.out.print(currentChar + "" + currentCount);
                currentChar = charArray[i];
                currentCount = 1;
            }
        }
        System.out.print(currentChar + "" + currentCount);
    }

}
