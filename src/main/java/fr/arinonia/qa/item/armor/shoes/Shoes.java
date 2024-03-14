package fr.arinonia.qa.item.armor.shoes;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.armor.Armor;
import fr.arinonia.qa.item.armor.TypeArmor;

import java.awt.image.BufferedImage;

public class Shoes extends Armor {
    public Shoes(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture, int defense) {
        super(name, description, durability, max_durability, ranks, texture, defense, TypeArmor.SHOES);
    }
}
