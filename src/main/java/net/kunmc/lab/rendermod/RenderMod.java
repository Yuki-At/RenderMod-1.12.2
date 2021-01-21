package net.kunmc.lab.rendermod;

import net.kunmc.lab.rendermod.events.RenderEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = RenderMod.MOD_ID, name = RenderMod.MOD_NAME, version = RenderMod.VERSION)
public class RenderMod {

    public static final String MOD_ID = "rendermod";
    public static final String MOD_NAME = "RenderMod";
    public static final String VERSION = "1.0";

    public RenderMod() {
        MinecraftForge.EVENT_BUS.register(new RenderEvent());
    }

}
