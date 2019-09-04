package postage;

public class MediumPackage {
    private final int weight;

    public MediumPackage(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    double mediumPostageInBaseCurrency() {
        return getWeight() * 4;
    }
}
