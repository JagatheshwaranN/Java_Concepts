package java17.feature.instanceOf.switch_exp;

public class _02_Switch_Exp_InstanceOf_Demo2 {

    public static void main(String[] args) {
        testSwitchExp("Java 11");
        testSwitchExp("Java 16");
        testSwitchExp("");
        testSwitchExp(null);
    }

    @SuppressWarnings("preview")
	private static void testSwitchExp(String var){
         switch(var){
            case "Java 11", "Java 16" -> System.out.println("Java LTS Version");
            case null -> System.out.println("Unknown");
            default -> System.out.println("OK");
        }
    }
}
