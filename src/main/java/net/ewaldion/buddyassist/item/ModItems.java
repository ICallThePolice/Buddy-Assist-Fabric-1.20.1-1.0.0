package net.ewaldion.buddyassist.item;

import net.ewaldion.buddyassist.BuddyAssist;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SEEKER = registerItem("seeker", new Item(new FabricItemSettings()));
    public static final Item SAWER = registerItem("sawer", new Item(new FabricItemSettings()));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(SEEKER);
        entries.add(SAWER);
    }

    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BuddyAssist.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BuddyAssist.LOGGER.info("Registering Mod Items for " + BuddyAssist.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemToIngredientItemGroup);
    }
}
