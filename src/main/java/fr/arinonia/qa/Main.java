package fr.arinonia.qa;

import fr.arinonia.qa.inventory.Inventory;
import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.tools.axe.Axe;
import fr.arinonia.qa.item.weapon.sword.Sword;

public class Main {
    public static final Sword fireSword = new Sword(
            "Fire Sword",
            "Sword using fire",
            5,
            5,
            Ranks.SILVER,
            null,
            7,
            1
    );
    public static final Axe woodenAxe = new Axe(
            "Wooden Axe",
            "Axe in wooden",
            11,
            11,
            Ranks.COPPER,
            null
    );
    public static void main(String[] args) {
        //new Game().start();
        final Inventory test = new Inventory(5);
        test.addItem(fireSword,1);
        test.addItem(woodenAxe,1);
        test.displayInventory();
    }
}
