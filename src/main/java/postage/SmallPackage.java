package postage;

public class SmallPackage extends SizedPackage {
    public SmallPackage() {
    }

    @Override
    double postageInBaseCurrency() {
        return 120;
    }
}