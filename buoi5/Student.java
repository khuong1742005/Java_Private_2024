package buoi5;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    final float criteria = 2;

    public Student() {
        super();
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter class name:");
        setNameClass(sc.nextLine());

        System.out.println("Enter GPA:");
        setGpa(sc.nextFloat());
        sc.nextLine();
    }

    public void StringFormat() {
        super.StringFormat();
        System.out.printf("%-15s %-15s %15s \n", "ID", "NameClass", "GPA");
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-15d %-15s %15.2f \n", this.id, this.nameClass, this.gpa);
    }

    public boolean checkFall(){
        return this.gpa < this.criteria;
    }
}
