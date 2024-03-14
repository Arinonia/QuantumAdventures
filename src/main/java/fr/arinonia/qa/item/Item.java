package fr.arinonia.qa.item;

import java.awt.image.BufferedImage;

public class Item {
    protected String name;
    protected String description;
    protected int durability;
    protected int maxDurability;
    protected TypeItem type;
    protected Ranks ranks;
    protected BufferedImage texture;
    protected boolean isStackable;

    public Item(String name, String description, int durability, int maxDurability, TypeItem type, Ranks ranks, BufferedImage texture, boolean isStackable) {
        this.name = name;
        this.description = description;
        this.durability = durability;
        this.maxDurability = maxDurability;
        this.type = type;
        this.ranks = ranks;
        this.texture = texture;
        this.isStackable = isStackable;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDurability() {
        return durability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public TypeItem getType() {
        return type;
    }

    public Ranks getRanks() {
        return ranks;
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability;
    }

    public void setType(TypeItem type) {
        this.type = type;
    }

    public boolean isStackable() {
        return isStackable;
    }

    public void setStackable(boolean stackable) {
        isStackable = stackable;
    }
}
