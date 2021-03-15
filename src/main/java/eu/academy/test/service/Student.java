package eu.academy.test.service;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private int id;

    public Student(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student otherStudent) {
        int i = this.getId() - otherStudent.getId();
        if (!(this.getName().equals(otherStudent.getName()))) {
            return this.getName().compareTo(otherStudent.getName());
        }
        if (!(this.getLastName().equals(otherStudent.getLastName()))) {
            return this.getLastName().compareTo(otherStudent.getLastName());
        }
        if (i != 0) {
            return i;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
