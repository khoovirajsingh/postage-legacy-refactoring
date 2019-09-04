package postage;

public class MediumPackage extends Package {
    private final int weight;

    public MediumPackage(int weight) {
        this.weight = weight;
    }

    public double postageInBaseCurrency() {
        return weight * 4;
    }
}
