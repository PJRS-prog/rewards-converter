public class RewardValue {
    private final int miles;
    private final double cashValue;

    public RewardValue(double cashValue) {
        double conversionRate = 0.0035;
        this.miles = (int) (cashValue* conversionRate);
        this.cashValue =cashValue;
    }

    public RewardValue( int miles) {
        double conversionRate = 0.0035;
        this.miles = miles;
        this.cashValue = miles*conversionRate;
    }

    public double getCashValue () {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.miles;
    }
}

