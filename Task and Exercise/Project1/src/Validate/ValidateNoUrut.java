// 1.	Abdullah Ridwan	    222011352
// 2.	Navika Artiari		222011358
// 3.	Thomson		        222011365
// 4.	Hendra Kusuma	    222011395
// 5.	Rafel Ilham Febrian	222011407

package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNoUrut extends Validate {

    @Override
    public boolean isValid(String kode) {
        try {

            Pattern pattern = Pattern.compile("[0-9]{3}");
            Matcher matcher = pattern.matcher(kode);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input tidak valid (3 digit angka)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
    
