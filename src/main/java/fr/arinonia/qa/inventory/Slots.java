package fr.arinonia.qa.inventory;

import fr.arinonia.qa.item.Item;

public class Slots {
    protected Item item;
    protected int totalItem;
//    protected int poids;
public Slots(Item item, int totalItem) {
    this.item = item;
    this.totalItem = totalItem;
}

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return totalItem;
    }

    public void setQuantity(int totalItem) {
        this.totalItem = totalItem;
    }

}
