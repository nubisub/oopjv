package Validate;

public class ValidateKabupaten extends Validate{

    @Override
    public boolean isValid(String kode) {
        try {
            // if not 01, 71-75
            if (kode.equals("01") || (kode.equals("71") || kode.equals("72") || kode.equals("73") || kode.equals("74") || kode.equals("75"))) {
                return true;
            } else {
                throw new Exception("Kode kabupaten harus 01 atau 71-75");               
            }
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
