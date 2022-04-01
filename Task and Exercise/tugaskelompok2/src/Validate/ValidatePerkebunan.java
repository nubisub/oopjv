package Validate;

public class ValidatePerkebunan extends ValidateString{
    @Override
    public boolean isValid(String kode){
        
        try {
            if (kode.matches("[3][a-k]")) {
                return true;
            } else {
                throw new Exception("Kode Perkebunan harus 3a-3k");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
