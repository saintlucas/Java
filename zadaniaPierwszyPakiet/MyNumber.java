package zadaniaPierwszyPakiet;

public class MyNumber {
    private double value;

    public MyNumber(double value) {
        this.value = value;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isEven() {
        return value % 2 = 0;
    }

    public double sqrt() {
        return Math.sqrt(value);
    }

    public MyNumber add(MyNumber otherValue) {
        return new MyNumber(value + otherValue.value);
    }

    public MyNumber subract(MyNumber otherValue) {
        return new MyNumber(value - otherValue.value);
    }


}
