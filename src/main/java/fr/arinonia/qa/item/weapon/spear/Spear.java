package fr.arinonia.qa.item.weapon.spear;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;
import fr.arinonia.qa.item.weapon.TypeWeapon;
import fr.arinonia.qa.item.weapon.Weapon;

import java.awt.image.BufferedImage;

public class Spear extends Weapon {
    public Spear(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture, int damage, int attack_range) {
        super(name, description, durability, max_durability, TypeWeapon.SPEAR, ranks, texture, damage, attack_range);
    }
}
