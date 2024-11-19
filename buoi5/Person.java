package buoi5;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address;


    public Person() {
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void input () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        setName(sc.nextLine());

        System.out.println("Enter age:");
        setAge(sc.nextInt());
        sc.nextLine();
        Address ar = new Address();
        ar.input();
        setAddress(ar);

    }

    public void StringFormat() {
        System.out.printf("%-15s %-15s", "Name", "Age");
        Address ar = new Address();
        ar.StringFormat();
    }

    public void output() {
        System.out.printf("%-15s %-15s", this.name, this.age);
        this.address.output();
    }
}
