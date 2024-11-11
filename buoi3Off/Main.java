package buoi3Off;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Person> persons = new ArrayList<>();


    public static void main(String[] args)
    {
        System.out.println("Nhập số lượng người: ");
        Person_Manager pm = new Person_Manager();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pm.addPerson(persons);
        }

        pm.showPersons(persons);

        sc.nextLine();
        System.out.println("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        pm.searchByName(name, persons);

        System.out.println("Nhập mã căn cước của người cần tìm: ");
        String cccd = sc.nextLine();
        pm.searchByMaCanCuocCongDan(cccd, persons);

        System.out.println("Danh sách sau khi sắp xếp theo tuổi là: ");
        pm.sortByTuoi(persons);
        pm.showPersons(persons);
    }
}
