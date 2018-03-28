package com.treehawkmods.agexpreborn.crops;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModBlocks {
    public static ModCrop alubrassCrop = new ModCrops.AlubrassCrop("alubrass_crop");
    public static ModCrop aluminumCrop = new ModCrops.AluminumCrop("aluminum_crop");
    public static ModCrop amberCrop = new ModCrops.AmberCrop("amber_crop");
    public static ModCrop apatiteCrop = new ModCrops.ApatiteCrop("apatite_crop");
    public static ModCrop arditeCrop = new ModCrops.ArditeCrop("ardite_crop");
    public static ModCrop basalzCrop = new ModCrops.BasalzCrop("basalz_crop");
    public static ModCrop blazeCrop = new ModCrops.BlazeCrop("blaze_crop");
    public static ModCrop blitzCrop = new ModCrops.BlitzCrop("blitz_crop");
    public static ModCrop blizzCrop = new ModCrops.BlizzCrop("blizz_crop");
    public static ModCrop brassCrop = new ModCrops.BrassCrop("brass_crop");
    public static ModCrop bronzeCrop = new ModCrops.BronzeCrop("bronze_crop");
    public static ModCrop chickenCrop = new ModCrops.ChickenCrop("chicken_crop");
    public static ModCrop coalCrop = new ModCrops.CoalCrop("coal_crop");
    public static ModCrop cobaltCrop = new ModCrops.CobaltCrop("cobalt_crop");
    public static ModCrop copperCrop = new ModCrops.CopperCrop("copper_crop");
    public static ModCrop cowCrop = new ModCrops.CowCrop("cow_crop");
    public static ModCrop creeperCrop = new ModCrops.CreeperCrop("creeper_crop");
    public static ModCrop diamondCrop = new ModCrops.DiamondCrop("diamond_crop");
    public static ModCrop dragonCrop = new ModCrops.DragonCrop("dragon_crop");
    public static ModCrop earthCrop = new ModCrops.EarthCrop("earth_crop");
    public static ModCrop electrumCrop = new ModCrops.ElectrumCrop("electrum_crop");
    public static ModCrop emeraldCrop = new ModCrops.EmeraldCrop("emerald_crop");
    public static ModCrop endermanCrop = new ModCrops.EndermanCrop("enderman_crop");
    public static ModCrop experienceCrop = new ModCrops.ExperienceCrop("experience_crop");
    public static ModCrop fireCrop = new ModCrops.FireCrop("fire_crop");
    public static ModCrop fishCrop = new ModCrops.FishCrop("fish_crop");
    public static ModCrop ghastCrop = new ModCrops.GhastCrop("ghast_crop");
    public static ModCrop glowstoneCrop = new ModCrops.GlowstoneCrop("glowstone_crop");
    public static ModCrop goldCrop = new ModCrops.GoldCrop("gold_crop");
    public static ModCrop guardianCrop = new ModCrops.GuardianCrop("guardian_crop");
    public static ModCrop invarCrop = new ModCrops.InvarCrop("invar_crop");
    public static ModCrop iridiumCrop = new ModCrops.IridiumCrop("iridium_crop");
    public static ModCrop ironCrop = new ModCrops.IronCrop("iron_crop");
    public static ModCrop lapisCrop = new ModCrops.LapisCrop("lapis_crop");
    public static ModCrop leadCrop = new ModCrops.LeadCrop("lead_crop");
    public static ModCrop malachiteCrop = new ModCrops.MalachiteCrop("malachite_crop");
    public static ModCrop manyullynCrop = new ModCrops.ManyullynCrop("manyullyn_crop");
    public static ModCrop natureCrop = new ModCrops.NatureCrop("nature_crop");
    public static ModCrop netherCrop = new ModCrops.NetherCrop("nether_crop");
    public static ModCrop nickelCrop = new ModCrops.NickelCrop("nickel_crop");
    public static ModCrop peridotCrop = new ModCrops.PeridotCrop("peridot_crop");
    public static ModCrop pigCrop = new ModCrops.PigCrop("pig_crop");
    public static ModCrop platinumCrop = new ModCrops.PlatinumCrop("platinum_crop");
    public static ModCrop quartzCrop = new ModCrops.QuartzCrop("quartz_crop");
    public static ModCrop rabbitCrop = new ModCrops.RabbitCrop("rabbit_crop");
    public static ModCrop redstoneCrop = new ModCrops.RedstoneCrop("redstone_crop");
    public static ModCrop rubberCrop = new ModCrops.RubberCrop("rubber_crop");
    public static ModCrop rubyCrop = new ModCrops.RubyCrop("ruby_crop");
    public static ModCrop sapphireCrop = new ModCrops.SapphireCrop("sapphire_crop");
    public static ModCrop sheepCrop = new ModCrops.SheepCrop("sheep_crop");
    public static ModCrop shulkerCrop = new ModCrops.ShulkerCrop("shulker_crop");
    public static ModCrop silverCrop = new ModCrops.SilverCrop("silver_crop");
    public static ModCrop skeletonCrop = new ModCrops.SkeletonCrop("skeleton_crop");
    public static ModCrop slimeCrop = new ModCrops.SlimeCrop("slime_crop");
    public static ModCrop snowmanCrop = new ModCrops.SnowmanCrop("snowman_crop");
    public static ModCrop spiderCrop = new ModCrops.SpiderCrop("spider_crop");
    public static ModCrop squidCrop = new ModCrops.SquidCrop("squid_crop");
    public static ModCrop steelCrop = new ModCrops.SteelCrop("steel_crop");
    public static ModCrop tanzaniteCrop = new ModCrops.TanzaniteCrop("tanzanite_crop");
    public static ModCrop tinCrop = new ModCrops.TinCrop("tin_crop");
    public static ModCrop titaniumCrop = new ModCrops.TitaniumCrop("titanium_crop");
    public static ModCrop topazCrop = new ModCrops.TopazCrop("topaz_crop");
    public static ModCrop tungstenCrop = new ModCrops.TungstenCrop("tungsten_crop");
    public static ModCrop waterCrop = new ModCrops.WaterCrop("water_crop");
    public static ModCrop witherCrop = new ModCrops.WitherCrop("wither_crop");
    public static ModCrop witherskelCrop = new ModCrops.WitherskelCrop("witherskel_crop");
    public static ModCrop zincCrop = new ModCrops.ZincCrop("zinc_crop");
    public static ModCrop zombieCrop = new ModCrops.ZombieCrop("zombie_crop");

    @SubscribeEvent
    public static void init(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                alubrassCrop,
                aluminumCrop,
                amberCrop,
                apatiteCrop,
                arditeCrop,
                basalzCrop,
                blazeCrop,
                blitzCrop,
                blizzCrop,
                brassCrop,
                bronzeCrop,
                chickenCrop,
                coalCrop,
                cobaltCrop,
                copperCrop,
                cowCrop,
                creeperCrop,
                diamondCrop,
                dragonCrop,
                earthCrop,
                electrumCrop,
                emeraldCrop,
                endermanCrop,
                experienceCrop,
                fireCrop,
                fishCrop,
                ghastCrop,
                glowstoneCrop,
                goldCrop,
                guardianCrop,
                invarCrop,
                iridiumCrop,
                ironCrop,
                lapisCrop,
                leadCrop,
                malachiteCrop,
                manyullynCrop,
                natureCrop,
                netherCrop,
                nickelCrop,
                peridotCrop,
                pigCrop,
                platinumCrop,
                quartzCrop,
                rabbitCrop,
                redstoneCrop,
                rubberCrop,
                rubyCrop,
                sapphireCrop,
                sheepCrop,
                shulkerCrop,
                silverCrop,
                skeletonCrop,
                slimeCrop,
                snowmanCrop,
                spiderCrop,
                squidCrop,
                steelCrop,
                tanzaniteCrop,
                tinCrop,
                titaniumCrop,
                topazCrop,
                tungstenCrop,
                waterCrop,
                witherCrop,
                witherskelCrop,
                zincCrop,
                zombieCrop
        );
    }
}
