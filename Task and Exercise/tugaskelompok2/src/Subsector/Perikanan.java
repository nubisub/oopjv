package Subsector;

public class Perikanan implements Usaha {
    private boolean Usaha;
    public Perikanan(boolean perikanan) {
        this.Usaha = perikanan;
    }
    @Override
    public String getSubsector() {
        if (isUsaha() == true){
            return "Perikanan";
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
