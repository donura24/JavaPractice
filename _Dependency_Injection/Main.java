package JavaPractice._Dependency_Injection;

public class Main {
    public static void main(String[] args) {

        // Dependencies

        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();

        // Inject

        CarService carService = new CarService(carDAO,emailService);
    }
}
