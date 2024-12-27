package model;

public class Customer {
    private String name;
    private String address;
    private String age;
    private Double salary;

    public Customer(String name, String address, String age, Double salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}
