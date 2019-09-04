package postage;

public class Package {
    private final int weight;
    private final int height;
    private final int width;
    private final int depth;
    private final SizedPackage aPackage;

    public Package(int weight, int height, int width, int depth) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
        aPackage = createPackage();
    }

    public double postageInBaseCurrency() {
        return aPackage.postageInBaseCurrency();
    }

    private SizedPackage createPackage() {
        if (isSmall()) {
            return new SmallPackage();
        }
        if (isMedium()) {
            return new MediumPackage(weight);
        }
        return new LargePackage(depth, height, weight, width);
    }

    private boolean isMedium() {
        return weight <= 500 && height <= 324 && width <= 229 && depth <= 100;
    }

    private boolean isSmall() {
        return weight <= 60 && height <= 229 && width <= 162 && depth <= 25;
    }
}
