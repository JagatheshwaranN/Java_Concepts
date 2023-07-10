package java7andbelow.features.interfaces;

public class _01_Interface_Intro {

    public static void main(String[] args) {

        /*
            Interface
            =========
            1.	Definition - Any service requirement specification (SRS) is considered as an Interface.

            Example 1,
            JDBC API acts as requirement specification to develop the Database Driver. Database Vendor
            is responsible to implement the JDBC API.
            SUN system is responsible to define the JDBC API and the Oracle, MySQL, DB2 vendors are
            responsible to implement/develop their own driver (classes).

            Example 2,
            Servlet API acts as requirement specification to develop the Web Server. Web Server vendor
            is responsible to implement the Servlet API.
            SUN system is responsible to define the Servlet API and the Oracle, Apache, IBM vendors are
            responsible to implement/develop their own server.
            Oracle – WebLogic server, Apache – Tomcat server and IBM – WebSphere server.

            2.	Definition - From Client point of view, an interface defines the set of services
                expecting. From Service provider point of view, the set of services what he is
                offering. Hence, any contract between the client and service provider is considered
                as an Interface.

            Example,
            Through Bank ATM GUI screen, Bank people are highlighting the set of services what they
            are offering. At the same time, the same GUI screen represents the set of services what
            Customer is expecting. Hence, this GUI screen acts as the contract between the customer
            and bank people.

            3.	Definition - Inside Interface, every method is always abstract whether we are declaring
                or not. Hence, Interface is considered as 100% pure abstract class.

            4.	Summary - Any service requirement specification or any contract between the client
                and service provider or 100% pure abstract class is called as an Interface.
        */

    }
}
