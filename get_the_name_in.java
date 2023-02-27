/*Raju, Rohit and Ramesh were playing a game where Raju instructs Rohit to open and close two pairs of parenthesis bracket and place your name inside the bracket tags then Rohit instructs Ramesh to open and close three pairs of curly brackets and place your name inside the bracket tag then at last Ramesh instructs Raju to open and close four pairs of square brackets and place your name inside the bracket tag.

Input Format

(())
Rohit

Constraints

First user input should be bracketing tags and the next user input should be string names
In the output name should be in the middle of the bracket tags.
Output Format

((Rohit))

Sample Input 0

(())
Rohit
Sample Output 0

((Rohit))
---------------------------------------------------------------------------main code  below------------------------------------------------------------------------*/
import java.util.*;

public class Game {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    
    String brackets = sc.next();
    String name = sc.next();
    String result = brackets.substring(0,brackets.length()/2) + name + brackets.substring(brackets.length()/2);
    System.out.println(result);

}
}
