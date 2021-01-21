package net.kunmc.lab.rendermod.events;

import net.kunmc.lab.rendermod.RenderMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderEvent {

    private static final ResourceLocation SHADER_LOCATION = new ResourceLocation(RenderMod.MOD_ID, "shaders/post/color_convolve.json");


    @SubscribeEvent
    public void onRenderPre(RenderGameOverlayEvent.Pre event) {
        ShaderGroup group = Minecraft.getMinecraft().entityRenderer.getShaderGroup();

        if (group == null || !group.getShaderGroupName().equals(SHADER_LOCATION.toString())) {
            Minecraft.getMinecraft().entityRenderer.loadShader(SHADER_LOCATION);
        }
    }

    @SubscribeEvent
    public void onRenderPost(RenderGameOverlayEvent.Post event) {

    }

}
