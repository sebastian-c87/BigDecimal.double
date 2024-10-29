
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Prices {
    public static void main(String[] args) {
        double priceWithoutVat = 9.99;
        double priceWithVat = priceWithoutVat * 1.23;
        double valueWithVat = priceWithVat * 10000;
        double valueWithoutVat = valueWithVat / 1.23;

        System.out.println("Price Without VAT: " + priceWithoutVat);
        System.out.println("Price With VAT: " + priceWithVat);
        System.out.println("Value With VAT: " + valueWithVat);
        System.out.println("Value Without VAT: " + valueWithoutVat);

        //*  *//

        BigDecimal bdPriceWithoutVat = new BigDecimal("9.99");
        BigDecimal bdVat = new BigDecimal("0.23");
        BigDecimal oneBD = BigDecimal.ONE;

        BigDecimal grossPriceBD = bdPriceWithoutVat.multiply(oneBD.add(bdVat));
        BigDecimal totalGross = grossPriceBD.multiply(new BigDecimal(10000));
        BigDecimal totalNetBD = totalGross.divide(oneBD.add(bdVat), 2, RoundingMode.HALF_UP);

        System.out.println();
        System.out.println("\nPrices uses BigDecimal:");
        System.out.println("Price Without VAT: " + bdPriceWithoutVat);
        System.out.println("Price With VAT: " + grossPriceBD);
        System.out.println("Price multi 10K:" + totalGross);
        System.out.println("Price multi 10K (without VAT):" + totalNetBD);





    }
}
