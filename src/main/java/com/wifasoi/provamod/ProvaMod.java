package com.wifasoi.provamod;

import com.wifasoi.provamod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class ProvaMod {

    @EventHandler
    public void preInit(FMLInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event) {

    }

}