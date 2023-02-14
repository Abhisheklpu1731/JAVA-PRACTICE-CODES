/*My son Priyanshu got an assignment from his teacher to perform multiplication of complex number.
Help him to complete his assignment. Write a java code with following features:
class Name: Complex
Instance Variable: real, imaginary (int type)
Constructor: **
1. Complex()
2. Complex(int, int)

**Instance Method:
1. Mul_Complex(Complex, Complex)
2. Display()
Read the real and imaginary from user and pass to the constructor as parameter
Write a separate class Test_Complex with a main() method and test the Complex class methods

Input Format

First line Read the complex number 1 for real and imaginary First line Read the complex number 2 for real and imaginary

Constraints

real, imaginary > 1

Output Format

Print the Result in form of complex number : a+bi*/
//-------------------------------------------------------------main code below-------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                try{
                    arr[i][j]=input.nextInt();
                }
                catch (NoSuchElementException e) {
                    arr[i][j]=0;
                }
                
            }
        }
        if(arr[1][1] == 0){
            arr[1][1] = arr[1][0];
            arr[1][0] = arr[0][1];
            arr[0][1] = 0;
        }
        
        int real = ((arr[0][0] * arr[1][0]) - (arr[0][1] * arr[1][1]));
        int img = ( (arr[0][0] * arr[1][1]) + (arr[0][1] * arr[1][0]) );
        System.out.println(real+"+"+img+"i");
    }
}
