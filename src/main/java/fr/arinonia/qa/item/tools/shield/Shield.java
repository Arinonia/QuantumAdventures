package fr.arinonia.qa.item.tools.shield;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;
import fr.arinonia.qa.item.tools.Tools;
import fr.arinonia.qa.item.tools.TypeTools;
import fr.arinonia.qa.item.tools.TypeUsage;

import java.awt.image.BufferedImage;

public class Shield extends Tools {
    public Shield(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture) {
        super(name, description, durability, max_durability, TypeTools.SHIELD, ranks, texture, TypeUsage.PROTECT);
    }
}
