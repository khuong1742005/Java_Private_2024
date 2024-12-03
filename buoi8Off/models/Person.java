package buoi8Off.models;

public class Person {
    private String id;
    private String fullName;
    private int age;
    private Address address;
    private String birthDay;

    public Person() {
    }

    public Person(String id, String fullName, int age, Address address, String birthDay) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", birthDay='" + birthDay + '\'';
    }
}
