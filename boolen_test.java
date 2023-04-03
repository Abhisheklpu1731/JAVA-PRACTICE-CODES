/*Create a class Student having attributes name (String), rollNo (int) and department (String). Create a functional interface Predicate with an abstract method test with following signature: boolean test(Student t); Write a test program to filter all the Students who is from ‘CSE’ department’ by using above test method with the help of lambda expression.

Input Format

Your program should take 2 types of inputs. First will represents the number of Students and second will be the attributes of students in the order (name, rollNo, department). If the number of students will be less than equal 1 then display the message “Invalid” without asking for any input

Constraints

Number of students should be greater than 1

Output Format

Your program should display rollNo of the students in separate lines which are from ‘CSE’ department.

Sample Input 0

3
Raghav
5
CSE
Amit
7
ECE
Shavi
10
CSE
Sample Output 0

5
10
Sample Input 1

1
Sample Output 1

Invalid
----------------------------------------------------------main code below---------------------------------------------------------------------------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Student {
    private String name;
    private int rollNo;
    private String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDepartment() {
        return department;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        
        if (numStudents <= 1) {
            System.out.println("Invalid");
            return;
        }
        
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            String name = scanner.next();
            int rollNo = scanner.nextInt();
            String department = scanner.next();
            students.add(new Student(name, rollNo, department));
        }
        Predicate<Student> cseFilter = (student) -> student.getDepartment().equals("CSE");
        for (Student student : students) {
            if (cseFilter.test(student)) {
                System.out.println(student.getRollNo());
            }
        }
    }
}
