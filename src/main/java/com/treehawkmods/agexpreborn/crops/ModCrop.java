package com.treehawkmods.agexpreborn.crops;

import com.treehawkmods.agexpreborn.AgExpReborn;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class ModCrop extends BlockCrops{

    public ModCrop (String name){
        setUnlocalizedName(AgExpReborn.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(AgExpReborn.MODTAB);
    }

    @Override
    public Item getSeed(){
        return super.getSeed();
    }

    @Override
    public Item getCrop(){
        return super.getCrop();
    }

}
