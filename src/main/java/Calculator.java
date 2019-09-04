import static postage.Package.createSizedPackage;

public class Calculator {
    public Money calculate(int weight, int height, int width, int depth, Currency currency) {
        double postageInBaseCurrency = createSizedPackage(depth, height, weight, width).postageInBaseCurrency();
        return convertCurrency(postageInBaseCurrency, currency);
    }

    private Money convertCurrency(double amountInBaseCurrency, Currency currency) {
        if (currency == Currency.Gbp)
            return new Money(Currency.Gbp, amountInBaseCurrency);
        if (currency == Currency.Eur)
            return new Money(Currency.Eur, (amountInBaseCurrency + 200) * 1.25);
        if (currency == Currency.Chf)
            return new Money(Currency.Chf, (amountInBaseCurrency + 200) * 1.36);
        return null;
    }
}
