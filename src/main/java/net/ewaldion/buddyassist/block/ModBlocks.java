package net.ewaldion.buddyassist.block;

import net.ewaldion.buddyassist.BuddyAssist;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ewaldion.buddyassist.block.custom.DogRemainsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block MONSTER_BLOCK = registerBlock("monster_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).sounds(BlockSoundGroup.BONE), UniformIntProvider.create(2,9)));

    public static final Block DOG_REMAINS = registerBlock("dog_remains",
            new DogRemainsBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BuddyAssist.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BuddyAssist.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BuddyAssist.LOGGER.info("Registering ModBlocks for " + BuddyAssist.MOD_ID);
    }
}
