// 1.	Abdullah Ridwan	    222011352
// 2.	Navika Artiari		222011358
// 3.	Thomson		        222011365
// 4.	Hendra Kusuma	    222011395
// 5.	Rafel Ilham Febrian	222011407

package Subsector;

public class Kehutanan implements Usaha{
    private boolean Usaha;
    public Kehutanan(boolean kehutanan) {
        this.Usaha = kehutanan;
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
