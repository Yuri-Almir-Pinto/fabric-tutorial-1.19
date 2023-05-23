package net.yipeekiyaay.modtutorial;
// Alterar e refatorar todos os packages com shift + f6

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTutorial implements ModInitializer {
	// Alterar o nome do arquivo e da classe ao mesmo tempo com shift + f6
	public static final String MOD_ID = "modTutorial";
	// String com id do mod.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// Registrar o id do mod?

	@Override
	public void onInitialize() {
	}
}
