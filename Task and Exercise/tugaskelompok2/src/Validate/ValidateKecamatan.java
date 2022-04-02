package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateKecamatan extends Validate {

    // array list
    

    // jaksel.add("010");
    // jaksel.add("020");
    // jaksel.add("030");
    // jaksel.add("040");
    // jaksel.add("050");
    // jaksel.add("060");
    // jaksel.add("070");
    // jaksel.add("080");
    // jaksel.add("090");
    // jaksel.add("100");
    // // initiate arraylist

    // private static ArrayList<String> jakpus = new ArrayList<String>();

    @Override
    public boolean isValid(String kodeKecamatan) {
        try {
            Pattern pattern = Pattern.compile("[0-9]{3}");
            Matcher matcher = pattern.matcher(kodeKecamatan);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Input Tidak Valid (3 digit angka)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    // public boolean isValid2(String kodeKabupaten, String kodeKecamatan) {
    //     try {
    //         switch (kodeKabupaten) {
    //             case "01":
    //                 if (kepser.contains(kodeKecamatan)) {
    //                     return true;
    //                 } else {
    //                     throw new Exception("Kode Kecamatan harus 01 atau 02");
    //                 }
    //             case "71":
    //                 if (jaksel.contains(kodeKecamatan)) {
    //                     return true;
    //                 } else {
    //                     throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
    //                 }
    //             case "72":
    //                 if (jaksel.contains(kodeKecamatan)) {
    //                     return true;
    //                 } else {
    //                     throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
    //                 }
    //             case "73":  
    //                 if (jaksel.contains(kodeKecamatan)) {
    //                     return true;
    //                 } else {
    //                     throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
    //                 }
    //             case "74":  
    //                 if (jaksel.contains(kodeKecamatan)) {
    //                     return true;
    //                 } else {
    //                     throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
    //                 }
    //             case "75":  
    //                 if (jaksel.contains(kodeKecamatan)) {
    //                     return true;
    //                 } else {
    //                     throw new Exception("Kode Kecamatan harus 010,020,030,040,050,060,070,080,090,100");
    //                 }
            
    //             default:
    //                 break;
    //         }
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //         return false;
    //     }
    //     return false;
    // }

  
}