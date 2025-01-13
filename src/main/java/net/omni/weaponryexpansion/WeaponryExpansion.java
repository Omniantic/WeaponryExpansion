package net.omni.weaponryexpansion;

import net.fabricmc.api.ModInitializer;

import net.omni.weaponryexpansion.item.ModItemGroups;
import net.omni.weaponryexpansion.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponryExpansion implements ModInitializer {
	public static final String MOD_ID = "weaponry-expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}