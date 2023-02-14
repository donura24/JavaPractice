package JavaPractice.Records;

import java.util.Objects;

public class EmployeeClass {

    private final String name;
    private final int number;

    public EmployeeClass(String name, int number) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "EmployeeClass(name=" + this.getName() + ", employeeNumber=" + this.getNumber()+")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
