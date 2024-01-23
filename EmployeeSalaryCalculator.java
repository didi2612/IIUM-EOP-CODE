import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = input.nextInt();

        double hourlyRate = 12.00;
        double salary;

        if (hoursWorked <= 40) {
            salary = hoursWorked * hourlyRate;
        } else {
            int regularHours = 40;
            int overtimeHours = hoursWorked - regularHours;
            salary = (regularHours * hourlyRate) + (overtimeHours * 18.00);
        }

        System.out.printf("Salary due = RM %.1f%n", salary);
    }
}