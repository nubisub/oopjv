package Singleton;

public class MaximumCharacter {
    public void set(String s){
        GlobalConfiguration.getInstance().execute(s);;
    }
}
