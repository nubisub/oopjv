package Subsector;

public class TanamanPangan implements Usaha {
    private boolean Usaha;
    public TanamanPangan(boolean tanamanpangan) {
        this.Usaha = tanamanpangan;
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
