package net.mcmindustry.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcmindustry.network.McmindustryModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DrilltickProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		McmindustryModVariables.MapVariables.get(world).drilltickcount = McmindustryModVariables.MapVariables.get(world).drilltickcount + 1;
		McmindustryModVariables.MapVariables.get(world).syncData(world);
		if (McmindustryModVariables.MapVariables.get(world).drilltickcount % 1200 == 0) {
			McmindustryModVariables.MapVariables.get(world).drilltickcount = 0;
			McmindustryModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
