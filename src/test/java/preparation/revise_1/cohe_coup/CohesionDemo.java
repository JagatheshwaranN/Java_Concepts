package preparation.revise_1.cohe_coup;

public class CohesionDemo {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculateArea(10, 5);
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail("John", "Test Email");
    }

}

// Example for Low Cohesion
class Utility {

    public void calculateArea(int length, int width) {
        System.out.println(length * width);
    }

    public void sendEmail(String recipient, String email) {
        System.out.println(recipient + " " + email);
    }

}

// Example for High Cohesion
class AreaCalculator {
    public void calculateArea(int length, int width) {
        System.out.println(length * width);
    }
}

class EmailSender {
    public void sendEmail(String recipient, String email) {
        System.out.println(recipient + " " + email);
    }
}