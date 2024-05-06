
import java.time.LocalDate;
import java.time.Period;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruel Rey
 */
public class Employee {
     // Attributes
    private String employeeName;
    private int employeeNo;
    private String employeeBirthdate;
    private String employeeAddress;

    // Constructor
    public Employee(String employeeName, int employeeNo, String employeeBirthdate, String employeeAddress) {
        this.employeeName = employeeName;
        this.employeeNo = employeeNo;
        this.employeeBirthdate = employeeBirthdate;
        this.employeeAddress = employeeAddress;
    }

    // Getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeBirthdate() {
        return employeeBirthdate;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee No: " + employeeNo);
        System.out.println("Employee Birth Date: " + employeeBirthdate);
        System.out.println("Employee Address: " + employeeAddress);

        // Calculate and display age
        LocalDate birthDate = LocalDate.parse(employeeBirthdate);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(birthDate, currentDate);
        System.out.println("Employee Age: " + age);
    }

    // Method to calculate age
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if (birthDate != null && currentDate != null) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0; // Return 0 if birthDate or currentDate is null
        }
    }
    
}
