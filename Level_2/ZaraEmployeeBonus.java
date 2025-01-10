import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of employees
        int numEmployees = 10;

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        // Variables to calculate totals
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Input salaries and years of service
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Input salary
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--;
                continue;
            }

            // Input years of service
            System.out.print("Years of Service: ");
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < numEmployees; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results for each employee
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        // Display totals
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary of All Employees: " + totalOldSalary);
        System.out.println("Total New Salary of All Employees: " + totalNewSalary);
    }
}
