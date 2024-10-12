package java.features.interfaces;

public class _03_Interface_Implements_Vs_Extends {

    public static void main(String[] args) {

        /*
            Implements vs Extends
            =====================
            1.	A Class can extend only one Class at a time.
            2.	An Interface can extend any number of Interfaces simultaneously.
            3.	A Class can implement any number of Interfaces simultaneously.
            4.	A Class can extend another Class and can implement any number of Interfaces simultaneously.
        */
    }
}

class Demo1 {

}

class Demo2 {

}

// class Demo3 extends Demo1, Demo2 { - '{' expected
// }

class Demo3 extends Demo1 {

}

interface IDemo2 {

}

interface IDemo3 {

}

interface IDemo4 extends IDemo2, IDemo3 {

}

class Demo4 implements IDemo2, IDemo3 {

}

class Demo5 extends Demo2 implements IDemo2, IDemo3 {

}