/*Consider Aman is visiting Nehru Zoo. She has seen there are N elephants standing in a row. She wants to remove the elephants having the same height standing in consecutive.Write a program for Aman so that she can get the desired sequence of elephants.

Input Format

The first line will be containing one Integer representing a number of elephants N.
The second line will contain N integers representing the heights of the elephants.

Constraints

N>2 && N<30

Output Format

The desired sequence of elephants after removing elephants having the same height standing in consecutive.*/
//-------------------------------main code below--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      if(n<=2 || n>=30)
      {
          System.out.println("Invalid Input");
      }
      else
      {
    int[] heights = new int[n];
    for (int i = 0; i < n; i++) {
      heights[i] = sc.nextInt();
    }
    sc.close();
    
    System.out.print(heights[0] + " ");
    for (int i = 1; i < n; i++) {
      if (heights[i] != heights[i - 1]) {
        System.out.print(heights[i] + " ");
      }
    }
  }
  }
}
