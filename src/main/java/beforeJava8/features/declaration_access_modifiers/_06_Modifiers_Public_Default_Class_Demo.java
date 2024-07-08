package beforeJava8.features.declaration_access_modifiers;

public class _06_Modifiers_Public_Default_Class_Demo {

    public static void main(String[] args) {

        // Accessing the Public Class
        _06_Modifiers_Public_Default_Class object = new _06_Modifiers_Public_Default_Class();
        object.demo();

        // Accessing the Default Class
        Test tesObj = new Test();
        tesObj.show();
    }
}
