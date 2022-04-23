package Subsector;

public class Perikanan implements Usaha {
    private boolean Usaha;
    public Perikanan(boolean perikanan) {
        this.Usaha = perikanan;
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
