package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validasitelphone extends ValidateString {
    @Override
    public boolean isValid(String kode) {
        try {
            int x = kode.length();
            Pattern pattern = Pattern.compile("[0-9]{9}");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid (Harus 9 digit angka)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
