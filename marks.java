/*Dr. Max has conducted the academic task in his class with 5 Multiple Choice Questions each having 4 options A/B/C/D. He wanted to write a program which can evaluate the test papers of all the N students such that each correct answer is awarded 1 mark and for incorrect answer penalty is 0.25 marks.

The program must read the number of students N and the the answers of all the N students in the form of a String. If any question is not attempted by any student, then X should be given as input corresponding to that question e.g. ABAXD

It is expected that the marks of all the N students are displayed separated by SPACE.

Input Format

First Line of the input reads the String of CORRECT ANSWERS

Second Line of the input reads the number of students N

Next N lines read the answer Strings of the N students respectively.

Constraints

N > 0

Input characters can be either in Upper Case or Lower Case

Output Format

Print the marks of all the N students separated by SPACE

Sample Input 0

ACBDC
2
BCXDX
AXXDC
Sample Output 0

1.75 3.0
-------------------------------------------------------------main code below------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct = sc.nextLine().toUpperCase();
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            String answer = sc.nextLine().toUpperCase();
            double marks = evaluateMarks(correct, answer);
            System.out.print(marks + " ");
        }
    }
    public static double evaluateMarks(String correct, String answer) {
        int num = correct.length();
        double marks = 0;
        for (int i = 0; i < num; i++) {
            char correctAnswer = correct.charAt(i);
            char studentAnswer = 'X'; 
            if (i < answer.length()) {
                studentAnswer = answer.charAt(i);
            }
            if (studentAnswer == 'X') {
                marks=marks+0; 
            } else if (studentAnswer == correctAnswer) {
                marks=marks+1; 
            } else {
                marks=marks-0.25; 
            }
        }
        return marks;
    }
}
