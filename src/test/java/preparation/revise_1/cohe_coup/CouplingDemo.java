package preparation.revise_1.cohe_coup;

public class CouplingDemo {

    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.setEmail("John@gmail.com");
        SMTPEmailTrigger emailTrigger = new SMTPEmailTrigger();
        Orders orders = new Orders(customers, emailTrigger);
        orders.placeOrders();



    }
}


// Tight Coupling Example
class Order {

    private Customer customer;

    public void placeOrder() {
        customer.sendEmail("Your Order is Confirmed");
    }
}

class Customer {

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void sendEmail(String message) {
        System.out.println(message);
    }
}

// Loose Coupling Example
interface EmailTrigger {
    void sendEmail(String recipient, String message);
}

class Orders {

    private final Customers customer;
    private final SMTPEmailTrigger emailTrigger;

    public Orders(Customers customer, SMTPEmailTrigger emailTrigger) {
        this.customer = customer;
        this.emailTrigger = emailTrigger;
    }

    public void placeOrders() {
        emailTrigger.sendEmail(customer.getEmail(), "Your Order is Confirmed");
    }
}

class Customers {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

class SMTPEmailTrigger implements EmailTrigger {

    @Override
    public void sendEmail(String recipient, String message) {
        System.out.println(recipient + " , " + message);
    }
}