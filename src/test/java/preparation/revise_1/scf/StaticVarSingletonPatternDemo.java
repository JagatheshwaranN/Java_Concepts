package preparation.revise_1.scf;

public class StaticVarSingletonPatternDemo {

    private static StaticVarSingletonPatternDemo instance;

    private StaticVarSingletonPatternDemo() {

    }

    public static StaticVarSingletonPatternDemo getInstance(){
        if(instance == null){
            instance = new StaticVarSingletonPatternDemo();
        }
        return instance;
    }

}
