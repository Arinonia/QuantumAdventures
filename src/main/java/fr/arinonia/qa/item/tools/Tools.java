package fr.arinonia.qa.item.tools;

import fr.arinonia.qa.item.Item;
import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;

import java.awt.image.BufferedImage;

public class Tools extends Item {
    protected TypeUsage typeUsage;
    protected TypeTools typeTools;
    public Tools(String name, String description, int durability, int max_durability, TypeTools typeTools, Ranks ranks, BufferedImage texture, TypeUsage typeUsage) {
        super(name, description, durability, max_durability, TypeItem.TOOLS, ranks, texture,false);
        this.typeUsage = typeUsage;
        this.typeTools = typeTools;
    }

    public TypeUsage getTypeUsage() {
        return typeUsage;
    }

    public void setTypeUsage(TypeUsage typeUsage) {
        this.typeUsage = typeUsage;
    }

    public TypeTools getTypeTools() {
        return typeTools;
    }

    public void setTypeTools(TypeTools typeTools) {
        this.typeTools = typeTools;
    }
}
