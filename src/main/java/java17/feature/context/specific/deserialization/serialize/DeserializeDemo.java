package java17.feature.context.specific.deserialization.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("src/main/java/java17/feature/context/specific/deserialization/serialize/employee.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Approach 1
        ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("java17.feature.context.specific.deserialization.serialize.*;java.base/*;!*");

        // Approach 2
        ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(cl -> cl.equals(Employee.class), ObjectInputFilter.Status.REJECTED);

//        objectInputStream.setObjectInputFilter(filter2);

        ObjectInputFilter objectInputFilter = ObjectInputFilter.merge(filter, filter2);

        objectInputStream.setObjectInputFilter(objectInputFilter);

        Object object = objectInputStream.readObject();
        Employee employee = (Employee) object;
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.salary);
        System.out.println(employee.ssn);


    }
}
