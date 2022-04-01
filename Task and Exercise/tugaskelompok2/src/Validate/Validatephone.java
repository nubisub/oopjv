package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validatephone extends Validate {
    @Override
    public boolean isValid(String kode) {
        try {
            if (kode.length() <= 9) {
                throw new Exception("Input Tidak Valid (Harus > 9)");
            }
            Pattern pattern = Pattern.compile("[0-9]*");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
