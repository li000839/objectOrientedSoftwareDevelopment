package Q2;

public class AuctionBid implements Comparable <AuctionBid> {
    public final String name;
    public final String itemName;
    public final int amount;

    public AuctionBid(String name, String itemName, int amount) {
        this.name = name;
        this.itemName = itemName;
        this.amount = amount;
    }
    public int compareTo(AuctionBid other) {
        int result = this.name.compareTo((other.name));
        if (result != 0) {
            return result;
        }
        result =  this.itemName.compareTo(other.itemName);
        if (result != 0) {
            return result;
        }
        return amount - other.amount;
    }
}
