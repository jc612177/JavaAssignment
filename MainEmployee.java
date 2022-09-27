class Employee {
    String lastName = null;
    String firstName = null;
    int age;
    String designation;
    public void setfirstName(String firstName) {
		this.firstName = "Shubham";
        System.out.println("firstName");
	}
	public void setlastName(String lastName) {
		this.lastName = "lastName";
    }
	public void setage(int age) {
		this.age = age;
	}
	public void setdesignation(String designation) {
		this.designation = "designation";
	}
    public Employee(String lastName, String firstName, int age, String designation){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return lastName + " " + firstName + " " + age + " " + designation + " ";
    }

}
public class MainEmployee {
    public static void main(String args[]){

        Employee E1 = new Employee ("Alok", "Pandey", 24, "QE");
        System.out.println(E1);
        Employee E2 = new Employee ("Mahima", "Goyal", 23, "QE");
        System.out.println(E2);
        Employee E3 = new Employee ("Anjali", "Som", 24, "Designer");
        System.out.println(E3);
    }
}