package buoi5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoomManager {
    Scanner sc = new Scanner(System.in);

    public void addStudent(ArrayList<Student> students) {
        while (true) {
            Student st = new Student();
            st.input();
            students.add(st);
            System.out.println("Successfully!");
            if (students.getLast().getId() >= 555) return;
        }
    }

    public void outputStudent(ArrayList<Student> students) {
        Student sts = new Student();
        sts.StringFormat();
        for (Student st : students){
            st.output();
        }
    }

    public void removeById(ArrayList<Student> students) {
        System.out.println("Enter ID of a students who you want to remove:");
        int id = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Successfully!");
                return;
            }
        }
        System.out.println("Not Found!");


    }
    public void sortByGpa(ArrayList<Student> students) {
        students.sort(Comparator.comparing(Student::getGpa).reversed());
        System.out.println("Successfully!");
    }
}
