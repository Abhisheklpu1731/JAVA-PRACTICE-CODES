import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> insertStudent(ArrayList<Integer> students) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            result.add(students.get(i));
            if (i < students.size() - 1 && students.get(i) % 2 != 0 && students.get(i + 1) % 2 != 0) {
                result.add((students.get(i) + students.get(i + 1)) / 2);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 2 || n >= 20) {
            System.out.println("Invalid Input");
            scan.close();
            return;
        }
        ArrayList<Integer> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(scan.nextInt());
        }
        ArrayList<Integer> result = insertStudent(students);
        for (int height : result) {
            System.out.print(height + " ");
        }
        System.out.println();
        scan.close();
    }
}
