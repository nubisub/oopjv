package Subsector;

public class Perkebunan implements Usaha {
    private String Usaha;

    // public Perkebunan(String perkebunan) {
    //     this.Usaha = perkebunan;
    // }
    // private boolean binUsaha;

    public Perkebunan() {
    }

    public Perkebunan(String perkebunan) {
        this.Usaha = perkebunan;
    }
    @Override
    public String getSubsector() {
        return Usaha;
    }
    @Override
    public boolean isUsaha() {
        if (Usaha.equals("3a") || Usaha.equals("3b") || Usaha.equals("3c") || Usaha.equals("3d") || Usaha.equals("3e") || Usaha.equals("3f") || Usaha.equals("3g") || Usaha.equals("3h") || Usaha.equals("3i") || Usaha.equals("3j") || Usaha.equals("3k")||Usaha.equals("0") ){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void setUsaha(boolean usaha) {
        // this.binUsaha = usaha;
    }
    public void setUsaha(String usaha) {
        this.Usaha = usaha;
    }
    
}
