package fr.arinonia.qa.item.resources;

import fr.arinonia.qa.item.Item;
import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;

import java.awt.image.BufferedImage;

public class Resources extends Item {
    protected TypeResources typeResources;
    public Resources(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture, TypeResources typeResources) {
        super(name, description, durability, max_durability, TypeItem.RESOURCES, ranks, texture,true);
        this.typeResources = typeResources;
    }
}
