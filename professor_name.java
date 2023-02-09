/*Jethalal has been given a task by his Java professor Mrs. Shruti to create an enum of the subjects which he is studying in current semester. It is also instructed that there must be 2 attributes of each Subject i.e. Faculty Name and credits(int) of the subject. Details of the subjects are:

**Subject, Credits, Faculty Name **

Java, 4, Shruti
OS, 3, Puneet Kumar
AI, 2, James William
Android, 3, Md. Adil Khan

Jethalal is supposed to write a main class in which the name of subject is taken as input and the faculty name and credits of that subject should be displayed using switch statement. If the input given is not matching with the listed subjects, display This subject is not running in this semester.

Input Format

First line of the input reads the subject name

Constraints

NA

Output Format

Prints the name of the Faculty and credits seperated by SPACE.*/


//-----------------------------main code below--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
enum Subject {
    Java(4, "Shruti"),
    OS(3, "Puneet Kumar"),
    AI(2, "James William"),
    Android(3, "Md. Adil Khan");
    
    private final int credits;
    private final String facultyName;
    
    Subject(int credits, String facultyName) {
        this.credits = credits;
        this.facultyName = facultyName;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public String getFacultyName() {
        return facultyName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String subjectName = sc.nextLine();
        
        try {
            Subject subject = Subject.valueOf(subjectName);
            System.out.println(subject.getFacultyName() + " " + subject.getCredits());
        } catch (IllegalArgumentException e) {
            System.out.println("This subject is not running in this semester.");
        }
    }
}
