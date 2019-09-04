package postage;

public class MediumPackage extends SizedPackage {
    private final int weight;

    public MediumPackage(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    double postageInBaseCurrency() {
        return getWeight() * 4;
    }
}
