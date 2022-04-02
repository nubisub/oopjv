package Subsector;

public class Hortikultura implements Usaha {
    private boolean Usaha;
    public Hortikultura(boolean hortikultura) {
        this.Usaha = hortikultura;
    }
    public Hortikultura() {
    }
    @Override
    public String getSubsector() {
        if (isUsaha() == true){
            return "1";
        }
        else{
            return "0";
        }
    }
    @Override
    public boolean isUsaha() {
        return this.Usaha;
    }
    @Override
    public void setUsaha(boolean usaha) {
        this.Usaha = usaha;
    }
    
}