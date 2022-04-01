public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;

    static double getServiceDiscountRate(String membertype) {
        if (membertype == "premium") {
            return serviceDiscountPremium;
        } else if (membertype == "gold") {
            return serviceDiscountGold;
        } else if (membertype == "silver") {
            return serviceDiscountSilver;
        } else {
            return 0;
        }
    }
    static double getProductDiscountRate(String membertype) {
        if (membertype == "premium") {
            return productDiscountPremium;
        } else if (membertype == "gold") {
            return productDiscountGold;
        } else if (membertype == "silver") {
            return productDiscountSilver;
        } else {
            return 0;
        }
    }
}
