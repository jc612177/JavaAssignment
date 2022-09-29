package collections;
import java.util.LinkedHashMap;
import java.util.Map;

class Employee {
    int age;
    String name;
    String designation;

    Employee(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {
        return "Age is: " + age + ", " + "Name is: " + name + ", " + "Designation is: " + designation + "Salary ";
    }

}

public class ques4 {

    public static void main(String args[]) 
    {
        Employee e1 = new Employee(20, "Alok", "Trainee, ");
        Employee e2 = new Employee(28, "Nazish", "Manager, ");
        Employee e3 = new Employee(27, "Anish", "Director, ");
        Employee e4 = new Employee(38, "Ashish", "CEO, ");

        Map<Employee, Integer> map = new LinkedHashMap<>();

        map.put(e1, 1500);
        map.put(e2, 20000);
        map.put(e3, 38820);
        map.put(e4, 1855232);
        for (Employee key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
