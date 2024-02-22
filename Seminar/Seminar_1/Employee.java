package ООП.Seminar.Seminar_1;

public class Employee {
    private Long id;
    private String name;
    private int countChildren;
    private double salary;
    private Address address;

    public Employee(java.lang.String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public java.lang.Long getId() {
        return id;
    }

    public java.lang.String getName() {
        return name;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", countChildren=" + countChildren +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
