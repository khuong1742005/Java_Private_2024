package buoi3Off;

import java.util.*;

public class Person_Manager {
    static Scanner sc = new Scanner(System.in);

    public void addPerson(ArrayList<Person> persons) {
        System.out.println("Nhập mã căn cước công dân:  ");
        String personId = sc.nextLine();
        System.out.println("Nhập tên: ");
        String personName = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int personAge = sc.nextInt();
        System.out.println("Nhập địa chỉ: ");
        sc.nextLine();
        String personAddress = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String personPhoneNumber = sc.nextLine();

        persons.add(new Person(personId, personName, personAge, personAddress, personPhoneNumber));
    }

    public void showPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.display());
        }
    }

    public void searchByName(String name, ArrayList<Person> persons) {
        for (Person person : persons) {
            if (person.getTen().equals(name)) {
                System.out.println(person.display());
                return;
            }
        }
    }

    public void searchByMaCanCuocCongDan(String cccd, ArrayList<Person> persons) {
        for (Person person : persons) {
            if (person.getMaCanCuocCongDan().equals(cccd)) {
                System.out.println(person.display());
                return;
            }
        }
    }

    public void swapPerson(int i, int j, ArrayList<Person> persons)
    {
        Person p1 = persons.get(i);
        Person p2 = persons.get(j);
        Person tmp = p1;
        persons.set(i, p2);
        persons.set(j, tmp);
    }

    public void sortByTuoi(ArrayList<Person> persons)
    {
        for(int i = 0; i < persons.size(); i++)
        {
            for(int j = i + 1; j < persons.size(); j++)
            {
                if(persons.get(i).getTuoi() > persons.get(j).getTuoi())
                {
                    swapPerson(i, j, persons);
                }
            }
        }
    }
}
