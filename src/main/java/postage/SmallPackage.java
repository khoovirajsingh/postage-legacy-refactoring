package postage;

public class SmallPackage extends Package {
    public SmallPackage() {
    }

    @Override
    public double postageInBaseCurrency() {
        return 120;
    }
}