/*Alice got task from his manager to maintain 2 decks of n numbers. As he easily put n numbers in one deck but for second deck he is bit confused so help him by creating one application in which once the n numbers are entered by bob, then parallely application will copy the content in second deck also.

Input Format

First line will contain size In second line , enter the number as per according to size in first deck.

Constraints

Only integer values considered

Output Format

In first line , it will display the contants in actual deck. In second line , display same contents in second deck.*/
//-----------------------------------------main code below------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=ar[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
