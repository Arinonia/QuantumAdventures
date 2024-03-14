package fr.arinonia.qa.item.armor.legging;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.armor.Armor;
import fr.arinonia.qa.item.armor.TypeArmor;

import java.awt.image.BufferedImage;

public class Legging extends Armor {
    public Legging(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture, int defense) {
        super(name, description, durability, max_durability, ranks, texture, defense, TypeArmor.LEGGING);
    }
}
