package Subsector;

public class TanamanPangan implements Usaha {
    private boolean Usaha;
    public TanamanPangan(boolean tanamanpangan) {
        this.Usaha = tanamanpangan;
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
