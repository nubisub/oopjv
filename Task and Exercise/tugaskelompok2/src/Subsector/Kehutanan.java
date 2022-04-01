package Subsector;

public class Kehutanan implements Usaha{
    private boolean Usaha;

    public Kehutanan() {
    }

    public Kehutanan(boolean kehutanan) {
        this.Usaha = kehutanan;
    }
    @Override
    public String getSubsector() {
        if (isUsaha() == true){
            return "Kehutanan";
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
