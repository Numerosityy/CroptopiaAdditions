
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.croptopiaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.croptopiaadditions.item.WeinerItem;
import net.mcreator.croptopiaadditions.item.SugarCookieItem;
import net.mcreator.croptopiaadditions.item.SauerkrautItem;
import net.mcreator.croptopiaadditions.item.RiceNoodleItem;
import net.mcreator.croptopiaadditions.item.RiceFlourItem;
import net.mcreator.croptopiaadditions.item.RamenItem;
import net.mcreator.croptopiaadditions.item.PadThaiItem;
import net.mcreator.croptopiaadditions.item.OrangeSodaItem;
import net.mcreator.croptopiaadditions.item.LemonLimeSodaItem;
import net.mcreator.croptopiaadditions.item.KrautDogItem;
import net.mcreator.croptopiaadditions.item.HotDogItem;
import net.mcreator.croptopiaadditions.item.GrapeSodaItem;
import net.mcreator.croptopiaadditions.item.FrostingItem;
import net.mcreator.croptopiaadditions.item.CurryPowderItem;
import net.mcreator.croptopiaadditions.item.CottonCandyItem;
import net.mcreator.croptopiaadditions.item.ColaItem;
import net.mcreator.croptopiaadditions.item.ChickenCurryItem;
import net.mcreator.croptopiaadditions.item.CherrySodaItem;
import net.mcreator.croptopiaadditions.item.CarbonationMachineItem;
import net.mcreator.croptopiaadditions.item.BratwurstItem;
import net.mcreator.croptopiaadditions.item.BeansOnToastItem;
import net.mcreator.croptopiaadditions.CroptopiaAdditionsMod;

public class CroptopiaAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CroptopiaAdditionsMod.MODID);
	public static final RegistryObject<Item> BRATWURST = REGISTRY.register("bratwurst", () -> new BratwurstItem());
	public static final RegistryObject<Item> KRAUT_DOG = REGISTRY.register("kraut_dog", () -> new KrautDogItem());
	public static final RegistryObject<Item> SAUERKRAUT = REGISTRY.register("sauerkraut", () -> new SauerkrautItem());
	public static final RegistryObject<Item> CHICKEN_CURRY = REGISTRY.register("chicken_curry", () -> new ChickenCurryItem());
	public static final RegistryObject<Item> CURRY_POWDER = REGISTRY.register("curry_powder", () -> new CurryPowderItem());
	public static final RegistryObject<Item> RICE_FLOUR = REGISTRY.register("rice_flour", () -> new RiceFlourItem());
	public static final RegistryObject<Item> RICE_NOODLE = REGISTRY.register("rice_noodle", () -> new RiceNoodleItem());
	public static final RegistryObject<Item> WEINER = REGISTRY.register("weiner", () -> new WeinerItem());
	public static final RegistryObject<Item> PAD_THAI = REGISTRY.register("pad_thai", () -> new PadThaiItem());
	public static final RegistryObject<Item> HOT_DOG = REGISTRY.register("hot_dog", () -> new HotDogItem());
	public static final RegistryObject<Item> RAMEN = REGISTRY.register("ramen", () -> new RamenItem());
	public static final RegistryObject<Item> COTTON_CANDY = REGISTRY.register("cotton_candy", () -> new CottonCandyItem());
	public static final RegistryObject<Item> CARBONATION_MACHINE = REGISTRY.register("carbonation_machine", () -> new CarbonationMachineItem());
	public static final RegistryObject<Item> CHERRY_SODA = REGISTRY.register("cherry_soda", () -> new CherrySodaItem());
	public static final RegistryObject<Item> COLA = REGISTRY.register("cola", () -> new ColaItem());
	public static final RegistryObject<Item> GRAPE_SODA = REGISTRY.register("grape_soda", () -> new GrapeSodaItem());
	public static final RegistryObject<Item> LEMON_LIME_SODA = REGISTRY.register("lemon_lime_soda", () -> new LemonLimeSodaItem());
	public static final RegistryObject<Item> ORANGE_SODA = REGISTRY.register("orange_soda", () -> new OrangeSodaItem());
	public static final RegistryObject<Item> FROSTING = REGISTRY.register("frosting", () -> new FrostingItem());
	public static final RegistryObject<Item> SUGAR_COOKIE = REGISTRY.register("sugar_cookie", () -> new SugarCookieItem());
	public static final RegistryObject<Item> BEANS_ON_TOAST = REGISTRY.register("beans_on_toast", () -> new BeansOnToastItem());
}
