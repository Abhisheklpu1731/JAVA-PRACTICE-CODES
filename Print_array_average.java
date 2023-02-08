/*WAP to accept 10 integer elements in to an array, and find the avarage of the elements of the array excuding the largest and smallest element of the array.

Input Format

Accept 10 positive integers in to an array

Constraints

all 10 number must be unique and must be positive and >0

Output Format

print the Avarage*/
//-----------------------------main code below------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int average = solve(arr);
        System.out.println(average);
    }

    public static int solve(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum=sum+arr[i];
        }
        return (sum - min - max);
    }
}
