package net.ewaldion.buddyassist.datagen;

import net.ewaldion.buddyassist.block.ModBlocks;
import net.ewaldion.buddyassist.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DOG_REMAINS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONSTER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.REMAINS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEEKER, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

    }
}
