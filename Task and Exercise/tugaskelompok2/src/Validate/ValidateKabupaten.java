package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateKabupaten extends ValidateString{

    @Override
    public boolean isValid(String kode) {
        try {
            Pattern pattern = Pattern.compile("[0-9]{2}");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid (2 digit angka)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
