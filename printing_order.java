/* Write a java program to find common elements present in 3 different arrays. and print them in assending order.

Input Format

first line accept the Size of 1st array
Sencond line accepts the elements of the first array
third line accept the Size of 2nd array
fourth line accepts the elements of the 2nd array
fifth line accept the Size of 3rd array
sixth line accepts the elements of the 3rd array

Constraints

size of all arrays must be >o
all elements of the array must be integers

Output Format

print the common elements present in 3 different arrays in assending order.

Sample Input 0

5
3 7 8 6 5
4
4 3 8 6
5
3 7 8 5 6
Sample Output 0
3 6 8
----------------------------------------------------------main code below-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.util.*;
public class Common {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int size3 = sc.nextInt();
        int[] arr3 = new int[size3];
        for (int i = 0; i < size3; i++) {
            arr3[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        int i = 0, j = 0, k = 0;
       while (i < size1 && j < size2 && k < size3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
