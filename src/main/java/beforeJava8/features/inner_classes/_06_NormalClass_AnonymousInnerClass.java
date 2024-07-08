package beforeJava8.features.inner_classes;

public class _06_NormalClass_AnonymousInnerClass {

    public static void main(String[] args) {

        /*
            Normal Java Class vs Anonymous Inner Class
            ==========================================
            1.	A normal Java class can extend only one class at a time. Of course, anonymous
                inner class also extends only one class at a time.

            2.	A normal Java class can implement any number of interfaces simultaneously but
                anonymous inner class can implement only one interface at a time.

            3.	A normal Java class can extend a class and implement any number of interfaces
                simultaneously but anonymous inner class can extend a class or implement an
                interface at a time.

            4.	In normal Java class we can write any number of constructors simultaneously
                but in anonymous inner classes we can't write any constructor explicitly
                because the name of the class and constructor must be same, but anonymous
                inner classes not having any name.

            Note: If the requirement is standard and required several times, then we should go
                  for normal top-level class. If the requirement is temporary and required only
                  once (instant use) then we should go for anonymous inner class.
        */

        /*
            Where Anonymous Inner Classes is best suitable?
            ===============================================
            We can use anonymous inner classes frequently in GUI based applications to implement
            event handling.

            class MyGUIFrame extends JFrame {
            JButton b1, b2, b3;

            b1.addActionListener( new ActionListener () {
                    public void actionPerform (ActionEvent e) {
                    }
                });
            b2.addActionListener( new ActionListener () {
                    public void actionPerform (ActionEvent e) {
                    }
                });
            }
        */
    }
}
