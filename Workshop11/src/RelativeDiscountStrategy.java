public class RelativeDiscountStrategy implements DiscountStrategy{
    public double applyDiscount(double price) {
        return price * 0.01;
    }
}


