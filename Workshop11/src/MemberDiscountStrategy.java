public class MemberDiscountStrategy implements DiscountStrategy{
    public double applyDiscount(double price) {
        return price * 0.90;
    }
}

