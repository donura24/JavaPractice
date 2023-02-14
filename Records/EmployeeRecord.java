package JavaPractice.Records;

public record EmployeeRecord(String name, int number) {

    public static final String def_Employee_Name = "NO NAME";

    public EmployeeRecord { // overriding EmployeeRecord
        if (number < 0 ){
            throw new IllegalArgumentException("NUMBER, can't be negative.");
        }
    }
    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void printXXXYYY() {
        System.out.println("XXXYYY");
    }


}
