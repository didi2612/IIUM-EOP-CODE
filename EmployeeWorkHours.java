public class EmployeeWorkHours {

    public static void main(String[] args) {
        
        String[] employees = {"Employee 0", "Employee 1", "Employee 2", "Employee 3", "Employee 4", "Employee 5", "Employee 6", "Employee 7"};
        int[] workHours = {35, 40, 30, 45, 38, 32, 42, 37};

        
        for (int i = 0; i < workHours.length - 1; i++) {
            for (int j = 0; j < workHours.length - i - 1; j++) {
                if (workHours[j] < workHours[j + 1]) {
                    // Swap work hours
                    int tempHours = workHours[j];
                    workHours[j] = workHours[j + 1];
                    workHours[j + 1] = tempHours;

                    
                    String tempEmployee = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tempEmployee;
                }
            }
        }

        // Displaying the sorted result
        System.out.println("Employee Work Hours (Descending Order):");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i] + ": " + workHours[i] + " hours");
        }
    }
}
