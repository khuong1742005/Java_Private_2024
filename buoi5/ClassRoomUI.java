package buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomUI {
    public void preMain(){
        ArrayList<Student> students = new ArrayList<>();
        ClassRoomManager crm = new ClassRoomManager();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(n != 5){
            System.out.println("1. Enter information of student until ID equals or than to 555");
            System.out.println("2. List of students format to table");
            System.out.println("3. Sort students by GPA");
            System.out.println("4. Remove students by ID");
            System.out.println("5. Exit");
            System.out.println("Enter your choose: ");
            n = sc.nextInt();
            switch (n){
                case 1:
                    crm.addStudent(students);
                    break;
                case 2:
                    crm.outputStudent(students);
                    break;
                case 3:
                    crm.sortByGpa(students);
                    break;
                case 4:
                    crm.removeById(students);
                    break;
                case 5:
                    System.out.println("Exit successfully!");
                default:
                    System.out.println("Invalid!");
            }
        }
    }

}
