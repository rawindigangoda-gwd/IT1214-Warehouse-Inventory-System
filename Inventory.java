import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully.");
    }

    public boolean removeItem(String itemId) {
        if (items.containsKey(itemId)) {
            items.remove(itemId);
            return true;
        }
        return false;
    }

    public boolean updateQuantity(String itemId, int newQuantity) {
        if (items.containsKey(itemId)) {
            items.get(itemId).setQuantity(newQuantity);
            return true;
        }
        return false;
    }

    public Item searchById(String itemId) {
        return items.get(itemId);
    }

    public Item searchByName(String name) {
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            items.values().forEach(System.out::println);
        }
    }
}