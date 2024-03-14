package fr.arinonia.qa.item.tools.shovel;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;
import fr.arinonia.qa.item.tools.Tools;
import fr.arinonia.qa.item.tools.TypeTools;
import fr.arinonia.qa.item.tools.TypeUsage;

import java.awt.image.BufferedImage;

public class Shovel extends Tools {
    public Shovel(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture) {
        super(name, description, durability, max_durability, TypeTools.SHOVEL, ranks, texture, TypeUsage.DIG);
    }
}
