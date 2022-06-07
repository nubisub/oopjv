
package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateBoolean extends Validate {

    @Override
    public boolean isValid(String kode) {
        try {
            Pattern pattern = Pattern.compile("[0-1]{1}");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid (0/1!)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

