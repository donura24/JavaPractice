package JavaPractice.Records;

public class Main {
    public static void main(String[] args) {

        EmployeeClass employeeClass = new EmployeeClass("Teo", 2424);
        System.out.println(employeeClass);

        EmployeeRecord employeeRecord = new EmployeeRecord("Dan", 3434);
        System.out.println(employeeRecord);
    }
}
