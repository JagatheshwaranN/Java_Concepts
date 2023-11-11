package java7andbelow.features.collections.map;

public class _11_Properties {

    public static void main(String[] args) {

        /*
            Properties
            ==========
            In our program, we change fields like username, password, mail Id, and mobile number, etc.
            frequently, are not recommended to hardcode in the java program.Because, if there is any
            change, to reflect that change, recompilation, rebuild, redeploy application are required
            and even sometimes server restart is also required which creates a big business impact on
            the client.

            We can overcome this problem by using properties file such a type of variable things we
            have to configure in the properties file. From the properties file, we have to read into
            java program, and we can use those properties. The main advantage of this approach is, if
            there is a change in the properties file, to reflect that change, just redeployment is
            enough and which won't create any business impact on the client.

            We can use java properties objects to hold the properties which are coming from properties
            file.

            In normal Map (like HashMap, Hashtable and TreeMap) key and value can be any type, but in
            the case of properties, key and value should be string type.

            Properties Constructor
            ======================
            Properties p = new Properties();

            Properties Methods
            ==================
            String setProperty(String name, String value)
            It is used to set a new property. If the specified property already available,
            then old value will be replaced with new value and returns old value.

            String getProperty(String name)
            It is used to get the value associated with the specified property. If the
            specified property is not available, then this method returns null.

            Enumeration propertyNames()
            It is used to return all property names present in the property object.

            void load(InputStream is)
            It is used to load properties from properties file into a java properties object.

            void store (OutputStream os, String comment)
            It is used to store properties from java properties object into properties file.
        */
    }
}
