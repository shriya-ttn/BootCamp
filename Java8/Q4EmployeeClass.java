package Java8;

/*Q4
* Create an Employee Class with instance variables (String) name, (Integer)age,
* (String)city and get the instance of the Class using constructor reference
*/

interface EmployeeHolder{
    Employee constructorRefMethod(String name, Integer age, String city);
}

class Employee{
    String name;
    Integer age;
    String city;


    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
     //   System.out.println("Name : " + name + ", Age : " + age + ", City : " + city);
    }

    @Override
    public String toString() {
        return ("Name : "+name+", Age : "+age+", City : "+city);
    }
}

public class Q4EmployeeClass {
    public static void main(String[] args) {
        // Constructor Refernce
        EmployeeHolder empHol = Employee::new;
        System.out.println(empHol.constructorRefMethod("Shriya", 23, "Delhi"));
        System.out.println(empHol.constructorRefMethod("Reema", 21, "Ahemdabad"));
    }
}