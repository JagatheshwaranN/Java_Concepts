package java.features.development;

public class _03_File_Application_Server {

    public static void main(String[] args) {

        /*
            Jar Vs War Vs Ear
            =================
            Jar (Java Archive), it contains a group of .class files.

            War (Web Archive), a war file represents one web application which contains
            servlets, jsp, html pages, Js files, etc. The main advantage of maintaining
            the web application in the form of war file is project deployment, project
            delivery and project transportation will become easy.

            Ear (Enterprise Archive), an Ear file represents one enterprise application
            which contains servlets, jsp, html pages, EJBs, JMS, etc.

            Note: In general, EAR file represents a group of war and jar files.
        */

        /*
            Web Application Vs Enterprise Application
            =========================================
            A web application can be developed by only web related technologies like servlets,
            jsp, html files, CSS and Js files. Example, Online library management system and
            Online shopping cart system.

            An enterprise application can be developed by any technology from java/j2ee like
            servlets, jsp, html pages, EJBs, JMS, etc. Example, Banking application and
            Telecom application.

            Note: Java/JEE application compatible application is Enterprise application.
        */

        /*
            Web Server Vs Application Server
            ================================
            Web server provides an environment to run the web application. Web server
            provides support for web related technologies like servlets, JSP, HTML, etc.
            Example, Tomcat.

            Application server provides an environment to run the enterprise application.
            Application server can provide support for any technology from java/jee like
            servlets, JSP, HTML, EJB, JMS, etc. Example, Web Logic, WebSphere and JBoss.

            Note:
            =====
            Every application server contains inbuilt web server to provide support for
            web-related technologies. Java / JEE compatible server is application server.
        */
    }
}
