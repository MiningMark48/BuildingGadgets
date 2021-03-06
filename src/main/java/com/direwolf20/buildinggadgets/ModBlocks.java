package com.direwolf20.buildinggadgets;

import com.direwolf20.buildinggadgets.blocks.ConstructionBlock;
import com.direwolf20.buildinggadgets.blocks.ConstructionBlockPowder;
import com.direwolf20.buildinggadgets.blocks.EffectBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("buildinggadgets:effectblock")
    public static EffectBlock effectBlock;
    @GameRegistry.ObjectHolder("buildinggadgets:constructionblock")
    public static ConstructionBlock constructionBlock;
    @GameRegistry.ObjectHolder("buildinggadgets:constructionblockpowder")
    public static ConstructionBlockPowder constructionBlockPowder;

    @SideOnly(Side.CLIENT)
    public static void initColorHandlers() {
        BlockColors blockColors = Minecraft.getMinecraft().getBlockColors();
        if (Config.enablePaste) {constructionBlock.initColorHandler(blockColors);}
    }
}