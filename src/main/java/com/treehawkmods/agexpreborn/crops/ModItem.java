package com.treehawkmods.agexpreborn.crops;

import com.treehawkmods.agexpreborn.AgExpReborn;
import net.minecraft.item.Item;

public class ModItem extends Item {

    public ModItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AgExpReborn.MODTAB);
    }
}
