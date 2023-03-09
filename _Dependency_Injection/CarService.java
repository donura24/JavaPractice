package JavaPractice._Dependency_Injection;

public class CarService {

    private CarDAO carDAO;
    private EmailService emailService;

    public CarService(CarDAO carDAO, EmailService emailService){
        this.carDAO = carDAO;
        this.emailService = emailService;
    }
}
