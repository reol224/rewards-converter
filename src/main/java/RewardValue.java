public class RewardValue {
    private final double cash;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.00035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }

    private static int convertToMiles(double cash) {
        return (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int miles) {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return convertToMiles(this.cash);
    }
}
