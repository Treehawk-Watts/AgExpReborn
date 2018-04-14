package com.treehawkmods.agexpreborn;

import com.treehawkmods.agexpreborn.crops.ModItem;
import com.treehawkmods.agexpreborn.crops.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;



//@Mod.EventBusSubscriber
public class ModRecipes {
/*
    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        recipeMaker("alubrassIngot",ModItems.alubrassEssence);
        recipeMaker("aluminumIngot",ModItems.aluminumEssence);
        recipeMaker("arditeIngot",ModItems.arditeEssence);
        recipeMaker("amberGem", ModItems.amberEssence);
        recipeMaker("brassIngot", ModItems.brassEssence);
        recipeMaker("bronzeIngot",ModItems.bronzeEssence);
        recipeMaker("cobaltIngot",ModItems.cobaltEssence);
        recipeMaker("constantanIngot",ModItems.constantanEssence);
        recipeMaker("copperIngot",ModItems.copperEssence);
        recipeMaker("electrumIngot",ModItems.electrumEssence);
        recipeMaker("enderiumIngot",ModItems.enderiumEssence);
        recipeMaker("invarIngot",ModItems.invarEssence);
        recipeMaker("iridiumIngot",ModItems.iridiumEssence);
        recipeMaker("lumiumIngot",ModItems.lumiumEssence);
        recipeMaker("malachiteGem",ModItems.malachiteEssence);
        recipeMaker("manyullynIngot",ModItems.manyullynEssence);
    }

    public static void recipeMaker(String oreName, Item ingredient){
        if (OreDictionary.doesOreNameExist(oreName)) {
            NonNullList<ItemStack> oreList = OreDictionary.getOres(oreName);
            ItemStack result = oreList.get(0);
            ResourceLocation location = new ResourceLocation(AgExpReborn.MODID,oreName.toLowerCase());
            GameRegistry.addShapedRecipe(location, null, result, "XXX","X X","XXX","X", ingredient);
        }
    }
*/
}
