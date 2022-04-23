// 1.	Abdullah Ridwan	    222011352
// 2.	Navika Artiari		222011358
// 3.	Thomson		        222011365
// 4.	Hendra Kusuma	    222011395
// 5.	Rafel Ilham Febrian	222011407

package Validate;

public class ValidatePerkebunan extends Validate{
    @Override
    public boolean isValid(String kode){
        
        try {
            if (kode.matches("[3][a-k]|[0]")) {
                return true;
            } else {
                throw new Exception("Kode Perkebunan harus 3a-3k/0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
