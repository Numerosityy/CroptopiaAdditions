
package net.mcreator.croptopiaadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class HotDogItem extends Item {
	public HotDogItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(13.3f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 30;
	}
}
