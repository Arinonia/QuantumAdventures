package fr.arinonia.qa.inventory;

import fr.arinonia.qa.item.Item;
import fr.arinonia.qa.item.armor.Armor;
import fr.arinonia.qa.item.tools.Tools;
import fr.arinonia.qa.item.weapon.Weapon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    protected final LinkedList<Slots> inventory;
    protected final int maxSlots;

    public Inventory(int maxSlots) {
        //this.inventory = new ArrayList<>();
        this.inventory = new LinkedList<>();
        this.maxSlots = maxSlots;
    }

    public void addItem(Item item, int quantity) {
        if(item.isStackable()){
            for (Slots slot : inventory) {
                if (slot.getItem().equals(item)) {
                    slot.setQuantity(slot.getQuantity() + quantity);
                    return;
                }
            }
            inventory.add(new Slots(item, quantity));
        }else{
            for (int i = 0; i < quantity; i++) {
                inventory.add(new Slots(item, 1));
            }
        }
    }

    public void removeItem(Item item, int quantity) {
        for (Slots slot : inventory) {
            if (slot.getItem().equals(item)) {
                int new_quantity = slot.getQuantity() - quantity;
                if (new_quantity <= 0) {
                    inventory.remove(slot);
                } else {
                    slot.setQuantity(new_quantity);
                }
                return;
            }
        }
    }

    public void displayInventory() {
        System.out.println("Inventory :");
        for (Slots slot : inventory) {
            System.out.println(
                    slot.getItem().getName() +
                            ": " +
                            slot.getQuantity() +
                            "\n" +
                            slot.getItem().getDescription() +
                            "\n" +
                            slot.getItem().getType()
            );
            /// TODO :
            /// Les Switch imbriquer sont a titre de test et ne seront surement pas utiliser
            /// peux etre ajouter une variable dans le slot qui stockera directement le type/class dans le Sloat
            final Item item = slot.getItem();
            switch (item.getType()){
                case FOOD:
                    break;
                case POTION:
                    break;
                case RESOURCES:
                    break;
                case WEAPON:
                    final Weapon weapon = (Weapon) item;
                    switch (weapon.getTypeWeapon()){
                        case SWORD:
                            break;
                        case BOW:
                            break;
                        case SPEAR:
                            break;
                    }
                    break;
                case TOOLS:
                    final Tools tools = (Tools) item;
                    switch (tools.getTypeTools()){
                        case PICKAXE:
                            break;
                        case AXE:
                            break;
                        case SHOVEL:
                            break;
                        case HOE:
                            break;
                        case SHIELD:
                            break;
                    }
                    break;
                case ARMOR:
                    final Armor armor = (Armor) item;
                    switch (armor.getTypeArmor()){
                        case HELMET:
                            break;
                        case CHESTPLATE:
                            break;
                        case LEGGING:
                            break;
                        case SHOES:
                            break;
                    }
                    break;
            }
//            if (slot.getItem() instanceof Weapon weapon){
//               System.out.println("find weapon");
//               if (weapon instanceof Sword sword) {
//                    System.out.println("sword");
//               }
//                System.out.printf(slot.getItem().getClass().getSimpleName());
//            }
//            if (slot.getItem() instanceof Armor armor){
//                System.out.println("find armor");
//            }
        }
    }
}
