package com.treehawkmods.agexpreborn;

import com.treehawkmods.agexpreborn.crops.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs{
    public ModTab(){
        super(AgExpReborn.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.chickenSprout);
    }
}
