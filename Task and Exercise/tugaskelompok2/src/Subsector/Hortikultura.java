package Subsector;

public class Hortikultura implements Usaha {
    private boolean Usaha;

    public Hortikultura() {
    }

    public Hortikultura(boolean hortikultura) {
        this.Usaha = hortikultura;
    }
    @Override
    public String getSubsector() {
        if (isUsaha() == true){
            return "Hortikultura";
        }
        else{
            return "";
        }
    }
    @Override
    public boolean isUsaha() {
        return this.Usaha;
    }
    public void setUsaha(boolean usaha) {
        Usaha = usaha;
    }
    
}