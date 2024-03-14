package fr.arinonia.qa.item.armor;

import fr.arinonia.qa.item.Item;
import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;

import java.awt.image.BufferedImage;

public class Armor extends Item {
    protected int defense;
    protected TypeArmor typeArmor;
    public Armor(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture, int defense, TypeArmor typeArmor) {
        super(name, description, durability, max_durability, TypeItem.ARMOR, ranks, texture,false);
        this.defense = defense;
        this.typeArmor = typeArmor;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public TypeArmor getTypeArmor() {
        return typeArmor;
    }

    public void setTypeArmor(TypeArmor typeArmor) {
        this.typeArmor = typeArmor;
    }
}
