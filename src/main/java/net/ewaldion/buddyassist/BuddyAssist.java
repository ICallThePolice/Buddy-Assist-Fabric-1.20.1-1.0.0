package net.ewaldion.buddyassist;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuddyAssist implements ModInitializer {
	public static final String MOD_ID = "buddyassist";
    public static final Logger LOGGER = LoggerFactory.getLogger("buddy-assist");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}