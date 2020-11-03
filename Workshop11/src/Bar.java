import java.util.*;

public class Bar {
    private final Map<String, Double> menu = new HashMap<>();
    private final Map<String, DiscountStrategy> people = new HashMap<>();

    public Bar() {
        menu.put("Orange juice", 1.00);
        menu.put("Water", 0.00);
        menu.put("Lemon squash", 2.00);

        people.put("Alice", new RelativeDiscountStrategy());
        people.put("Bob", new MemberDiscountStrategy());
    }

    public double getPrice(String customer, String drink) {
        if (menu.containsKey(drink)) {
            return people.getOrDefault(customer, new DefaultDiscountStrategy()).applyDiscount(menu.get(drink));
        } else {
            return 0;
        }
    }
}
