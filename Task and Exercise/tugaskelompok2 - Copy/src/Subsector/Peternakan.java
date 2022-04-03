package Subsector;

public class Peternakan implements Usaha {
    private boolean Usaha;
    public Peternakan(boolean peternakan) {
        this.Usaha = peternakan;
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
    
