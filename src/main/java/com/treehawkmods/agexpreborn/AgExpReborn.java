package com.treehawkmods.agexpreborn;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = AgExpReborn.MODID, name = AgExpReborn.MODNAME, version = AgExpReborn.MODVERSION)
public class AgExpReborn {

    public final static String MODID = "agexpreborn";
    public final static String MODNAME = "Agricultural Expansion Reborn";
    public final static String MODVERSION = "1.12.2-0.0.1";

    public static final ModTab MODTAB = new ModTab();

    @SidedProxy(clientSide = "com.treehawkmods.agexpreborn.ClientProxy", serverSide = "com.treehawkmods.agexpreborn.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static AgExpReborn instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
