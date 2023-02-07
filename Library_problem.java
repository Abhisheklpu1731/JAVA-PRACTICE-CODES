/*open timing and close timing of the library working hours.
Details of the working hours are:
Day, open Timing, closed timing
Monday, 8.30, 5.30
Tuesday, 8.30, 5.30
Friday, 8.30, 5.30
Saturdays, 9.30, 4.30
Karan is supposed to write a main class in which the name of working days of library is taken as input as a day and timing of library should be displayed using switch statement. If the input given is not matching with the listed day, display Library is closed*/
//--------------------------------------------main code below---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        if(x.equals("Monday") || x.equals("Tuesday") || x.equals("Wednesday") || x.equals("Thursday") || x.equals("Friday"))
        {
            System.out.println("8:30 5:30");
        }
        else if(x.equals("Saturday"))
        {
            System.out.println("9:30 4:30");
        }
        else
        {
            System.out.println("Library is closed");
        }
    }
}
