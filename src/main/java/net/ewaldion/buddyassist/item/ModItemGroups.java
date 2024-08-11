package net.ewaldion.buddyassist.item;

import net.ewaldion.buddyassist.BuddyAssist;
import net.ewaldion.buddyassist.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BUDDY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BuddyAssist.MOD_ID, "buddy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.buddy"))
                    .icon(() -> new ItemStack(ModItems.SEEKER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SEEKER);
                        entries.add(ModItems.SAWER);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.MONSTER_BLOCK);
                        entries.add(ModBlocks.DOG_REMAINS);

                        entries.add(ModItems.REMAINS);

                    }).build());

    public static void registerItemGroups(){
        BuddyAssist.LOGGER.info("Registering Item Groups for " +BuddyAssist.MOD_ID);
    }
}
