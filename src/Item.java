public class Item {
    String itemName;
    boolean putAway;

    public Item(String itemName, boolean putAway) {
        this.itemName = itemName;
        this.putAway = putAway;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isPutAway() {
        return putAway;
    }
}
