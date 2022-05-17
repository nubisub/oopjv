package latihan.gui;

public class session {
    private static session instance;
    private static String username;
    session(){
        username = "";
    }
    public static session getInstance(){
        // if instance is null, create new instance
        if (instance == null) {
            instance = new session();
        }
        return instance;
    }
    public void setUsername(String username) {
        session.username = username;
    }
    public String getUsername() {
        return username;
    }

}
