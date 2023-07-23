
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mindustry.world.inventory.DrillContainerCacheMenu;
import net.mindustry.MindustryMod;

public class MindustryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MindustryMod.MODID);
	public static final RegistryObject<MenuType<DrillContainerCacheMenu>> DRILL_CONTAINER_CACHE = REGISTRY.register("drill_container_cache", () -> IForgeMenuType.create(DrillContainerCacheMenu::new));
}
