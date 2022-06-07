
package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateStatusDpp extends Validate{
    @Override
    public boolean isValid(String kode) {
        try {
            Pattern pattern = Pattern.compile("[1-9]{1}");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid (1-9!)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}   

