package com.bausteinchen.trainutils.registries;

import com.bausteinchen.trainutils.CreateTrainUtils;
import com.bausteinchen.trainutils.blocks.ShuntingSignal;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CreateTrainUtils.MOD_ID);

    public static final DeferredBlock<Block> SHUNTING_SIGNAL = BLOCKS.register("shuntingsignal",
            () -> new Block(new Block.Properties()));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}

