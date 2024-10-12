package preparation.revise_1.iface;

public class MarkerIfaceDemo {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        if(myClass instanceof SerializableMarker){
            System.out.println("Object is Serializable");
        }else{
            System.out.println("Object is not Serializable");
        }
    }

    public interface SerializableMarker {

    }

    public static class MyClass implements SerializableMarker {

    }
}
