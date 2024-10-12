package preparation.revise_1.scf;

public class StaticVarInitOnDemandDemo {

    private StaticVarInitOnDemandDemo() {

    }

    private static class StaticVarInitOnDemandDemoHolder {
        private static final StaticVarInitOnDemandDemo INSTANCE = new StaticVarInitOnDemandDemo();
    }

    public static StaticVarInitOnDemandDemo getInstance(){
        return StaticVarInitOnDemandDemoHolder.INSTANCE;
    }
    
}
