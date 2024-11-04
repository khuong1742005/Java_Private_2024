package buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public void addStudent() {
        sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        String studentID = sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        String studentName = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien: ");
        int studentAge = sc.nextInt();
        System.out.println("Nhap gioi tinh sinh vien: ");
        sc.nextLine();
        String studentGender = sc.nextLine();
        System.out.println("Nhap so dien thoai sinh vien: ");
        String studentPhoneNumber = sc.nextLine();
        System.out.println("Nhap email sinh vien: ");
        String studentEmail = sc.nextLine();

        students.add(new Student(studentID, studentName, studentAge, studentGender, studentPhoneNumber, studentEmail));
    }

    public void showStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).display());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Nhap so sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nhap ma sinh vien: ");
            String studentID = sc.nextLine();
            System.out.println("Nhap ten sinh vien: ");
            String studentName = sc.nextLine();
            System.out.println("Nhap tuoi sinh vien: ");
            int studentAge = sc.nextInt();
            System.out.println("Nhap gioi tinh sinh vien: ");
            sc.nextLine();
            String studentGender = sc.nextLine();
            System.out.println("Nhap so dien thoai sinh vien: ");
            String studentPhoneNumber = sc.nextLine();
            System.out.println("Nhap email sinh vien: ");
            String studentEmail = sc.nextLine();

            students.add(new Student(studentID, studentName, studentAge, studentGender, studentPhoneNumber, studentEmail));
        }
        int chosen = 0;
        while (chosen < 3) {
            System.out.println("1. Them hoc sinh");
            System.out.println("2. Hien thi hoc sinh");
            System.out.println("3. Thoat");
            System.out.println("Nhap lua chon: ");
            chosen = sc.nextInt();

            switch (chosen) {
                case 1:
                    main.addStudent();
                    break;
                case 2:
                    main.showStudent();
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
