package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateKecamatan extends ValidateString {


    @Override
    public boolean isValid(String kodeKecamatan) {
        try {
            if (kodeKecamatan.length() != 3) {
                throw new Exception("Kode Kecamatan harus 3 digit");
            }
            Pattern pattern = Pattern.compile("[0-9]{3}");
            Matcher matcher = pattern.matcher(kodeKecamatan);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Kode Kecamatan harus angka");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}