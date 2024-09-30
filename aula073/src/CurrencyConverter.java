public class CurrencyConverter {
    private static final double IOF = 6;

    public static double reaisToDollars(double priceDollar, double quantityDollar) {
        return (quantityDollar * priceDollar) + (quantityDollar * priceDollar  * (IOF / 100));
    }
}
