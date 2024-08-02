public class RewardValue {
    private final int miles;
    private final double cashValue;
    private static final double milesToCashRate = 0.0035;

    //Constructor that takes cash value as input and returns rewards value in miles
    public RewardValue(double cashValue) {
        this.miles = (int) (cashValue / milesToCashRate);
        this.cashValue =cashValue;
    }

    //Constructor that takes number of miles as input and returns rewards value in cash
    public RewardValue( int miles) {
        this.miles = miles;
        this.cashValue = miles * milesToCashRate;
    }

    public double getCashValue () {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.miles;
    }
}

