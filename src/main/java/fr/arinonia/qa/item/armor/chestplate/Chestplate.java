package fr.arinonia.qa.item.armor.chestplate;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.armor.Armor;
import fr.arinonia.qa.item.armor.TypeArmor;

import java.awt.image.BufferedImage;

public class Chestplate extends Armor {
    public Chestplate(String name, String description, int durability, int maxDurability, Ranks ranks, BufferedImage texture, int defense) {
        super(name, description, durability, maxDurability, ranks, texture, defense, TypeArmor.CHESTPLATE);
    }
}
