package java7andbelow.features.inner_classes;

public class _08_NestedClass_Interface_Combination {

    public static void main(String[] args) {

        /*

            Various combinations of Nested Classes and Interfaces
            =====================================================
            Class inside Class
            ==================
            Without the existence of one type of object if there is no chance of existence of
            another type of object, then we can declare a class inside a class.

            University consists of several departments and without existence of university there
            is no chance of existence of department. Hence, we have to declare department class
            inside university class.

            class University {
                class Department {
                }
            }

            Interface inside Class
            ======================
            Inside a class if we require the multiple implementations of an interface and all
            these implementations are related to a particular class then we can define an interface
            inside a class.

            class VehicleTypes {
                interface Vehicle {
                    public int getNoOfWheels ();
                }

                class Bus implements Vehicle {
                    public int getNoOfWheels () {
                        return 6;
                    }
                }
            }

            Interface inside Interface
            ==========================
            We can declare an interface inside interface. A map is a group of key value pairs and
            each key value pair is called an entry. Without the existence of map object there is
            no chance of existence of entry object. Hence, interface entry is defined inside the
            map interface.

            interface Map {
                interface Entry {
                }
            }

            Every interface present inside an interface is always public and static whether we are
            declaring or not. Hence, we can implement inner interface directly without implementing
            the outer interface. Similarly, whenever we are implementing outer interface, we are not
            required to implement inner interface. i.e., we can implement outer and inner interfaces
            independently.

            interface Outer {
                public void m1 ();
            }

            interface Inner {
                public void m2 ();
            }

            class Test1 implements Outer {
                pubic void m1 () {
                    SOP(Outer Interface Method);
                }
            }

            class Test2 implements Inner {
                pubic void m2 () {
                    SOP(Inner Interface Method);
                }
            }

            class Test {
                public static void main (String[] args) {
                    Test1 t1 = new Test1 ();
                    t1. m1();
                    Test2 t2 = new Test2 ();
                    t2. m2();
                }
            }

            Class inside Interface
            ======================
            If a functionality of a class is closely associated with the interface, then it's
            highly recommended to declare a class inside interface.

            interface EmailService {
                public void sendEmail (EmailDetails e);
                class EmailDetails {
                    String toList;
                    String ccList;
                    String subject;
                }
            }

            In the above example, EmailDetails is required only for EmailService and we are not
            using anywhere else. Hence, EmailDetails class is recommended to declare inside
            EmailService interface.

            We can also define a class inside interface to provide default implementation for that
            interface.

            interface Vehicle {
                public int getNoOfWheels ();
                class DefaultVehicle implements Vehicle {
                    public int getNoOfWheels {
                    return 2;
                    }
                }
            }

            class Bus implements Vehicle {
                public int getNoOfWheels {
                return 6;
                }
            }

            class Test {
                public static void main (String[] args) {
                    Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle ();
                    SOP (d.getNoOfWheels ());
                    Bus b = new Bus ();
                    SOP (b.getNoOfWheels ());
                }
            }
            In the above example, DefaultVehicle is default implementation of Vehicle interface
            whereas Bus is customized implementation of Vehicle interface.

            The class which is declared inside Interface is always public static whether we are
            declaring it or not. Hence, we can create class object directly without having outer
            interface type object.
        */

        /*
            Conclusions
            ===========
            1.	Among classes and interfaces, we can declare anything inside anything.
            2.	Interface which is declared inside interface is always public and static
                whether we are declaring or not.
            3.	Class which is declared inside interface is always public and static whether
                we are declaring or not.
            4.	Interface which is declared inside a class is always static but need not be
                public.
        */
    }
}
