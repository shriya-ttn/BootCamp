package Collection;

/*
Write a program to sort Employee objects based on
highest salary using Comparator. Employee class{ Double Age;
 Double Salary; String Name*/

import java.util.*;

class Employee{
    String employeeName;
    int employeeAge;
    double employeeSalary;

    public Employee(String employeeName, int employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }
}

class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2)
    {
        if(e1.employeeSalary == e2.employeeSalary)
            return 0;
        else if (e1.employeeSalary> e2.employeeSalary)
            return 1;
        else
            return -1;
    }
}

public class Q5SortEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Ravi", 25, 45000d);
        Employee employee2 = new Employee("Anisha", 22, 25000d);
        Employee employee3 = new Employee("Himani", 20, 15000d);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
//        Sorting By Salary
        System.out.println("sorting by salary");
        Collections.sort(employeeList, new SalaryComparator());
        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext())
        {
            Employee e = (Employee) iterator.next();
            System.out.println(e.employeeName+" "+e.employeeAge+" "+e.employeeSalary);
        }

    }
}