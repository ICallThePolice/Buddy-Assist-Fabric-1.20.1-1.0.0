package net.ewaldion.buddyassist.item;

import net.ewaldion.buddyassist.BuddyAssist;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BuddyAssist.MOD_ID, name), item);
    }
        public static void registerModItems() {
            BuddyAssist.LOGGER.info("Registering Mod Items for " + BuddyAssist.MOD_ID);
        }
}
