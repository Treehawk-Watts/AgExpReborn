package com.treehawkmods.agexpreborn.crops;

import com.treehawkmods.agexpreborn.AgExpReborn;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ModSeed extends ItemSeeds{

    public ModSeed(String name, BlockCrops crops) {
        super(crops, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AgExpReborn.MODTAB);
    }

}
