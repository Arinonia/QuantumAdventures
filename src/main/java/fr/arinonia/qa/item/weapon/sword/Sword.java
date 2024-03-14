package fr.arinonia.qa.item.weapon.sword;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;
import fr.arinonia.qa.item.weapon.TypeWeapon;
import fr.arinonia.qa.item.weapon.Weapon;

import java.awt.image.BufferedImage;

public class Sword extends Weapon {
    public Sword(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture, int damage, int attack_range) {
        super(name, description, durability, max_durability, TypeWeapon.SWORD, ranks, texture, damage, attack_range);
    }
}
