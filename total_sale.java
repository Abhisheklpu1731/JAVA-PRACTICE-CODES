/*Amit purchased one calculator for performing some calculation on it. He is running a company which develop machines. He want to calculate total sale of today. But he is not able to calculate sum of two numbers because numbers are having more than nine digits. Help the Amit to calculate sum of two integer values having more than 9 digits ao that he will be able to do calculations.

Input Format

First line will contain one integer value having more than nine digits.
Second line will contain one integer value having more than nine digits.

Constraints

Number of digits in numbers will lie between 10-20.

Output Format

Sum of two integer values if numbers satisfy the constraint else print Invalid Input

Sample Input 0

12
13
Sample Output 0

Invalid Input
Sample Input 1

111112222233333
111118777701111
Sample Output 1

222230999934444
---------------------------------------------main code below-----------------------------------------------------------------------------------------------------------------------------------*/
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        if (num1.length() < 10 || num1.length() > 20 || num2.length() < 10 || num2.length() > 20) {
            System.out.println("Invalid Input");
        } else {
            BigInteger bigNum1 = new BigInteger(num1);
            BigInteger bigNum2 = new BigInteger(num2);
            BigInteger sum = bigNum1.add(bigNum2);
            System.out.println(sum);
        }
    }
}
