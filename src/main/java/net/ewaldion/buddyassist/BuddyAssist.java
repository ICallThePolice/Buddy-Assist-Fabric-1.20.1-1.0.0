package net.ewaldion.buddyassist;

import net.ewaldion.buddyassist.item.ModItemGroups;
import net.ewaldion.buddyassist.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuddyAssist implements ModInitializer {
	public static final String MOD_ID = "buddyassist";
    public static final Logger LOGGER = LoggerFactory.getLogger("buddy-assist");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}