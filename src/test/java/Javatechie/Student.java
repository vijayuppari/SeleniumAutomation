package Javatechie;

import java.util.List;
import java.util.Objects;

public class Student {

    private int id;
    private String firstname;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDept() {
        return dept;
    }

    public String getCity() {
        return city;
    }

    public int getRank() {
        return rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && rank == student.rank && firstname.equals(student.firstname) && gender.equals(student.gender) && dept.equals(student.dept) && city.equals(student.city) && contacts.equals(student.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, age, gender, dept, city, rank, contacts);
    }

    public Student(int id, String firstname, int age, String gender, String dept, String city, int rank, List<String> contacts) {
        this.id = id;
        this.firstname = firstname;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
