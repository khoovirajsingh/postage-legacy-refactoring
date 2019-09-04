package postage;

public class LargePackage extends Package {
    private final int depth;
    private final int height;
    private final int weight;
    private final int width;

    public LargePackage(int depth, int height, int weight, int width) {
        this.depth = depth;
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public double postageInBaseCurrency() {
        return Math.max(weight, height * width * depth / 1000) * 6;
    }
}
