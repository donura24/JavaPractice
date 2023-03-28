package JavaPractice.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Teo");
        employee1.setAge(99);
        employee1.setWorkExp(80);

        // don't use -> employee1.name, employee1.age, employee1.workExp;
        // use instead example;

        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getWorkExp());

    }
}
