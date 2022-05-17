package Singleton;

public class GlobalConfiguration {
    
    private static GlobalConfiguration globconfig;

    private GlobalConfiguration() {
        System.out.println("Global Configuration created!");
    }
    public static GlobalConfiguration getInstance() {
        if (globconfig == null) {
            globconfig = new GlobalConfiguration();
        }
        return globconfig;
    }
    public void execute(String rule){
        System.out.println("Executing rule: " + rule);
    }

}
