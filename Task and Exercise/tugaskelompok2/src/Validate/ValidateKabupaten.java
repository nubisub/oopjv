package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateKabupaten extends Validate{

    @Override
    public boolean isValid(String kode) {
        try {
            // if not 01, 71-75
            if (kode.equals("01") || (kode.equals("71") || kode.equals("72") || kode.equals("73") || kode.equals("74") || kode.equals("75"))) {
                return true;
            } else {
                throw new Exception("Kode kabupaten harus 01 atau 71-75");

                // return false;
                
            }
            

            // Pattern pattern = Pattern.compile("[0-9]{2}");
            // Matcher matcher = pattern.matcher(kode);
            // if (matcher.matches()) {
            //     return true;
            // } else {
            //     throw new Exception("Input Tidak Valid (2 digit angka)");
            // }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
