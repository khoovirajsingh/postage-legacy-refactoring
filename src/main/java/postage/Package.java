package postage;

public class Package {
    private final int weight;
    private final int height;
    private final int width;
    private final int depth;

    public Package(int weight, int height, int width, int depth) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double postageInBaseCurrency() {
        if (isSmall()) {
            return new SmallPackage().smallPostageInBaseCurrency();
        }
        if (isMedium()) {
            return new MediumPackage(weight).mediumPostageInBaseCurrency();
        }
        return new LargePackage(depth, height, weight, width).largePostageInBaseCurrency();
    }

    private boolean isMedium() {
        return weight <= 500 && height <= 324 && width <= 229 && depth <= 100;
    }

    private boolean isSmall() {
        return weight <= 60 && height <= 229 && width <= 162 && depth <= 25;
    }
}
