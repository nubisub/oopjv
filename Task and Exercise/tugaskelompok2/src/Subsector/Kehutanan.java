package Subsector;

public class Kehutanan implements Usaha{
    private boolean Usaha;
    public Kehutanan(boolean kehutanan) {
        this.Usaha = kehutanan;
    }

    public Kehutanan() {
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
