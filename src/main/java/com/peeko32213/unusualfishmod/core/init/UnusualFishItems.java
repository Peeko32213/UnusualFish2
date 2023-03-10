package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.item.ItemModFishBucket;

import com.peeko32213.unusualfishmod.common.item.ItemModFoods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class UnusualFishItems {
	private UnusualFishItems() {
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			UnusualFishMod.MODID);

	//Foods

	public static final RegistryObject<Item> RAW_RIPPER = ITEMS.register("raw_ripper",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_RIPPER).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_AERO_MONO = ITEMS.register("raw_aero_mono",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_AERO_MONO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_AERO_MONO_STICK = ITEMS.register("raw_aero_mono_stick",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_AERO_MONO_STICK).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_BUMPFACE = ITEMS.register("raw_bumpface",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_BUMPFACE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_RHINO_TETRA = ITEMS.register("raw_rhino_tetra",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_TETRA_RHINO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_SAILOR_BARB = ITEMS.register("raw_sailor_barb",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_SAILOR_BARB).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_BARK_ANGEL = ITEMS.register("raw_bark_angel",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_BARK_ANGEL).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_SPINDLEFISH = ITEMS.register("raw_spindlefish",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_SPINDLEFISH).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_BLIZZARD_TUNA = ITEMS.register("raw_blizzard_tuna",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_BLIZZARD_TUNA).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_VEIL_TENTACLE = ITEMS.register("raw_veil_tentacle",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_VEIL_TENTACLE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_MOSSTHORN = ITEMS.register("raw_mossthorn",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_MOSSTHORN).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_SHOCKCAT = ITEMS.register("raw_shockcat",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_SHOCKCAT).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_LOBSTER = ITEMS.register("raw_lobster",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_LOBSTER).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_SNOWFLAKE = ITEMS.register("raw_snowflake",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_SNOWFLAKE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_EYEKITO = ITEMS.register("raw_eyekito",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_EYEKITO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_EYELASH = ITEMS.register("raw_eyelash",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_EYELASH).tab(UnusualFishMod.UNUSUAL_TAB)));

	//Cooked Foods

	public static final RegistryObject<Item> COOKED_AERO_MONO_STICK = ITEMS.register("cooked_aero_mono_stick",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_AERO_MONO_STICK).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_BUMPFACE = ITEMS.register("cooked_bumpface",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BUMPFACE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_RHINO_TETRA = ITEMS.register("cooked_rhino_tetra",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_TETRA_RHINO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_SAILOR_BARB = ITEMS.register("cooked_sailor_barb",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_SAILOR_BARB).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_BLIZZARD_TUNA = ITEMS.register("cooked_blizzard_tuna",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BLIZZARD_TUNA).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_VEIL_TENTACLE = ITEMS.register("cooked_veil_tentacle",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_VEIL_TENTACLE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_MOSSTHORN = ITEMS.register("cooked_mossthorn",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_MOSSTHORN).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_BARK_ANGEL = ITEMS.register("cooked_bark_angel",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BARK_ANGEL).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_LOBSTER = ITEMS.register("cooked_lobster",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_LOBSTER).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_SHOCKCAT = ITEMS.register("cooked_shockcat",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_SHOCKCAT).tab(UnusualFishMod.UNUSUAL_TAB)));

	//Drops

	public static final RegistryObject<Item> GLO_GEL = ITEMS.register("glo_gel",
			() -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	//Spawn Eggs

	public static final RegistryObject<ForgeSpawnEggItem> AERO_MONO_SPAWN_EGG = ITEMS.register("aero_mono_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.AERO_MONO, 0x8ea6af, 0x5b78ac,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PINKFIN_SPAWN_EGG = ITEMS.register("pinkfin_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.PINKFIN, 0x0e011e, 0x421054,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BARBED_SPAWN_EGG = ITEMS.register("guitar_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.ROUGHBACK, 0x7d5e32, 0x612d1a,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CLOWNTHORN_SPAWN_EGG = ITEMS.register("clownthorn_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.CLOWNTHORN_SHARK, 0xd46c1d, 0xa21e00,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DUALITY_SPAWN_EGG = ITEMS.register("duality_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.DUALITY_DAMSELFISH, 0xd7e7f0, 0x090719,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> HANDY_SPAWN_EGG = ITEMS.register("drooping_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.DROOPING_GOURAMI , 0x54291f, 0x52121f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MOSSTHORN_SPAWN_EGG = ITEMS.register("mossthorn_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.MOSSTHORN , 0x26a529, 0x034223,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MUD_SPAWN_EGG = ITEMS.register("grand_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.GRAND_CORY , 0x2d170a, 0x653116,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> REDGIANT_SPAWN_EGG = ITEMS.register("redgiant_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.REDGIANT_SEASTAR , 0xbe420f, 0xe19431,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> RHINO_TETRA_SPAWN_EGG = ITEMS.register("rhino_tetra_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.RHINO_TETRA , 0x50b9ad, 0x216687,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SAILOR_SPAWN_EGG = ITEMS.register("sailor_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SAILOR_BARB , 0x77a439, 0x4b580c,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PANCAKE_SPAWN_EGG = ITEMS.register("pancake_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SEA_PANCAKE , 0x9e6229, 0x551908,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SEA_SPIDER_SPAWN_EGG = ITEMS.register("sea_spider_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SEA_SPIDER , 0xc58a21, 0x7f0d00,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SPINDLEFISH_SPAWN_EGG = ITEMS.register("spindlefish_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SPINDLEFISH , 0xe07d76, 0x78064a,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> TRIPLE_SPAWN_EGG = ITEMS.register("triple_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.TRIPLE_TWIRL_PLECO , 0xc1923a, 0x903113,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BRICK_SNAIL_EGG = ITEMS.register("brick_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BRICK_SNAIL , 0x4b0c16, 0x7c5955,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> ZEBRA_EGG = ITEMS.register("zebra_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.ZEBRA_CORNETFISH , 0xa088b4, 0x472e63,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> TIGER_EGG = ITEMS.register("tiger_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.TIGER_PUFFER , 0x4b0f0b, 0xc26715,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BLACKCAP_EGG = ITEMS.register("blackcap_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BLACKCAP_SNAIL , 0x211c1e, 0x603d36,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BUMPFACE_EGG = ITEMS.register("sneep_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SNEEPSNORP , 0x404a7b, 0x779aa8,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DEEP_EGG = ITEMS.register("deep_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.DEEP_CRAWLER , 0x1a1825, 0x434751,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> WIZARD_EGG = ITEMS.register("wizard_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.WIZARD_JELLY , 0x1e134c, 0x8b55a6,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PORCUPINE_EGG = ITEMS.register("porcupine_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.PORCUPINE_LOBSTA , 0x460121, 0x8d2c3f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> TRUMPET_EGG = ITEMS.register("trumpet_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.TRUMPET_SQUID , 0x6a061a, 0xe9b142,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MANTIS_EGG = ITEMS.register("mantis_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.FRESHWATER_MANTIS , 0x4b2f1a, 0x7c8b44,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BARK_EGG = ITEMS.register("bark_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BARK_ANGELFISH , 0x3b0e08, 0x6b3f21,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SHOCKCAT_EGG = ITEMS.register("shockcat_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SHOCKCAT , 0x222c58, 0x4595ba,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> THORN_EGG = ITEMS.register("muddytop_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.MUDDYTOP_SNAIL , 0x23100e, 0x5f4d3b,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> KRABULON_EGG = ITEMS.register("krabulon_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.KALAPPA , 0x624051, 0x886d86,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SKIPPER_EGG = ITEMS.register("skipper_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.LOBED_SKIPPER , 0x4b2618, 0x9e632f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DRAGON_EGG = ITEMS.register("stout_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.STOUT_BICHIR , 0x07331c, 0x3c7834,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BEAKED_EGG = ITEMS.register("beaked_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BEAKED_HERRING , 0x516881, 0x71a29f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PICKLE_EGG = ITEMS.register("pickle_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.PICKLEFISH , 0x235806, 0xd0cd07,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CAVELOACH_EGG = ITEMS.register("blindsailfin_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BLIND_SAILFIN , 0xb1717c, 0xd1bdbc,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DEMON_EGG = ITEMS.register("demon_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.DEMON_HERRING , 0x1a1a3b, 0xe952b0,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> YELLOW_EGG = ITEMS.register("amber_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.AMBER_GOBY , 0xa22902, 0xddb534,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> HATCHET_EGG = ITEMS.register("hatchet_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.HATCHET_FISH , 0x0b0b26, 0x7d3283,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> FALSE_EGG = ITEMS.register("slate_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SLATEFISH , 0x18112c, 0x515862,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> COPPERFLAME_EGG = ITEMS.register("copperflame_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.COPPERFLAME , 0x44950f, 0xcfde3c,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> POG_EGG = ITEMS.register("longjaw_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.LONGJAW , 0xbe3016, 0xf08a47,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> COMET_EGG = ITEMS.register("comet_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.COMET_FISH , 0x12183b, 0xdfb220,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CELESTIAL_EGG = ITEMS.register("celestial_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.CELESTIAL_FISH , 0x060e26, 0xece651,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SQUODDLE_EGG = ITEMS.register("squoddle_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SQUODDLE , 0xbf3f00, 0xd8d2d8,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MOSQUITO_EGG = ITEMS.register("mosquito_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SEA_MOSQUITO , 0x5a7636, 0x82b472,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> FORK_EGG = ITEMS.register("fork_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.FORKFISH , 0xa35826, 0xccb05b,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SPOON_EGG = ITEMS.register("spoon_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SPOON_SHARK , 0x58241d, 0xb59259,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SKRIMP_EGG = ITEMS.register("skrimp_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.CORAL_SKRIMP , 0x5a0e7a, 0xb34aa2,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CIRCUS_EGG = ITEMS.register("circus_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.CIRCUSFISH , 0x590d0d, 0xd0c09a,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BLIZZARD_EGG = ITEMS.register("blizzard_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BLIZZARDFIN , 0x033d9a, 0x25bcce,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> WHISKER_EGG = ITEMS.register("whisker_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.WHISKERED , 0x592a12, 0x8d6b43,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BASKING_EGG = ITEMS.register("basking_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BASKING_TIAMAT , 0x432620, 0x857f68,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BASKING_BABY_EGG = ITEMS.register("basking_baby_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.BABY_BASKING_TIAMAT , 0x432620, 0xa09775,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SMELTER_EGG = ITEMS.register("smelter_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SMELTER_SNAIL , 0x160f10, 0x803837,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> EYEKITO_EGG = ITEMS.register("eyekito_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.EYEKITO , 0x554628, 0xd8ae33,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> EYELASH_EGG = ITEMS.register("eyelash_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.EYELASH , 0xb7b7ba, 0xfcfcfa,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SNOWFLAKE_EGG = ITEMS.register("snowflake_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.SNOWFLAKE , 0x496497, 0x93edfb,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> JUNGLE_EGG = ITEMS.register("jungle_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.JUNGLE_SHARK , 0x404d30, 0x2fe4d4,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CRIMSON_EGG = ITEMS.register("crimson_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.CRIMSONSHELL , 0x0e011e, 0xda4938,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> GREENGLOW_EGG = ITEMS.register("greenglow_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.GREENGLOW , 0x0e011e, 0x8cbf53,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> VOLT_EGG = ITEMS.register("volt_spawn_egg",
			() -> new ForgeSpawnEggItem(UnusualFishEntities.VOLT , 0x0e011e, 0xffea14,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	//Buckets

	public static final RegistryObject<Item> AERO_MONO_BUCKET = ITEMS.register("aero_mono_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.AERO_MONO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> RHINO_TETRA_BUCKET = ITEMS.register("rhino_tetra_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.RHINO_TETRA, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> DUALITY_DAMSELFISH_BUCKET = ITEMS.register("duality_damselfish_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.DUALITY_DAMSELFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> HANDY_GOURAMI_BUCKET = ITEMS.register("drooping_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.DROOPING_GOURAMI, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MOSSTHORN_BUCKET = ITEMS.register("mossthorn_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.MOSSTHORN, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SAILOR_BARB_BUCKET = ITEMS.register("sailor_barb_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SAILOR_BARB, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> TRIPLE_TWIRL_PLECO_BUCKET = ITEMS.register("triple_twirl_pleco_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.TRIPLE_TWIRL_PLECO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SPINDLEFISH_BUCKET = ITEMS.register("spindlefish_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SPINDLEFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SEA_SPIDER_BUCKET = ITEMS.register("sea_spider_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SEA_SPIDER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> CLOWNTHORN_BUCKET = ITEMS.register("clownthorn_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.CLOWNTHORN_SHARK, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MUDPIG_BUCKET = ITEMS.register("grand_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.GRAND_CORY, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BUMPFACE_BUCKET = ITEMS.register("sneep_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SNEEPSNORP, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BLACKCAP_BUCKET = ITEMS.register("blackcap_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.BLACKCAP_SNAIL, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BRICK_BUCKET = ITEMS.register("brick_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.BRICK_SNAIL, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> DEEP_BUCKET = ITEMS.register("deep_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.DEEP_CRAWLER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> WIZARD_BUCKET = ITEMS.register("wizard_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.WIZARD_JELLY, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> PORCUPINE_BUCKET = ITEMS.register("porcupine_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.PORCUPINE_LOBSTA, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MANTIS_BUCKET = ITEMS.register("mantis_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.FRESHWATER_MANTIS, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BARK_BUCKET = ITEMS.register("bark_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.BARK_ANGELFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SKIPPER_BUCKET = ITEMS.register("skipper_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.LOBED_SKIPPER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BEAKED_BUCKET = ITEMS.register("beaked_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.BEAKED_HERRING, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> PICKLEFISH_BUCKET = ITEMS.register("picklefish_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.PICKLEFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BLIND_BUCKET = ITEMS.register("blind_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.BLIND_SAILFIN, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> DEMON_BUCKET = ITEMS.register("demon_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.DEMON_HERRING, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> YELLOW_BUCKET = ITEMS.register("amber_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.AMBER_GOBY, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> HATCHET_BUCKET = ITEMS.register("hatchet_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.HATCHET_FISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> FALSE_BUCKET = ITEMS.register("slate_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SLATEFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> COPPERFLAME_BUCKET = ITEMS.register("copperflame_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.COPPERFLAME, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> POG_BUCKET = ITEMS.register("longjaw_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.LONGJAW, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> GRAVEL_BUCKET = ITEMS.register("comet_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.COMET_FISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SQUODDLE_BUCKET = ITEMS.register("squoddle_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SQUODDLE, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MOSQUITO_BUCKET = ITEMS.register("mosquito_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SEA_MOSQUITO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> FORK_BUCKET = ITEMS.register("fork_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.FORKFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SPOON_BUCKET = ITEMS.register("spoon_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SPOON_SHARK, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SKRIMP_BUCKET = ITEMS.register("skrimp_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.CORAL_SKRIMP, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> CIRCUS_BUCKET = ITEMS.register("circus_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.CIRCUSFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BASKING_BUCKET = ITEMS.register("basking_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.BABY_BASKING_TIAMAT, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> EYEKITO_BUCKET = ITEMS.register("eyekito_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.EYEKITO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> EYELASH_BUCKET = ITEMS.register("eyelash_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.EYELASH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SNOWFLAKE_BUCKET = ITEMS.register("snowflake_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.SNOWFLAKE, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> CRIMSON_BUCKET = ITEMS.register("crimson_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.CRIMSONSHELL, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> GREENGLOW_BUCKET = ITEMS.register("greenglow_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.GREENGLOW, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> VOLT_BUCKET = ITEMS.register("volt_bucket",
			() -> new ItemModFishBucket(UnusualFishEntities.VOLT, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
}
