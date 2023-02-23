/*In a sports event, Lindsey, a famous athlete, has decided to meet her fans and shake hands with them. The order in which she will meet them is the fan degree. i.e. the fan with maximum degree will be considered first. Now, the fans are required to take positions according to the degree value. While they are not allowed to swap positions with any other person, but with the person at their adjacent places. Write a program to implement the same using method where sorting logic should be written in method.

Input Format

4 8 5 9 6 7 1 2 10 3

Constraints

Consider that there are 10 persons participating in the sports event and their fan degrees are in integer numbers (between 1 to 10).

Output Format

10 9 8 7 6 5 4 3 2 1

Sample Input 0

4 10 6 9 5 1 8 2 7 3
Sample Output 0

10 9 8 7 6 5 4 3 2 1


----------------------------------------------main code below-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;

public class Fan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
