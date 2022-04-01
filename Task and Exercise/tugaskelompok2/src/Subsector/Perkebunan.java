package Subsector;

public class Perkebunan implements Usaha {
    private String Usaha;
    public Perkebunan(String perkebunan) {
        switch (perkebunan) {
            case "3a":
                this.Usaha = "Kakao/cokelat";
                break;
            case "3b":
                this.Usaha = "Karet";
                break;
            case "3c":
                this.Usaha = "Kelapa Sawit";
                break;
            case "3d":
                this.Usaha = "Kopi";
                break;
            case "3e":
                this.Usaha = "Teh";
                break;
            case "3f":
                this.Usaha = "Tebu";
                break;
            case "3g":
                this.Usaha = "Tembakau";
                break;
            case "3h":
                this.Usaha = "Cengkeh";
                break;
            case "3i":
                this.Usaha = "Kelapa";
                break;
            case "3j":
                this.Usaha = "Lada";
                break;
            case "3k":
                this.Usaha = "Tanaman Lainnya";
                break;
            default:
                this.Usaha = "error";
                break;
        }
    }
    @Override
    public String getSubsector() {
        return Usaha;
    }
    @Override
    public boolean isUsaha() {
        if (Usaha.equals("3a") || Usaha.equals("3b") || Usaha.equals("3c") || Usaha.equals("3d") || Usaha.equals("3e") || Usaha.equals("3f") || Usaha.equals("3g") || Usaha.equals("3h") || Usaha.equals("3i") || Usaha.equals("3j") || Usaha.equals("3k")) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
