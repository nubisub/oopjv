package Singleton;

public class ViolentThreat {
        public void set(String s){
        GlobalConfiguration.getInstance().execute(s);;
    }
}
