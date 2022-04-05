package HW6;

import static HW6.Employee.getSalary;

public class Salary {
    public static double getSum(Employee[] employeeArray){
        double sum = 0;
        Employee [] employees = new Employee[];
        for (int i = 0; i < employeeArray.length; i++) {
            sum = sum + getSalary();
            return sum;

        }




    }
}