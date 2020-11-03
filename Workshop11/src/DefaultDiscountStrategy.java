public class DefaultDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}
