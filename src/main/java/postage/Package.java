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
        if (weight <= 60 && height <= 229 && width <= 162 && depth <= 25) {
            return 120;
        }
        if (weight <= 500 && height <= 324 && width <= 229 && depth <= 100) {
            return weight * 4;
        }
        return Math.max(weight, height * width * depth / 1000) * 6;
    }
}
