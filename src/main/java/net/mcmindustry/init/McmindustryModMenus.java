
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcmindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcmindustry.world.inventory.DrillcontainerMenu;
import net.mcmindustry.McmindustryMod;

public class McmindustryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, McmindustryMod.MODID);
	public static final RegistryObject<MenuType<DrillcontainerMenu>> DRILLCONTAINER = REGISTRY.register("drillcontainer", () -> IForgeMenuType.create(DrillcontainerMenu::new));
}
