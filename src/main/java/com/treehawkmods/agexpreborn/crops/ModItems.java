package com.treehawkmods.agexpreborn.crops;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModItems {
    //crop items
    public static ModItem alubrassEssence = new ModItem("alubrass_essence");
    public static ModItem aluminumEssence = new ModItem("aluminum_essence");
    public static ModItem amberEssence = new ModItem("amber_essence");
    public static ModItem apatiteEssence = new ModItem("apatite_essence");
    public static ModItem arditeEssence = new ModItem("ardite_essence");
    public static ModItem basalzEssence = new ModItem("basalz_essence");
    public static ModItem blazeEssence = new ModItem("blaze_essence");
    public static ModItem blitzEssence = new ModItem("blitz_essence");
    public static ModItem blizzEssence = new ModItem("blizz_essence");
    public static ModItem brassEssence = new ModItem("brass_essence");
    public static ModItem bronzeEssence = new ModItem("bronze_essence");
    public static ModItem chickenEssence = new ModItem("chicken_essence");
    public static ModItem coalEssence = new ModItem("coal_essence");
    public static ModItem cobaltEssence = new ModItem("cobalt_essence");
    public static ModItem constantanEssence = new ModItem("constantan_essence");
    public static ModItem copperEssence = new ModItem("copper_essence");
    public static ModItem cowEssence = new ModItem("cow_essence");
    public static ModItem creeperEssence = new ModItem("creeper_essence");
    public static ModItem diamondEssence = new ModItem("diamond_essence");
    public static ModItem dragonEssence = new ModItem("dragon_essence");
    public static ModItem earthEssence = new ModItem("earth_essence");
    public static ModItem electrumEssence = new ModItem("electrum_essence");
    public static ModItem emeraldEssence = new ModItem("emerald_essence");
    public static ModItem endermanEssence = new ModItem("enderman_essence");
    public static ModItem enderiumEssence = new ModItem("enderium_essence");
    public static ModItem experienceEssence = new ModItem("experience_essence");
    public static ModItem fireEssence = new ModItem("fire_essence");
    public static ModItem fishEssence = new ModItem("fish_essence");
    public static ModItem ghastEssence = new ModItem("ghast_essence");
    public static ModItem glowstoneEssence = new ModItem("glowstone_essence");
    public static ModItem goldEssence = new ModItem("gold_essence");
    public static ModItem guardianEssence = new ModItem("guardian_essence");
    public static ModItem invarEssence = new ModItem("invar_essence");
    public static ModItem iridiumEssence = new ModItem("iridium_essence");
    public static ModItem ironEssence = new ModItem("iron_essence");
    public static ModItem lapisEssence = new ModItem("lapis_essence");
    public static ModItem leadEssence = new ModItem("lead_essence");
    public static ModItem lumiumEssence = new ModItem("lumium_essence");
    public static ModItem malachiteEssence = new ModItem("malachite_essence");
    public static ModItem manyullynEssence = new ModItem("manyullyn_essence");
    public static ModItem natureEssence = new ModItem("nature_essence");
    public static ModItem netherEssence = new ModItem("nether_essence");
    public static ModItem nickelEssence = new ModItem("nickel_essence");
    public static ModItem oilEssence = new ModItem("oil_essence");
    public static ModItem peridotEssence = new ModItem("peridot_essence");
    public static ModItem pigEssence = new ModItem("pig_essence");
    public static ModItem platinumEssence = new ModItem("platinum_essence");
    public static ModItem quartzEssence = new ModItem("quartz_essence");
    public static ModItem rabbitEssence = new ModItem("rabbit_essence");
    public static ModItem redstoneEssence = new ModItem("redstone_essence");
    public static ModItem rubberEssence = new ModItem("rubber_essence");
    public static ModItem rubyEssence = new ModItem("ruby_essence");
    public static ModItem sapphireEssence = new ModItem("sapphire_essence");
    public static ModItem sheepEssence = new ModItem("sheep_essence");
    public static ModItem shulkerEssence = new ModItem("shulker_essence");
    public static ModItem signalumEssence = new ModItem("signalum_essence");
    public static ModItem silverEssence = new ModItem("silver_essence");
    public static ModItem skeletonEssence = new ModItem("skeleton_essence");
    public static ModItem slimeEssence = new ModItem("slime_essence");
    public static ModItem snowmanEssence = new ModItem("snowman_essence");
    public static ModItem spiderEssence = new ModItem("spider_essence");
    public static ModItem squidEssence = new ModItem("squid_essence");
    public static ModItem steelEssence = new ModItem("steel_essence");
    public static ModItem tanzaniteEssence = new ModItem("tanzanite_essence");
    public static ModItem tinEssence = new ModItem("tin_essence");
    public static ModItem titaniumEssence = new ModItem("titanium_essence");
    public static ModItem topazEssence = new ModItem("topaz_essence");
    public static ModItem tungstenEssence = new ModItem("tungsten_essence");
    public static ModItem waterEssence = new ModItem("water_essence");
    public static ModItem witherEssence = new ModItem("wither_essence");
    public static ModItem witherskelEssence = new ModItem("witherskel_essence");
    public static ModItem zincEssence = new ModItem("zinc_essence");
    public static ModItem zombieEssence = new ModItem("zombie_essence");

    //seed items
    public static ModSeed alubrassSprout = new ModSeed("alubrass_sprout", ModBlocks.alubrassCrop);
    public static ModSeed aluminumSprout = new ModSeed("aluminum_sprout", ModBlocks.aluminumCrop);
    public static ModSeed amberSprout = new ModSeed("amber_sprout", ModBlocks.amberCrop);
    public static ModSeed apatiteSprout = new ModSeed("apatite_sprout", ModBlocks.apatiteCrop);
    public static ModSeed arditeSprout = new ModSeed("ardite_sprout", ModBlocks.arditeCrop);
    public static ModSeed basalzSprout = new ModSeed("basalz_sprout", ModBlocks.basalzCrop);
    public static ModSeed blazeSprout = new ModSeed("blaze_sprout", ModBlocks.blazeCrop);
    public static ModSeed blitzSprout = new ModSeed("blitz_sprout", ModBlocks.blitzCrop);
    public static ModSeed blizzSprout = new ModSeed("blizz_sprout", ModBlocks.blizzCrop);
    public static ModSeed brassSprout = new ModSeed("brass_sprout", ModBlocks.brassCrop);
    public static ModSeed bronzeSprout = new ModSeed("bronze_sprout", ModBlocks.bronzeCrop);
    public static ModSeed chickenSprout = new ModSeed("chicken_sprout", ModBlocks.chickenCrop);
    public static ModSeed coalSprout = new ModSeed("coal_sprout", ModBlocks.coalCrop);
    public static ModSeed cobaltSprout = new ModSeed("cobalt_sprout", ModBlocks.cobaltCrop);
    public static ModSeed constantanSprout = new ModSeed("constantan_sprout", ModBlocks.constantanCrop);
    public static ModSeed copperSprout = new ModSeed("copper_sprout", ModBlocks.copperCrop);
    public static ModSeed cowSprout = new ModSeed("cow_sprout", ModBlocks.cowCrop);
    public static ModSeed creeperSprout = new ModSeed("creeper_sprout", ModBlocks.creeperCrop);
    public static ModSeed diamondSprout = new ModSeed("diamond_sprout", ModBlocks.diamondCrop);
    public static ModSeed dragonSprout = new ModSeed("dragon_sprout", ModBlocks.dragonCrop);
    public static ModSeed earthSprout = new ModSeed("earth_sprout", ModBlocks.earthCrop);
    public static ModSeed electrumSprout = new ModSeed("electrum_sprout", ModBlocks.electrumCrop);
    public static ModSeed emeraldSprout = new ModSeed("emerald_sprout", ModBlocks.emeraldCrop);
    public static ModSeed endermanSprout = new ModSeed("enderman_sprout", ModBlocks.endermanCrop);
    public static ModSeed enderiumSprout = new ModSeed("enderium_sprout", ModBlocks.enderiumCrop);
    public static ModSeed experienceSprout = new ModSeed("experience_sprout", ModBlocks.experienceCrop);
    public static ModSeed fireSprout = new ModSeed("fire_sprout", ModBlocks.fireCrop);
    public static ModSeed fishSprout = new ModSeed("fish_sprout", ModBlocks.fishCrop);
    public static ModSeed ghastSprout = new ModSeed("ghast_sprout", ModBlocks.ghastCrop);
    public static ModSeed glowstoneSprout = new ModSeed("glowstone_sprout", ModBlocks.glowstoneCrop);
    public static ModSeed goldSprout = new ModSeed("gold_sprout", ModBlocks.goldCrop);
    public static ModSeed guardianSprout = new ModSeed("guardian_sprout", ModBlocks.guardianCrop);
    public static ModSeed invarSprout = new ModSeed("invar_sprout", ModBlocks.invarCrop);
    public static ModSeed iridiumSprout = new ModSeed("iridium_sprout", ModBlocks.iridiumCrop);
    public static ModSeed ironSprout = new ModSeed("iron_sprout", ModBlocks.ironCrop);
    public static ModSeed lapisSprout = new ModSeed("lapis_sprout", ModBlocks.lapisCrop);
    public static ModSeed leadSprout = new ModSeed("lead_sprout", ModBlocks.leadCrop);
    public static ModSeed lumiumSprout = new ModSeed("lumium_sprout", ModBlocks.lumiumCrop);
    public static ModSeed malachiteSprout = new ModSeed("malachite_sprout", ModBlocks.malachiteCrop);
    public static ModSeed manyullynSprout = new ModSeed("manyullyn_sprout", ModBlocks.manyullynCrop);
    public static ModSeed natureSprout = new ModSeed("nature_sprout", ModBlocks.natureCrop);
    public static ModSeed netherSprout = new ModSeed("nether_sprout", ModBlocks.netherCrop);
    public static ModSeed nickelSprout = new ModSeed("nickel_sprout", ModBlocks.nickelCrop);
    public static ModSeed oilSprout = new ModSeed("oil_sprout", ModBlocks.oilCrop);
    public static ModSeed peridotSprout = new ModSeed("peridot_sprout", ModBlocks.peridotCrop);
    public static ModSeed pigSprout = new ModSeed("pig_sprout", ModBlocks.pigCrop);
    public static ModSeed platinumSprout = new ModSeed("platinum_sprout", ModBlocks.platinumCrop);
    public static ModSeed quartzSprout = new ModSeed("quartz_sprout", ModBlocks.quartzCrop);
    public static ModSeed rabbitSprout = new ModSeed("rabbit_sprout", ModBlocks.rabbitCrop);
    public static ModSeed redstoneSprout = new ModSeed("redstone_sprout", ModBlocks.redstoneCrop);
    public static ModSeed rubberSprout = new ModSeed("rubber_sprout", ModBlocks.rubberCrop);
    public static ModSeed rubySprout = new ModSeed("ruby_sprout", ModBlocks.rubyCrop);
    public static ModSeed sapphireSprout = new ModSeed("sapphire_sprout", ModBlocks.sapphireCrop);
    public static ModSeed sheepSprout = new ModSeed("sheep_sprout", ModBlocks.sheepCrop);
    public static ModSeed shulkerSprout = new ModSeed("shulker_sprout", ModBlocks.shulkerCrop);
    public static ModSeed signalumSprout = new ModSeed("signalum_sprout", ModBlocks.signalumCrop);
    public static ModSeed silverSprout = new ModSeed("silver_sprout", ModBlocks.silverCrop);
    public static ModSeed skeletonSprout = new ModSeed("skeleton_sprout", ModBlocks.skeletonCrop);
    public static ModSeed slimeSprout = new ModSeed("slime_sprout", ModBlocks.slimeCrop);
    public static ModSeed snowmanSprout = new ModSeed("snowman_sprout", ModBlocks.snowmanCrop);
    public static ModSeed spiderSprout = new ModSeed("spider_sprout", ModBlocks.spiderCrop);
    public static ModSeed squidSprout = new ModSeed("squid_sprout", ModBlocks.squidCrop);
    public static ModSeed steelSprout = new ModSeed("steel_sprout", ModBlocks.steelCrop);
    public static ModSeed tanzaniteSprout = new ModSeed("tanzanite_sprout", ModBlocks.tanzaniteCrop);
    public static ModSeed tinSprout = new ModSeed("tin_sprout", ModBlocks.tinCrop);
    public static ModSeed titaniumSprout = new ModSeed("titanium_sprout", ModBlocks.titaniumCrop);
    public static ModSeed topazSprout = new ModSeed("topaz_sprout", ModBlocks.topazCrop);
    public static ModSeed tungstenSprout = new ModSeed("tungsten_sprout", ModBlocks.tungstenCrop);
    public static ModSeed waterSprout = new ModSeed("water_sprout", ModBlocks.waterCrop);
    public static ModSeed witherSprout = new ModSeed("wither_sprout", ModBlocks.witherCrop);
    public static ModSeed witherskelSprout = new ModSeed("witherskel_sprout", ModBlocks.witherskelCrop);
    public static ModSeed zincSprout = new ModSeed("zinc_sprout", ModBlocks.zincCrop);
    public static ModSeed zombieSprout = new ModSeed("zombie_sprout", ModBlocks.zombieCrop);

    //chunk items
    /*
    public static ModItem basalzChunk = new ModItem("basalz_chunk");
    public static ModItem blazeChunk = new ModItem("blaze_chunk");
    public static ModItem blitzChunk = new ModItem("blitz_chunk");
    public static ModItem blizzChunk = new ModItem("blizz_chunk");
    public static ModItem chickenChunk = new ModItem("chicken_chunk");
    public static ModItem cowChunk = new ModItem("cow_chunk");
    public static ModItem creeperChunk = new ModItem("creeper_chunk");
    public static ModItem dragonChunk = new ModItem("dragon_chunk");
    public static ModItem endermanChunk = new ModItem("enderman_chunk");
    public static ModItem ghastChunk = new ModItem("ghast_chunk");
    public static ModItem guardianChunk = new ModItem("guardian_chunk");
    public static ModItem pigChunk = new ModItem("pig_chunk");
    public static ModItem rabbitChunk = new ModItem("rabbit_chunk");
    public static ModItem sheepChunk = new ModItem("sheep_chunk");
    public static ModItem shulkerChunk = new ModItem("shulker_chunk");
    public static ModItem skeletonChunk = new ModItem("skeleton_chunk");
    public static ModItem slimeChunk = new ModItem("slime_chunk");
    public static ModItem snowmanChunk = new ModItem("snowman_chunk");
    public static ModItem spiderChunk = new ModItem("spider_chunk");
    public static ModItem squidChunk = new ModItem("squid_chunk");
    public static ModItem witherChunk = new ModItem("wither_chunk");
    public static ModItem witherskelChunk = new ModItem("witherskel_chunk");
    public static ModItem zombieChunk = new ModItem("zombie_chunk");
    */

    @SubscribeEvent
    public static void init(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                alubrassEssence,
                aluminumEssence,
                amberEssence,
                apatiteEssence,
                arditeEssence,
                basalzEssence,
                blazeEssence,
                blitzEssence,
                blizzEssence,
                brassEssence,
                bronzeEssence,
                chickenEssence,
                coalEssence,
                cobaltEssence,
                constantanEssence,
                copperEssence,
                cowEssence,
                creeperEssence,
                diamondEssence,
                dragonEssence,
                earthEssence,
                electrumEssence,
                emeraldEssence,
                endermanEssence,
                enderiumEssence,
                experienceEssence,
                fireEssence,
                fishEssence,
                ghastEssence,
                glowstoneEssence,
                goldEssence,
                guardianEssence,
                invarEssence,
                iridiumEssence,
                ironEssence,
                lapisEssence,
                leadEssence,
                lumiumEssence,
                malachiteEssence,
                manyullynEssence,
                natureEssence,
                netherEssence,
                nickelEssence,
                oilEssence,
                peridotEssence,
                pigEssence,
                platinumEssence,
                quartzEssence,
                rabbitEssence,
                redstoneEssence,
                rubberEssence,
                rubyEssence,
                sapphireEssence,
                sheepEssence,
                shulkerEssence,
                signalumEssence,
                silverEssence,
                skeletonEssence,
                slimeEssence,
                snowmanEssence,
                spiderEssence,
                squidEssence,
                steelEssence,
                tanzaniteEssence,
                tinEssence,
                titaniumEssence,
                topazEssence,
                tungstenEssence,
                waterEssence,
                witherEssence,
                witherskelEssence,
                zincEssence,
                zombieEssence,
                alubrassSprout,
                aluminumSprout,
                amberSprout,
                apatiteSprout,
                arditeSprout,
                basalzSprout,
                blazeSprout,
                blitzSprout,
                blizzSprout,
                brassSprout,
                bronzeSprout,
                chickenSprout,
                coalSprout,
                cobaltSprout,
                constantanSprout,
                copperSprout,
                cowSprout,
                creeperSprout,
                diamondSprout,
                dragonSprout,
                earthSprout,
                electrumSprout,
                emeraldSprout,
                endermanSprout,
                enderiumSprout,
                experienceSprout,
                fireSprout,
                fishSprout,
                ghastSprout,
                glowstoneSprout,
                goldSprout,
                guardianSprout,
                invarSprout,
                iridiumSprout,
                ironSprout,
                lapisSprout,
                leadSprout,
                lumiumSprout,
                malachiteSprout,
                manyullynSprout,
                natureSprout,
                netherSprout,
                nickelSprout,
                oilSprout,
                peridotSprout,
                pigSprout,
                platinumSprout,
                quartzSprout,
                rabbitSprout,
                redstoneSprout,
                rubberSprout,
                rubySprout,
                sapphireSprout,
                sheepSprout,
                shulkerSprout,
                signalumSprout,
                silverSprout,
                skeletonSprout,
                slimeSprout,
                snowmanSprout,
                spiderSprout,
                squidSprout,
                steelSprout,
                tanzaniteSprout,
                tinSprout,
                titaniumSprout,
                topazSprout,
                tungstenSprout,
                waterSprout,
                witherSprout,
                witherskelSprout,
                zincSprout,
                zombieSprout/*,
                basalzChunk,
                blazeChunk,
                blitzChunk,
                blizzChunk,
                chickenChunk,
                cowChunk,
                creeperChunk,
                dragonChunk,
                endermanChunk,
                ghastChunk,
                guardianChunk,
                pigChunk,
                rabbitChunk,
                sheepChunk,
                shulkerChunk,
                skeletonChunk,
                slimeChunk,
                snowmanChunk,
                spiderChunk,
                squidChunk,
                witherChunk,
                witherskelChunk,
                zombieChunk*/
        );
    }

    public static void initModels(){
        //crops
        ModelLoader.setCustomModelResourceLocation(alubrassEssence,  0, new ModelResourceLocation(alubrassEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(aluminumEssence,  0, new ModelResourceLocation(aluminumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(amberEssence,  0, new ModelResourceLocation(amberEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(apatiteEssence,  0, new ModelResourceLocation(apatiteEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(arditeEssence,  0, new ModelResourceLocation(arditeEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(basalzEssence,  0, new ModelResourceLocation(basalzEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blazeEssence,  0, new ModelResourceLocation(blazeEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blitzEssence,  0, new ModelResourceLocation(blitzEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blizzEssence,  0, new ModelResourceLocation(blizzEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(brassEssence,  0, new ModelResourceLocation(brassEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(bronzeEssence,  0, new ModelResourceLocation(bronzeEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(chickenEssence,  0, new ModelResourceLocation(chickenEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(coalEssence,  0, new ModelResourceLocation(coalEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(cobaltEssence,  0, new ModelResourceLocation(cobaltEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(constantanEssence,  0, new ModelResourceLocation(constantanEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(copperEssence,  0, new ModelResourceLocation(copperEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(cowEssence,  0, new ModelResourceLocation(cowEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(creeperEssence,  0, new ModelResourceLocation(creeperEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(diamondEssence,  0, new ModelResourceLocation(diamondEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(dragonEssence,  0, new ModelResourceLocation(dragonEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(earthEssence,  0, new ModelResourceLocation(earthEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(electrumEssence,  0, new ModelResourceLocation(electrumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(emeraldEssence,  0, new ModelResourceLocation(emeraldEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(endermanEssence,  0, new ModelResourceLocation(endermanEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(enderiumEssence,  0, new ModelResourceLocation(enderiumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(experienceEssence,  0, new ModelResourceLocation(experienceEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(fireEssence,  0, new ModelResourceLocation(fireEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(fishEssence,  0, new ModelResourceLocation(fishEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ghastEssence,  0, new ModelResourceLocation(ghastEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(glowstoneEssence,  0, new ModelResourceLocation(glowstoneEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(goldEssence,  0, new ModelResourceLocation(goldEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(guardianEssence,  0, new ModelResourceLocation(guardianEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(invarEssence,  0, new ModelResourceLocation(invarEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(iridiumEssence,  0, new ModelResourceLocation(iridiumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ironEssence,  0, new ModelResourceLocation(ironEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(lapisEssence,  0, new ModelResourceLocation(lapisEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(leadEssence,  0, new ModelResourceLocation(leadEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(lumiumEssence,  0, new ModelResourceLocation(lumiumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(malachiteEssence,  0, new ModelResourceLocation(malachiteEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(manyullynEssence,  0, new ModelResourceLocation(manyullynEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(natureEssence,  0, new ModelResourceLocation(natureEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(netherEssence,  0, new ModelResourceLocation(netherEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(nickelEssence,  0, new ModelResourceLocation(nickelEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(oilEssence,  0, new ModelResourceLocation(oilEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(peridotEssence,  0, new ModelResourceLocation(peridotEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pigEssence,  0, new ModelResourceLocation(pigEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(platinumEssence,  0, new ModelResourceLocation(platinumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(quartzEssence,  0, new ModelResourceLocation(quartzEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rabbitEssence,  0, new ModelResourceLocation(rabbitEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(redstoneEssence,  0, new ModelResourceLocation(redstoneEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rubberEssence,  0, new ModelResourceLocation(rubberEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rubyEssence,  0, new ModelResourceLocation(rubyEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(sapphireEssence,  0, new ModelResourceLocation(sapphireEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(sheepEssence,  0, new ModelResourceLocation(sheepEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(shulkerEssence,  0, new ModelResourceLocation(shulkerEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(signalumEssence,  0, new ModelResourceLocation(signalumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(silverEssence,  0, new ModelResourceLocation(silverEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(skeletonEssence,  0, new ModelResourceLocation(skeletonEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(slimeEssence,  0, new ModelResourceLocation(slimeEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(snowmanEssence,  0, new ModelResourceLocation(snowmanEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(spiderEssence,  0, new ModelResourceLocation(spiderEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(squidEssence,  0, new ModelResourceLocation(squidEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(steelEssence,  0, new ModelResourceLocation(steelEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(tanzaniteEssence,  0, new ModelResourceLocation(tanzaniteEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(tinEssence,  0, new ModelResourceLocation(tinEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(titaniumEssence,  0, new ModelResourceLocation(titaniumEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(topazEssence,  0, new ModelResourceLocation(topazEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(tungstenEssence,  0, new ModelResourceLocation(tungstenEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(waterEssence,  0, new ModelResourceLocation(waterEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(witherEssence,  0, new ModelResourceLocation(witherEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(witherskelEssence,  0, new ModelResourceLocation(witherskelEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(zincEssence,  0, new ModelResourceLocation(zincEssence.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(zombieEssence,  0, new ModelResourceLocation(zombieEssence.getRegistryName(), "inventory"));

        //seeds
        ModelLoader.setCustomModelResourceLocation(alubrassSprout,  0, new ModelResourceLocation(alubrassSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(aluminumSprout,  0, new ModelResourceLocation(aluminumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(amberSprout,  0, new ModelResourceLocation(amberSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(apatiteSprout,  0, new ModelResourceLocation(apatiteSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(arditeSprout,  0, new ModelResourceLocation(arditeSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(basalzSprout,  0, new ModelResourceLocation(basalzSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blazeSprout,  0, new ModelResourceLocation(blazeSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blitzSprout,  0, new ModelResourceLocation(blitzSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blizzSprout,  0, new ModelResourceLocation(blizzSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(brassSprout,  0, new ModelResourceLocation(brassSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(bronzeSprout,  0, new ModelResourceLocation(bronzeSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(chickenSprout,  0, new ModelResourceLocation(chickenSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(coalSprout,  0, new ModelResourceLocation(coalSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(cobaltSprout,  0, new ModelResourceLocation(cobaltSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(constantanSprout,  0, new ModelResourceLocation(constantanSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(copperSprout,  0, new ModelResourceLocation(copperSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(cowSprout,  0, new ModelResourceLocation(cowSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(creeperSprout,  0, new ModelResourceLocation(creeperSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(diamondSprout,  0, new ModelResourceLocation(diamondSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(dragonSprout,  0, new ModelResourceLocation(dragonSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(earthSprout,  0, new ModelResourceLocation(earthSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(electrumSprout,  0, new ModelResourceLocation(electrumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(emeraldSprout,  0, new ModelResourceLocation(emeraldSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(endermanSprout,  0, new ModelResourceLocation(endermanSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(enderiumSprout,  0, new ModelResourceLocation(enderiumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(experienceSprout,  0, new ModelResourceLocation(experienceSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(fireSprout,  0, new ModelResourceLocation(fireSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(fishSprout,  0, new ModelResourceLocation(fishSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ghastSprout,  0, new ModelResourceLocation(ghastSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(glowstoneSprout,  0, new ModelResourceLocation(glowstoneSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(goldSprout,  0, new ModelResourceLocation(goldSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(guardianSprout,  0, new ModelResourceLocation(guardianSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(invarSprout,  0, new ModelResourceLocation(invarSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(iridiumSprout,  0, new ModelResourceLocation(iridiumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ironSprout,  0, new ModelResourceLocation(ironSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(lapisSprout,  0, new ModelResourceLocation(lapisSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(leadSprout,  0, new ModelResourceLocation(leadSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(lumiumSprout,  0, new ModelResourceLocation(lumiumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(malachiteSprout,  0, new ModelResourceLocation(malachiteSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(manyullynSprout,  0, new ModelResourceLocation(manyullynSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(natureSprout,  0, new ModelResourceLocation(natureSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(netherSprout,  0, new ModelResourceLocation(netherSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(nickelSprout,  0, new ModelResourceLocation(nickelSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(oilSprout,  0, new ModelResourceLocation(oilSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(peridotSprout,  0, new ModelResourceLocation(peridotSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pigSprout,  0, new ModelResourceLocation(pigSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(platinumSprout,  0, new ModelResourceLocation(platinumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(quartzSprout,  0, new ModelResourceLocation(quartzSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rabbitSprout,  0, new ModelResourceLocation(rabbitSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(redstoneSprout,  0, new ModelResourceLocation(redstoneSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rubberSprout,  0, new ModelResourceLocation(rubberSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rubySprout,  0, new ModelResourceLocation(rubySprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(sapphireSprout,  0, new ModelResourceLocation(sapphireSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(sheepSprout,  0, new ModelResourceLocation(sheepSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(shulkerSprout,  0, new ModelResourceLocation(shulkerSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(signalumSprout,  0, new ModelResourceLocation(signalumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(silverSprout,  0, new ModelResourceLocation(silverSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(skeletonSprout,  0, new ModelResourceLocation(skeletonSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(slimeSprout,  0, new ModelResourceLocation(slimeSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(snowmanSprout,  0, new ModelResourceLocation(snowmanSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(spiderSprout,  0, new ModelResourceLocation(spiderSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(squidSprout,  0, new ModelResourceLocation(squidSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(steelSprout,  0, new ModelResourceLocation(steelSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(tanzaniteSprout,  0, new ModelResourceLocation(tanzaniteSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(tinSprout,  0, new ModelResourceLocation(tinSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(titaniumSprout,  0, new ModelResourceLocation(titaniumSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(topazSprout,  0, new ModelResourceLocation(topazSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(tungstenSprout,  0, new ModelResourceLocation(tungstenSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(waterSprout,  0, new ModelResourceLocation(waterSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(witherSprout,  0, new ModelResourceLocation(witherSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(witherskelSprout,  0, new ModelResourceLocation(witherskelSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(zincSprout,  0, new ModelResourceLocation(zincSprout.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(zombieSprout,  0, new ModelResourceLocation(zombieSprout.getRegistryName(), "inventory"));

        //chunks
        /*
        ModelLoader.setCustomModelResourceLocation(basalzChunk,  0, new ModelResourceLocation(basalzChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blazeChunk,  0, new ModelResourceLocation(blazeChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blitzChunk,  0, new ModelResourceLocation(blitzChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(blizzChunk,  0, new ModelResourceLocation(blizzChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(chickenChunk,  0, new ModelResourceLocation(chickenChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(cowChunk,  0, new ModelResourceLocation(cowChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(creeperChunk,  0, new ModelResourceLocation(creeperChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(dragonChunk,  0, new ModelResourceLocation(dragonChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(endermanChunk,  0, new ModelResourceLocation(endermanChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ghastChunk,  0, new ModelResourceLocation(ghastChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(guardianChunk,  0, new ModelResourceLocation(guardianChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pigChunk,  0, new ModelResourceLocation(pigChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(rabbitChunk,  0, new ModelResourceLocation(rabbitChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(sheepChunk,  0, new ModelResourceLocation(sheepChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(shulkerChunk,  0, new ModelResourceLocation(shulkerChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(skeletonChunk,  0, new ModelResourceLocation(skeletonChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(slimeChunk,  0, new ModelResourceLocation(slimeChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(snowmanChunk,  0, new ModelResourceLocation(snowmanChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(spiderChunk,  0, new ModelResourceLocation(spiderChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(squidChunk,  0, new ModelResourceLocation(squidChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(witherChunk,  0, new ModelResourceLocation(witherChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(witherskelChunk,  0, new ModelResourceLocation(witherskelChunk.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(zombieChunk,  0, new ModelResourceLocation(zombieChunk.getRegistryName(), "inventory"));
        */
    }
}
