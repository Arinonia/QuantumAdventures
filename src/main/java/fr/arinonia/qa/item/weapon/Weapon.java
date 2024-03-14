package fr.arinonia.qa.item.weapon;

import fr.arinonia.qa.item.Item;
import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;

import java.awt.image.BufferedImage;

public class Weapon extends Item {
    protected int damage;
    protected int attackRange;
    protected  TypeWeapon typeWeapon;

    //    protected int min_level;
    public Weapon(String name, String description, int durability, int max_durability, TypeWeapon typeWeapon, Ranks ranks, BufferedImage texture, int damage, int attackRange) {
        super(name, description, durability, max_durability, TypeItem.WEAPON, ranks, texture,false);
        this.damage = damage;
        this.attackRange = attackRange;
        this.typeWeapon = typeWeapon;
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public TypeWeapon getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(TypeWeapon typeWeapon) {
        this.typeWeapon = typeWeapon;
    }
}
