package Subsector;

public class Peternakan implements Usaha {
    private boolean Usaha;
    public Peternakan(boolean peternakan) {
        this.Usaha = peternakan;
    }
    @Override
    public String getSubsector() {
        if (isUsaha() == true){
            return "Peternakan";
        }
        else{
            return "";
        }
    }
    @Override
    public boolean isUsaha() {
        return this.Usaha;
    }
}
    
