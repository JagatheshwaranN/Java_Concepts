package java7andbelow.features.development;

public class _04_Create_Jar_File {

    public static void main(String[] args) {

        /*
            Create executable Jar file
            ==========================
            Example
            =======
            import java.awt.*;
            import java.awt.event.*;
            public class JarDemo {
                Frame f = new Frame();
                f.addWindowListener(new WindowAdapter() {
                        public void windowClose(WindowEvent e) {
                        for (int i=1;i<=10;i++) {
                        SOP (I'm closing window+i);
                        System.exit(0);
                        }
                    });
                f.add(new Label (I can create executable Jar file);
                f.setSize(500, 500);
                f.setVisible(true);
                }
            }
            Manifest.MF
            Main_Class: JarDemo
            Javac JarDemo.java
            JarDemo.class
            JarDemo$1.class
            Jar -cvfm window.jar manifest.MF JarDemo.class JarDemo$1.class
            Java -jar window.jar

            Note: Even we can run Jar file by double-clicking.
        */

        /*
            How many ways to run a java program
            ===================================
            We can run a java program in the following ways,
            1.	From command prompt, we can run .class file with java command
            Example: java JarDemo
            2.	From command prompt, we can run .jar file with java command
            Example: java -jar demo.jar
            3.	By double-clicking jar file
            4.	By double-clicking a batch file
        */

        /*
            Batch File
            ==========
            A batch file contains a group of commands, whenever we double-click a
            batch file, then all commands will be executed one by one sequentially.

            Java -cp C:\exercises JarDemo
            Save the file with extension .bat
        */
    }

}
