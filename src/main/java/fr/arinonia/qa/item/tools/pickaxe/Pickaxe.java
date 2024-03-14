package fr.arinonia.qa.item.tools.pickaxe;

import fr.arinonia.qa.item.Ranks;
import fr.arinonia.qa.item.TypeItem;
import fr.arinonia.qa.item.tools.Tools;
import fr.arinonia.qa.item.tools.TypeTools;
import fr.arinonia.qa.item.tools.TypeUsage;

import java.awt.image.BufferedImage;

public class Pickaxe extends Tools {
    public Pickaxe(String name, String description, int durability, int max_durability, Ranks ranks, BufferedImage texture) {
        super(name, description, durability, max_durability, TypeTools.PICKAXE, ranks, texture,TypeUsage.MINER);
    }
}
