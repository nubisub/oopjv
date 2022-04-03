package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateKecamatan extends Validate {

    @Override
    public boolean isValid(String kodeKecamatan) {
        try {
            Pattern pattern = Pattern.compile("[0-9]{3}");
            Matcher matcher = pattern.matcher(kodeKecamatan);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid (3 digit angka)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}