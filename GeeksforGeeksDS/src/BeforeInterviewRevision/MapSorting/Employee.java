package BeforeInterviewRevision.MapSorting;

import java.util.Comparator;

public class Employee  implements Comparable<Employee>{

      private String name ;
      private int employeeId ;
      private int age ;
      private int salary ;


    public Employee(String name, int employeeId, int age, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp2) {
        if(this.salary > emp2.salary ) return 1;
        else return -1 ;
    }


    // using comaprator

    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getAge() - emp2.getAge();
        }
    };





}
