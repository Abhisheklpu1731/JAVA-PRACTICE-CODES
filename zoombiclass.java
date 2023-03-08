/*You need to create an application for a company, who is planning to maintain passwords of his employees, so to manage passwords company officials are thinking about of Zombiee case format. In Zombiee case format, particular String is concerted into complete upper case and space is replaced by special character “#”. In this format , password which is taken as string that must consist with more than 1 word.

Input Format

In first line , you need to enter Password

Constraints

make password is of string type only

Output Format

convert entered password into Zombiee case format which is mentioned in question statement

Sample Input 0

shruti jairath
Sample Output 0

SHRUTI#JAIRATH

-------------------------------------------------------main code below-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

import java.util.*;

public class ZombieeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        String Password = password.toUpperCase().replace(' ', '#');
        System.out.println(Password);
    }
}
