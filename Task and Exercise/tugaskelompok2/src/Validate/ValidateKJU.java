package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateKJU extends ValidateString {

    @Override
    public boolean isValid(String kode) {
        try {
            if (kode.length() != 2) {
                throw new Exception("Kode KJU harus 2 digit");
            }
            Pattern pattern = Pattern.compile("[0-9]{2}");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Kode KJU harus angka");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
