package postage;

public class Package {

    private final SizedPackage sizedPackage;

    public Package(SizedPackage sizedPackage) {
        this.sizedPackage = sizedPackage;
    }

    public double postageInBaseCurrency() {
        return sizedPackage.postageInBaseCurrency();
    }

}
