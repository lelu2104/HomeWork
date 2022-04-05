package HW6;

public class Employee extends Person{
    public static double salary;

    Employee(String name, int age, boolean sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }
    /**
    public static boolean isSameName(Employee employee){
        if(employee.equals()){
            return true;
        } else
            return false;
    }
*/

}
