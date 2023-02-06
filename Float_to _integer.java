import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        double[] arr = new double[size];
       // System.out.print("Enter the elements of the array separated by space: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        int[] intArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            intArr[i] = (int) arr[i];
        }
     //   System.out.print("The converted int array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(intArr[i] );
        }
    }
}//
