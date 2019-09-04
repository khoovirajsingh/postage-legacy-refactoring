package postage;

public class Package {

    private final SizedPackage sizedPackage;

    public Package(int weight, int height, int width, int depth) {
        sizedPackage = SizedPackage.createSizedPackage(depth, height, weight, width);
    }

    public double postageInBaseCurrency() {
        return sizedPackage.postageInBaseCurrency();
    }

}
