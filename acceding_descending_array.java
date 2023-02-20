/*Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers. Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. The program should print ascending order on entering 1 and descending order on entering 2. If duplicate elements exist in an array then it should only print once in the output.

Input Format

Number of elements in an array,N

Elements of an array

Enter one choice out of two(1 or 2)

Constraints

N should not be less than 5 and greater than 15.

Output Format

Sorted array depending on the choice

Sample Input 0

7
12 3 4 5 7 8 3
1
Sample Output 0

3 4 5 7 8 12
----------------------------------------------------------main code below-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    if(n>=5 && n<=15)
    {
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

int choice = sc.nextInt();
if (choice == 1) {
Arrays.sort(arr);
for (int i = 0; i < n; i++) {
if (i == 0 || arr[i] != arr[i-1]) {
System.out.print(arr[i] + " ");
}
}
} else if (choice == 2) {
Arrays.sort(arr);
for (int i = n-1; i >= 0; i--) {
if (i == n-1 || arr[i] != arr[i+1]) {
System.out.print(arr[i] + " ");
}
}
} else {
System.out.println("Invalid");
}
}
    else
    {
        System.out.println("Invalid");
    }
}
}
