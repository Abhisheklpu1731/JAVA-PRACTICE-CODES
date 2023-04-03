/*raju has ben assigned a task by his teacher to implement a lambda expression for a functional interface that takes a string as input and returns the count of vowels in the string.Help him to write code in java.

Input Format

The input is a string that contains a sequence of characters.

Constraints

The input string consists of only lowercase and uppercase English letters. The input string can contain spaces and other special characters. The input string can have a maximum length of 1000 characters.

Output Format

The output is an integer that represents the count of vowels in the input string.

Sample Input 0
Hello World

Sample Output 0
3
-----------------------------------------------------------main code below----------------------------------------------------------------------------------------------------------------------*/


import java.util.function.Function;
import java.util.*;
public class VowelCounter {
    public static void main(String[] args) {
        Function<String, Integer> vowelCounter = (str) -> {
            int count = 0;
            for (char ch : str.toCharArray()) {
                if (isVowel(ch)) {
                    count++;
                }
            }
            return count;
        };
        
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        int vowelCount = vowelCounter.apply(input);
        System.out.println(vowelCount);
    }
    
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
