
package net.mindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TabIconItem extends Item {
	public TabIconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
