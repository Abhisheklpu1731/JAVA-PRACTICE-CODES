/*Jashu, Preeti, and Rita where playing a game, where they call each other randomly and they need to tell their middle character of their names. First Preeti called Jashu then Jashu called Rita then Rita called Jashu

Input Format

Jashu

Constraints

Declare name in the form of String
If the string name has odd no of character then print the middle character, if the string name has even no of character then print the middle two characters
Output Format

s

Sample Input 0

Jashu
Sample Output 0

s
----------------------------------------------------------main code below----------------------------------------------------------------------------------------------------------------*/

import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
    int len = name.length();
int mid = len / 2;

if (len % 2 == 0) {
  System.out.println(name.substring(mid - 1, mid + 1));
} else {
  System.out.println(name.charAt(mid));
}
}
}
