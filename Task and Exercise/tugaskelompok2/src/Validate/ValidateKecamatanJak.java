package Validate;
import java.util.Arrays;
import java.util.ArrayList;

public class ValidateKecamatanJak extends Validate{
    String kodeKabupaten;

    public ValidateKecamatanJak(String kodeKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
    }

    ArrayList<String> kepser = new ArrayList<>( Arrays.asList("010","020"));
    ArrayList<String> jaksel = new ArrayList<>(Arrays.asList("010","020","030","040","050","060","070","080","090","100"));
    ArrayList<String> jaktim = new ArrayList<>(Arrays.asList("010","020","030","040","050","060","070","080","090","100"));
    ArrayList<String> jakpus = new ArrayList<>(Arrays.asList("010","020","030","040","050","060","070","080"));
    ArrayList<String> jakbar = new ArrayList<>(Arrays.asList("010","020","030","040","050","060","070","080"));
    ArrayList<String> jakut = new ArrayList<>(Arrays.asList("010","020","030","040","050","060"));
    @Override
    public boolean isValid(String kodeKecamatan) {
        try {
            switch (kodeKabupaten) {
                case "01":
                    if (kepser.contains(kodeKecamatan)) {
                        return true;
                    } else {
                        throw new Exception("Kode Kecamatan harus 010 atau 020");
                    }
                case "71":
                    if (jaksel.contains(kodeKecamatan)) {
                        return true;
                    } else {
                        throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
                    }
                case "72":
                    if (jaksel.contains(kodeKecamatan)) {
                        return true;
                    } else {
                        throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
                    }
                case "73":  
                    if (jaksel.contains(kodeKecamatan)) {
                        return true;
                    } else {
                        throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
                    }
                case "74":  
                    if (jaksel.contains(kodeKecamatan)) {
                        return true;
                    } else {
                        throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
                    }
                case "75":  
                    if (jaksel.contains(kodeKecamatan)) {
                        return true;
                    } else {
                        throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
                    }
            
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
}
