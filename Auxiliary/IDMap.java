/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.DragonAPI.Auxiliary;

import java.util.HashMap;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBed;
import net.minecraft.item.ItemBoat;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemCarrotOnAStick;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEmptyMap;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemEnderEye;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemFireball;
import net.minecraft.item.ItemFirework;
import net.minecraft.item.ItemFireworkCharge;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemGlassBottle;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemRedstone;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemSaddle;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSign;
import net.minecraft.item.ItemSimpleFoiled;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemWritableBook;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionHelper;
import net.minecraft.tileentity.TileEntitySign;

public class IDMap {

	private static final HashMap<Block, Integer> blockIDs = new HashMap();
	private static final HashMap<Item, Integer> itemIDs = new HashMap();

	static {
		blockIDs.put(Block. stone = (new BlockStone(1)).setHardness(1.5F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("stone");
		blockIDs.put(Block.Grass grass = (BlockGrass)(new BlockGrass(2)).setHardness(0.6F).setStepSound(soundGrassFootstep).setUnlocalizedName("grass");
		blockIDs.put(Block. dirt = (new BlockDirt(3)).setHardness(0.5F).setStepSound(soundGravelFootstep).setUnlocalizedName("dirt");
		blockIDs.put(Block. cobblestone = (new Block(4, Material.rock)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("stonebrick").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. planks = (new BlockWood(5)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("wood");
		blockIDs.put(Block. sapling = (new BlockSapling(6)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("sapling");
		blockIDs.put(Block. bedrock = (new Block(7, Material.rock)).setBlockUnbreakable().setResistance(6000000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("bedrock").disableStats().setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block.Fluid waterMoving = (BlockFluid)(new BlockFlowing(8, Material.water)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water").disableStats();
		blockIDs.put(Block. waterStill = (new BlockStationary(9, Material.water)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water").disableStats();
		blockIDs.put(Block.Fluid lavaMoving = (BlockFluid)(new BlockFlowing(10, Material.lava)).setHardness(0.0F).setLightValue(1.0F).setUnlocalizedName("lava").disableStats();

		/** Stationary lava source block */
		blockIDs.put(Block. lavaStill = (new BlockStationary(11, Material.lava)).setHardness(100.0F).setLightValue(1.0F).setUnlocalizedName("lava").disableStats();
		blockIDs.put(Block. sand = (new BlockSand(12)).setHardness(0.5F).setStepSound(soundSandFootstep).setUnlocalizedName("sand");
		blockIDs.put(Block. gravel = (new BlockGravel(13)).setHardness(0.6F).setStepSound(soundGravelFootstep).setUnlocalizedName("gravel");
		blockIDs.put(Block. oreGold = (new BlockOre(14)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreGold");
		blockIDs.put(Block. oreIron = (new BlockOre(15)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreIron");
		blockIDs.put(Block. oreCoal = (new BlockOre(16)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreCoal");
		blockIDs.put(Block. wood = (new BlockLog(17)).setHardness(2.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("log");
		blockIDs.put(Block.Leaves leaves = (BlockLeaves)(new BlockLeaves(18)).setHardness(0.2F).setLightOpacity(1).setStepSound(soundGrassFootstep).setUnlocalizedName("leaves");
		blockIDs.put(Block. sponge = (new BlockSponge(19)).setHardness(0.6F).setStepSound(soundGrassFootstep).setUnlocalizedName("sponge");
		blockIDs.put(Block. glass = (new BlockGlass(20, Material.glass, false)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("glass");
		blockIDs.put(Block. oreLapis = (new BlockOre(21)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreLapis");
		blockIDs.put(Block. blockLapis = (new Block(22, Material.rock)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("blockLapis").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. dispenser = (new BlockDispenser(23)).setHardness(3.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("dispenser");
		blockIDs.put(Block. sandStone = (new BlockSandStone(24)).setStepSound(soundStoneFootstep).setHardness(0.8F).setUnlocalizedName("sandStone");
		blockIDs.put(Block. music = (new BlockNote(25)).setHardness(0.8F).setUnlocalizedName("musicBlock");
		blockIDs.put(Block. bed = (new BlockBed(26)).setHardness(0.2F).setUnlocalizedName("bed").disableStats();
		blockIDs.put(Block. railPowered = (new BlockRailPowered(27)).setHardness(0.7F).setStepSound(soundMetalFootstep).setUnlocalizedName("goldenRail");
		blockIDs.put(Block. railDetector = (new BlockDetectorRail(28)).setHardness(0.7F).setStepSound(soundMetalFootstep).setUnlocalizedName("detectorRail");
		blockIDs.put(Block.PistonBase pistonStickyBase = (BlockPistonBase)(new BlockPistonBase(29, true)).setUnlocalizedName("pistonStickyBase");
		blockIDs.put(Block. web = (new BlockWeb(30)).setLightOpacity(1).setHardness(4.0F).setUnlocalizedName("web");
		blockIDs.put(Block.TallGrass tallGrass = (BlockTallGrass)(new BlockTallGrass(31)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("tallgrass");
		blockIDs.put(Block.DeadBush deadBush = (BlockDeadBush)(new BlockDeadBush(32)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("deadbush");
		blockIDs.put(Block.PistonBase pistonBase = (BlockPistonBase)(new BlockPistonBase(33, false)).setUnlocalizedName("pistonBase");
		blockIDs.put(Block.PistonExtension pistonExtension = new BlockPistonExtension(34);
		blockIDs.put(Block. cloth = (new BlockCloth()).setHardness(0.8F).setStepSound(soundClothFootstep).setUnlocalizedName("cloth");
		blockIDs.put(Block.PistonMoving pistonMoving = new BlockPistonMoving(36);
		blockIDs.put(Block.Flower plantYellow = (BlockFlower)(new BlockFlower(37)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("flower");
		blockIDs.put(Block.Flower plantRed = (BlockFlower)(new BlockFlower(38)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("rose");
		blockIDs.put(Block.Flower mushroomBrown = (BlockFlower)(new BlockMushroom(39, "mushroom_brown")).setHardness(0.0F).setStepSound(soundGrassFootstep).setLightValue(0.125F).setUnlocalizedName("mushroom");
		blockIDs.put(Block.Flower mushroomRed = (BlockFlower)(new BlockMushroom(40, "mushroom_red")).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("mushroom");
		blockIDs.put(Block. blockGold = (new BlockOreStorage(41)).setHardness(3.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("blockGold");
		blockIDs.put(Block. blockIron = (new BlockOreStorage(42)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("blockIron");

		/** stoneDoubleSlab */
		blockIDs.put(Block.HalfSlab stoneDoubleSlab = (BlockHalfSlab)(new BlockStep(43, true)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("stoneSlab");

		/** stoneSingleSlab */
		blockIDs.put(Block.HalfSlab stoneSingleSlab = (BlockHalfSlab)(new BlockStep(44, false)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("stoneSlab");
		blockIDs.put(Block. brick = (new Block(45, Material.rock)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("brick").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. tnt = (new BlockTNT(46)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("tnt");
		blockIDs.put(Block. bookShelf = (new BlockBookshelf(47)).setHardness(1.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("bookshelf");
		blockIDs.put(Block. cobblestoneMossy = (new Block(48, Material.rock)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("stoneMoss").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. obsidian = (new BlockObsidian(49)).setHardness(50.0F).setResistance(2000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("obsidian");
		blockIDs.put(Block. torchWood = (new BlockTorch(50)).setHardness(0.0F).setLightValue(0.9375F).setStepSound(soundWoodFootstep).setUnlocalizedName("torch");
		blockIDs.put(Block.Fire fire = (BlockFire)(new BlockFire(51)).setHardness(0.0F).setLightValue(1.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("fire").disableStats();
		blockIDs.put(Block. mobSpawner = (new BlockMobSpawner(52)).setHardness(5.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("mobSpawner").disableStats();
		blockIDs.put(Block. stairsWoodOak = (new BlockStairs(53, planks, 0)).setUnlocalizedName("stairsWood");
		blockIDs.put(Block.Chest chest = (BlockChest)(new BlockChest(54, 0)).setHardness(2.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("chest");
		blockIDs.put(Block.RedstoneWire redstoneWire = (BlockRedstoneWire)(new BlockRedstoneWire(55)).setHardness(0.0F).setStepSound(soundPowderFootstep).setUnlocalizedName("redstoneDust").disableStats();
		blockIDs.put(Block. oreDiamond = (new BlockOre(56)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreDiamond");
		blockIDs.put(Block. blockDiamond = (new BlockOreStorage(57)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("blockDiamond");
		blockIDs.put(Block. workbench = (new BlockWorkbench(58)).setHardness(2.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("workbench");
		blockIDs.put(Block. crops = (new BlockCrops(59)).setUnlocalizedName("crops");
		blockIDs.put(Block. tilledField = (new BlockFarmland(60)).setHardness(0.6F).setStepSound(soundGravelFootstep).setUnlocalizedName("farmland");
		blockIDs.put(Block. furnaceIdle = (new BlockFurnace(61, false)).setHardness(3.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("furnace").setCreativeTab(CreativeTabs.tabDecorations);
		blockIDs.put(Block. furnaceBurning = (new BlockFurnace(62, true)).setHardness(3.5F).setStepSound(soundStoneFootstep).setLightValue(0.875F).setUnlocalizedName("furnace");
		blockIDs.put(Block. signPost = (new BlockSign(63, TileEntitySign.class, true)).setHardness(1.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("sign").disableStats();
		blockIDs.put(Block. doorWood = (new BlockDoor(64, Material.wood)).setHardness(3.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("doorWood").disableStats();
		blockIDs.put(Block. ladder = (new BlockLadder(65)).setHardness(0.4F).setStepSound(soundLadderFootstep).setUnlocalizedName("ladder");
		blockIDs.put(Block. rail = (new BlockRail(66)).setHardness(0.7F).setStepSound(soundMetalFootstep).setUnlocalizedName("rail");
		blockIDs.put(Block. stairsCobblestone = (new BlockStairs(67, cobblestone, 0)).setUnlocalizedName("stairsStone");
		blockIDs.put(Block. signWall = (new BlockSign(68, TileEntitySign.class, false)).setHardness(1.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("sign").disableStats();
		blockIDs.put(Block. lever = (new BlockLever(69)).setHardness(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("lever");
		blockIDs.put(Block. pressurePlateStone = (new BlockPressurePlate(70, "stone", Material.rock, EnumMobType.mobs)).setHardness(0.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("pressurePlate");
		blockIDs.put(Block. doorIron = (new BlockDoor(71, Material.iron)).setHardness(5.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("doorIron").disableStats();
		blockIDs.put(Block. pressurePlatePlanks = (new BlockPressurePlate(72, "wood", Material.wood, EnumMobType.everything)).setHardness(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("pressurePlate");
		blockIDs.put(Block. oreRedstone = (new BlockRedstoneOre(73, false)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreRedstone").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. oreRedstoneGlowing = (new BlockRedstoneOre(74, true)).setLightValue(0.625F).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreRedstone");
		blockIDs.put(Block. torchRedstoneIdle = (new BlockRedstoneTorch(75, false)).setHardness(0.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("notGate");
		blockIDs.put(Block. torchRedstoneActive = (new BlockRedstoneTorch(76, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("notGate").setCreativeTab(CreativeTabs.tabRedstone);
		blockIDs.put(Block. stoneButton = (new BlockButtonStone(77)).setHardness(0.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("button");
		blockIDs.put(Block. snow = (new BlockSnow(78)).setHardness(0.1F).setStepSound(soundSnowFootstep).setUnlocalizedName("snow").setLightOpacity(0);
		blockIDs.put(Block. ice = (new BlockIce(79)).setHardness(0.5F).setLightOpacity(3).setStepSound(soundGlassFootstep).setUnlocalizedName("ice");
		blockIDs.put(Block. blockSnow = (new BlockSnowBlock(80)).setHardness(0.2F).setStepSound(soundSnowFootstep).setUnlocalizedName("snow");
		blockIDs.put(Block. cactus = (new BlockCactus(81)).setHardness(0.4F).setStepSound(soundClothFootstep).setUnlocalizedName("cactus");
		blockIDs.put(Block. blockClay = (new BlockClay(82)).setHardness(0.6F).setStepSound(soundGravelFootstep).setUnlocalizedName("clay");
		blockIDs.put(Block. reed = (new BlockReed(83)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("reeds").disableStats();
		blockIDs.put(Block. jukebox = (new BlockJukeBox(84)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("jukebox");
		blockIDs.put(Block. fence = (new BlockFence(85, "wood", Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("fence");
		blockIDs.put(Block. pumpkin = (new BlockPumpkin(86, false)).setHardness(1.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("pumpkin");
		blockIDs.put(Block. netherrack = (new BlockNetherrack(87)).setHardness(0.4F).setStepSound(soundStoneFootstep).setUnlocalizedName("hellrock");
		blockIDs.put(Block. slowSand = (new BlockSoulSand(88)).setHardness(0.5F).setStepSound(soundSandFootstep).setUnlocalizedName("hellsand");
		blockIDs.put(Block. glowStone = (new BlockGlowStone(89, Material.glass)).setHardness(0.3F).setStepSound(soundGlassFootstep).setLightValue(1.0F).setUnlocalizedName("lightgem");

		/** The purple teleport blocks inside the obsidian circle */
		blockIDs.put(Block.Portal portal = (BlockPortal)(new BlockPortal(90)).setHardness(-1.0F).setStepSound(soundGlassFootstep).setLightValue(0.75F).setUnlocalizedName("portal");
		blockIDs.put(Block. pumpkinLantern = (new BlockPumpkin(91, true)).setHardness(1.0F).setStepSound(soundWoodFootstep).setLightValue(1.0F).setUnlocalizedName("litpumpkin");
		blockIDs.put(Block. cake = (new BlockCake(92)).setHardness(0.5F).setStepSound(soundClothFootstep).setUnlocalizedName("cake").disableStats();
		blockIDs.put(Block.RedstoneRepeater redstoneRepeaterIdle = (BlockRedstoneRepeater)(new BlockRedstoneRepeater(93, false)).setHardness(0.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("diode").disableStats();
		blockIDs.put(Block.RedstoneRepeater redstoneRepeaterActive = (BlockRedstoneRepeater)(new BlockRedstoneRepeater(94, true)).setHardness(0.0F).setLightValue(0.625F).setStepSound(soundWoodFootstep).setUnlocalizedName("diode").disableStats();

		/**
		 * April fools secret locked chest, only spawns on new chunks on 1st April.
		 */
		blockIDs.put(Block. lockedChest = (new BlockLockedChest(95)).setHardness(0.0F).setLightValue(1.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("lockedchest").setTickRandomly(true);
		blockIDs.put(Block. trapdoor = (new BlockTrapDoor(96, Material.wood)).setHardness(3.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("trapdoor").disableStats();
		blockIDs.put(Block. silverfish = (new BlockSilverfish(97)).setHardness(0.75F).setUnlocalizedName("monsterStoneEgg");
		blockIDs.put(Block. stoneBrick = (new BlockStoneBrick(98)).setHardness(1.5F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("stonebricksmooth");
		blockIDs.put(Block. mushroomCapBrown = (new BlockMushroomCap(99, Material.wood, 0)).setHardness(0.2F).setStepSound(soundWoodFootstep).setUnlocalizedName("mushroom");
		blockIDs.put(Block. mushroomCapRed = (new BlockMushroomCap(100, Material.wood, 1)).setHardness(0.2F).setStepSound(soundWoodFootstep).setUnlocalizedName("mushroom");
		blockIDs.put(Block. fenceIron = (new BlockPane(101, "fenceIron", "fenceIron", Material.iron, true)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("fenceIron");
		blockIDs.put(Block. thinGlass = (new BlockPane(102, "glass", "thinglass_top", Material.glass, false)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("thinGlass");
		blockIDs.put(Block. melon = (new BlockMelon(103)).setHardness(1.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("melon");
		blockIDs.put(Block. pumpkinStem = (new BlockStem(104, pumpkin)).setHardness(0.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("pumpkinStem");
		blockIDs.put(Block. melonStem = (new BlockStem(105, melon)).setHardness(0.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("pumpkinStem");
		blockIDs.put(Block. vine = (new BlockVine(106)).setHardness(0.2F).setStepSound(soundGrassFootstep).setUnlocalizedName("vine");
		blockIDs.put(Block. fenceGate = (new BlockFenceGate(107)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("fenceGate");
		blockIDs.put(Block. stairsBrick = (new BlockStairs(108, brick, 0)).setUnlocalizedName("stairsBrick");
		blockIDs.put(Block. stairsStoneBrick = (new BlockStairs(109, stoneBrick, 0)).setUnlocalizedName("stairsStoneBrickSmooth");
		blockIDs.put(Block.Mycelium mycelium = (BlockMycelium)(new BlockMycelium(110)).setHardness(0.6F).setStepSound(soundGrassFootstep).setUnlocalizedName("mycel");
		blockIDs.put(Block. waterlily = (new BlockLilyPad(111)).setHardness(0.0F).setStepSound(soundGrassFootstep).setUnlocalizedName("waterlily");
		blockIDs.put(Block. netherBrick = (new Block(112, Material.rock)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("netherBrick").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. netherFence = (new BlockFence(113, "netherBrick", Material.rock)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("netherFence");
		blockIDs.put(Block. stairsNetherBrick = (new BlockStairs(114, netherBrick, 0)).setUnlocalizedName("stairsNetherBrick");
		blockIDs.put(Block. netherStalk = (new BlockNetherStalk(115)).setUnlocalizedName("netherStalk");
		blockIDs.put(Block. enchantmentTable = (new BlockEnchantmentTable(116)).setHardness(5.0F).setResistance(2000.0F).setUnlocalizedName("enchantmentTable");
		blockIDs.put(Block. brewingStand = (new BlockBrewingStand(117)).setHardness(0.5F).setLightValue(0.125F).setUnlocalizedName("brewingStand");
		blockIDs.put(Block.Cauldron cauldron = (BlockCauldron)(new BlockCauldron(118)).setHardness(2.0F).setUnlocalizedName("cauldron");
		blockIDs.put(Block. endPortal = (new BlockEndPortal(119, Material.portal)).setHardness(-1.0F).setResistance(6000000.0F);
		blockIDs.put(Block. endPortalFrame = (new BlockEndPortalFrame(120)).setStepSound(soundGlassFootstep).setLightValue(0.125F).setHardness(-1.0F).setUnlocalizedName("endPortalFrame").setResistance(6000000.0F).setCreativeTab(CreativeTabs.tabDecorations);
		blockIDs.put(Block. whiteStone = (new Block(121, Material.rock)).setHardness(3.0F).setResistance(15.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("whiteStone").setCreativeTab(CreativeTabs.tabBlock);
		blockIDs.put(Block. dragonEgg = (new BlockDragonEgg(122)).setHardness(3.0F).setResistance(15.0F).setStepSound(soundStoneFootstep).setLightValue(0.125F).setUnlocalizedName("dragonEgg");
		blockIDs.put(Block. redstoneLampIdle = (new BlockRedstoneLight(123, false)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("redstoneLight").setCreativeTab(CreativeTabs.tabRedstone);
		blockIDs.put(Block. redstoneLampActive = (new BlockRedstoneLight(124, true)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("redstoneLight");
		blockIDs.put(Block.HalfSlab woodDoubleSlab = (BlockHalfSlab)(new BlockWoodSlab(125, true)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("woodSlab");
		blockIDs.put(Block.HalfSlab woodSingleSlab = (BlockHalfSlab)(new BlockWoodSlab(126, false)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("woodSlab");
		blockIDs.put(Block. cocoaPlant = (new BlockCocoa(127)).setHardness(0.2F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("cocoa");
		blockIDs.put(Block. stairsSandStone = (new BlockStairs(128, sandStone, 0)).setUnlocalizedName("stairsSandStone");
		blockIDs.put(Block. oreEmerald = (new BlockOre(129)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreEmerald");
		blockIDs.put(Block. enderChest = (new BlockEnderChest(130)).setHardness(22.5F).setResistance(1000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("enderChest").setLightValue(0.5F);
		blockIDs.put(Block.TripWireSource tripWireSource = (BlockTripWireSource)(new BlockTripWireSource(131)).setUnlocalizedName("tripWireSource");
		blockIDs.put(Block. tripWire = (new BlockTripWire(132)).setUnlocalizedName("tripWire");
		blockIDs.put(Block. blockEmerald = (new BlockOreStorage(133)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("blockEmerald");
		blockIDs.put(Block. stairsWoodSpruce = (new BlockStairs(134, planks, 1)).setUnlocalizedName("stairsWoodSpruce");
		blockIDs.put(Block. stairsWoodBirch = (new BlockStairs(135, planks, 2)).setUnlocalizedName("stairsWoodBirch");
		blockIDs.put(Block. stairsWoodJungle = (new BlockStairs(136, planks, 3)).setUnlocalizedName("stairsWoodJungle");
		blockIDs.put(Block. commandBlock = (new BlockCommandBlock(137)).setUnlocalizedName("commandBlock");
		blockIDs.put(Block.Beacon beacon = (BlockBeacon)(new BlockBeacon(138)).setUnlocalizedName("beacon").setLightValue(1.0F);
		blockIDs.put(Block. cobblestoneWall = (new BlockWall(139, cobblestone)).setUnlocalizedName("cobbleWall");
		blockIDs.put(Block. flowerPot = (new BlockFlowerPot(140)).setHardness(0.0F).setStepSound(soundPowderFootstep).setUnlocalizedName("flowerPot");
		blockIDs.put(Block. carrot = (new BlockCarrot(141)).setUnlocalizedName("carrots");
		blockIDs.put(Block. potato = (new BlockPotato(142)).setUnlocalizedName("potatoes");
		blockIDs.put(Block. woodenButton = (new BlockButtonWood(143)).setHardness(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("button");
		blockIDs.put(Block. skull = (new BlockSkull(144)).setHardness(1.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("skull");
		blockIDs.put(Block. anvil = (new BlockAnvil(145)).setHardness(5.0F).setStepSound(soundAnvilFootstep).setResistance(2000.0F).setUnlocalizedName("anvil");
		blockIDs.put(Block. chestTrapped = (new BlockChest(146, 1)).setHardness(2.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("chestTrap");
		blockIDs.put(Block. pressurePlateGold = (new BlockPressurePlateWeighted(147, "blockGold", Material.iron, 64)).setHardness(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("weightedPlate_light");
		blockIDs.put(Block. pressurePlateIron = (new BlockPressurePlateWeighted(148, "blockIron", Material.iron, 640)).setHardness(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("weightedPlate_heavy");
		blockIDs.put(Block.Comparator redstoneComparatorIdle = (BlockComparator)(new BlockComparator(149, false)).setHardness(0.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("comparator").disableStats();
		blockIDs.put(Block.Comparator redstoneComparatorActive = (BlockComparator)(new BlockComparator(150, true)).setHardness(0.0F).setLightValue(0.625F).setStepSound(soundWoodFootstep).setUnlocalizedName("comparator").disableStats();
		blockIDs.put(Block.DaylightDetector daylightSensor = (BlockDaylightDetector)(new BlockDaylightDetector(151)).setHardness(0.2F).setStepSound(soundWoodFootstep).setUnlocalizedName("daylightDetector");
		blockIDs.put(Block. blockRedstone = (new BlockPoweredOre(152)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("blockRedstone");
		blockIDs.put(Block. oreNetherQuartz = (new BlockOre(153)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("netherquartz");
		blockIDs.put(Block.Hopper hopperBlock = (BlockHopper)(new BlockHopper(154)).setHardness(3.0F).setResistance(8.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("hopper");
		blockIDs.put(Block. blockNetherQuartz = (new BlockQuartz(155)).setStepSound(soundStoneFootstep).setHardness(0.8F).setUnlocalizedName("quartzBlock");
		blockIDs.put(Block. stairsNetherQuartz = (new BlockStairs(156, blockNetherQuartz, 0)).setUnlocalizedName("stairsQuartz");
		blockIDs.put(Block. railActivator = (new BlockRailPowered(157)).setHardness(0.7F).setStepSound(soundMetalFootstep).setUnlocalizedName("activatorRail");
		blockIDs.put(Block. dropper = (new BlockDropper(158)).setHardness(3.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("dropper");

		public static Item shovelIron = (new ItemSpade(0, EnumToolMaterial.IRON)).setUnlocalizedName("shovelIron");
		public static Item pickaxeIron = (new ItemPickaxe(1, EnumToolMaterial.IRON)).setUnlocalizedName("pickaxeIron");
		public static Item axeIron = (new ItemAxe(2, EnumToolMaterial.IRON)).setUnlocalizedName("hatchetIron");
		public static Item flintAndSteel = (new ItemFlintAndSteel(3)).setUnlocalizedName("flintAndSteel");
		public static Item appleRed = (new ItemFood(4, 4, 0.3F, false)).setUnlocalizedName("apple");
		public static ItemBow bow = (ItemBow)(new ItemBow(5)).setUnlocalizedName("bow");
		public static Item arrow = (new Item(6)).setUnlocalizedName("arrow").setCreativeTab(CreativeTabs.tabCombat);
		public static Item coal = (new ItemCoal(7)).setUnlocalizedName("coal");
		public static Item diamond = (new Item(8)).setUnlocalizedName("diamond").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item ingotIron = (new Item(9)).setUnlocalizedName("ingotIron").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item ingotGold = (new Item(10)).setUnlocalizedName("ingotGold").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item swordIron = (new ItemSword(11, EnumToolMaterial.IRON)).setUnlocalizedName("swordIron");
		public static Item swordWood = (new ItemSword(12, EnumToolMaterial.WOOD)).setUnlocalizedName("swordWood");
		public static Item shovelWood = (new ItemSpade(13, EnumToolMaterial.WOOD)).setUnlocalizedName("shovelWood");
		public static Item pickaxeWood = (new ItemPickaxe(14, EnumToolMaterial.WOOD)).setUnlocalizedName("pickaxeWood");
		public static Item axeWood = (new ItemAxe(15, EnumToolMaterial.WOOD)).setUnlocalizedName("hatchetWood");
		public static Item swordStone = (new ItemSword(16, EnumToolMaterial.STONE)).setUnlocalizedName("swordStone");
		public static Item shovelStone = (new ItemSpade(17, EnumToolMaterial.STONE)).setUnlocalizedName("shovelStone");
		public static Item pickaxeStone = (new ItemPickaxe(18, EnumToolMaterial.STONE)).setUnlocalizedName("pickaxeStone");
		public static Item axeStone = (new ItemAxe(19, EnumToolMaterial.STONE)).setUnlocalizedName("hatchetStone");
		public static Item swordDiamond = (new ItemSword(20, EnumToolMaterial.EMERALD)).setUnlocalizedName("swordDiamond");
		public static Item shovelDiamond = (new ItemSpade(21, EnumToolMaterial.EMERALD)).setUnlocalizedName("shovelDiamond");
		public static Item pickaxeDiamond = (new ItemPickaxe(22, EnumToolMaterial.EMERALD)).setUnlocalizedName("pickaxeDiamond");
		public static Item axeDiamond = (new ItemAxe(23, EnumToolMaterial.EMERALD)).setUnlocalizedName("hatchetDiamond");
		public static Item stick = (new Item(24)).setFull3D().setUnlocalizedName("stick").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item bowlEmpty = (new Item(25)).setUnlocalizedName("bowl").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item bowlSoup = (new ItemSoup(26, 6)).setUnlocalizedName("mushroomStew");
		public static Item swordGold = (new ItemSword(27, EnumToolMaterial.GOLD)).setUnlocalizedName("swordGold");
		public static Item shovelGold = (new ItemSpade(28, EnumToolMaterial.GOLD)).setUnlocalizedName("shovelGold");
		public static Item pickaxeGold = (new ItemPickaxe(29, EnumToolMaterial.GOLD)).setUnlocalizedName("pickaxeGold");
		public static Item axeGold = (new ItemAxe(30, EnumToolMaterial.GOLD)).setUnlocalizedName("hatchetGold");
		public static Item silk = (new ItemReed(31, Block.tripWire)).setUnlocalizedName("string").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item feather = (new Item(32)).setUnlocalizedName("feather").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item gunpowder = (new Item(33)).setUnlocalizedName("sulphur").setPotionEffect(PotionHelper.gunpowderEffect).setCreativeTab(CreativeTabs.tabMaterials);
		public static Item hoeWood = (new ItemHoe(34, EnumToolMaterial.WOOD)).setUnlocalizedName("hoeWood");
		public static Item hoeStone = (new ItemHoe(35, EnumToolMaterial.STONE)).setUnlocalizedName("hoeStone");
		public static Item hoeIron = (new ItemHoe(36, EnumToolMaterial.IRON)).setUnlocalizedName("hoeIron");
		public static Item hoeDiamond = (new ItemHoe(37, EnumToolMaterial.EMERALD)).setUnlocalizedName("hoeDiamond");
		public static Item hoeGold = (new ItemHoe(38, EnumToolMaterial.GOLD)).setUnlocalizedName("hoeGold");
		public static Item seeds = (new ItemSeeds(39, Block.crops.blockID, Block.tilledField.blockID)).setUnlocalizedName("seeds");
		public static Item wheat = (new Item(40)).setUnlocalizedName("wheat").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item bread = (new ItemFood(41, 5, 0.6F, false)).setUnlocalizedName("bread");
		public static ItemArmor helmetLeather = (ItemArmor)(new ItemArmor(42, EnumArmorMaterial.CLOTH, 0, 0)).setUnlocalizedName("helmetCloth");
		public static ItemArmor plateLeather = (ItemArmor)(new ItemArmor(43, EnumArmorMaterial.CLOTH, 0, 1)).setUnlocalizedName("chestplateCloth");
		public static ItemArmor legsLeather = (ItemArmor)(new ItemArmor(44, EnumArmorMaterial.CLOTH, 0, 2)).setUnlocalizedName("leggingsCloth");
		public static ItemArmor bootsLeather = (ItemArmor)(new ItemArmor(45, EnumArmorMaterial.CLOTH, 0, 3)).setUnlocalizedName("bootsCloth");
		public static ItemArmor helmetChain = (ItemArmor)(new ItemArmor(46, EnumArmorMaterial.CHAIN, 1, 0)).setUnlocalizedName("helmetChain");
		public static ItemArmor plateChain = (ItemArmor)(new ItemArmor(47, EnumArmorMaterial.CHAIN, 1, 1)).setUnlocalizedName("chestplateChain");
		public static ItemArmor legsChain = (ItemArmor)(new ItemArmor(48, EnumArmorMaterial.CHAIN, 1, 2)).setUnlocalizedName("leggingsChain");
		public static ItemArmor bootsChain = (ItemArmor)(new ItemArmor(49, EnumArmorMaterial.CHAIN, 1, 3)).setUnlocalizedName("bootsChain");
		public static ItemArmor helmetIron = (ItemArmor)(new ItemArmor(50, EnumArmorMaterial.IRON, 2, 0)).setUnlocalizedName("helmetIron");
		public static ItemArmor plateIron = (ItemArmor)(new ItemArmor(51, EnumArmorMaterial.IRON, 2, 1)).setUnlocalizedName("chestplateIron");
		public static ItemArmor legsIron = (ItemArmor)(new ItemArmor(52, EnumArmorMaterial.IRON, 2, 2)).setUnlocalizedName("leggingsIron");
		public static ItemArmor bootsIron = (ItemArmor)(new ItemArmor(53, EnumArmorMaterial.IRON, 2, 3)).setUnlocalizedName("bootsIron");
		public static ItemArmor helmetDiamond = (ItemArmor)(new ItemArmor(54, EnumArmorMaterial.DIAMOND, 3, 0)).setUnlocalizedName("helmetDiamond");
		public static ItemArmor plateDiamond = (ItemArmor)(new ItemArmor(55, EnumArmorMaterial.DIAMOND, 3, 1)).setUnlocalizedName("chestplateDiamond");
		public static ItemArmor legsDiamond = (ItemArmor)(new ItemArmor(56, EnumArmorMaterial.DIAMOND, 3, 2)).setUnlocalizedName("leggingsDiamond");
		public static ItemArmor bootsDiamond = (ItemArmor)(new ItemArmor(57, EnumArmorMaterial.DIAMOND, 3, 3)).setUnlocalizedName("bootsDiamond");
		public static ItemArmor helmetGold = (ItemArmor)(new ItemArmor(58, EnumArmorMaterial.GOLD, 4, 0)).setUnlocalizedName("helmetGold");
		public static ItemArmor plateGold = (ItemArmor)(new ItemArmor(59, EnumArmorMaterial.GOLD, 4, 1)).setUnlocalizedName("chestplateGold");
		public static ItemArmor legsGold = (ItemArmor)(new ItemArmor(60, EnumArmorMaterial.GOLD, 4, 2)).setUnlocalizedName("leggingsGold");
		public static ItemArmor bootsGold = (ItemArmor)(new ItemArmor(61, EnumArmorMaterial.GOLD, 4, 3)).setUnlocalizedName("bootsGold");
		public static Item flint = (new Item(62)).setUnlocalizedName("flint").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item porkRaw = (new ItemFood(63, 3, 0.3F, true)).setUnlocalizedName("porkchopRaw");
		public static Item porkCooked = (new ItemFood(64, 8, 0.8F, true)).setUnlocalizedName("porkchopCooked");
		public static Item painting = (new ItemHangingEntity(65, EntityPainting.class)).setUnlocalizedName("painting");
		public static Item appleGold = (new ItemAppleGold(66, 4, 1.2F, false)).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 5, 0, 1.0F).setUnlocalizedName("appleGold");
		public static Item sign = (new ItemSign(67)).setUnlocalizedName("sign");
		public static Item doorWood = (new ItemDoor(68, Material.wood)).setUnlocalizedName("doorWood");
		public static Item bucketEmpty = (new ItemBucket(69, 0)).setUnlocalizedName("bucket").setMaxStackSize(16);
		public static Item bucketWater = (new ItemBucket(70, Block.waterMoving.blockID)).setUnlocalizedName("bucketWater").setContainerItem(bucketEmpty);
		public static Item bucketLava = (new ItemBucket(71, Block.lavaMoving.blockID)).setUnlocalizedName("bucketLava").setContainerItem(bucketEmpty);
		public static Item minecartEmpty = (new ItemMinecart(72, 0)).setUnlocalizedName("minecart");
		public static Item saddle = (new ItemSaddle(73)).setUnlocalizedName("saddle");
		public static Item doorIron = (new ItemDoor(74, Material.iron)).setUnlocalizedName("doorIron");
		public static Item redstone = (new ItemRedstone(75)).setUnlocalizedName("redstone").setPotionEffect(PotionHelper.redstoneEffect);
		public static Item snowball = (new ItemSnowball(76)).setUnlocalizedName("snowball");
		public static Item boat = (new ItemBoat(77)).setUnlocalizedName("boat");
		public static Item leather = (new Item(78)).setUnlocalizedName("leather").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item bucketMilk = (new ItemBucketMilk(79)).setUnlocalizedName("milk").setContainerItem(bucketEmpty);
		public static Item brick = (new Item(80)).setUnlocalizedName("brick").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item clay = (new Item(81)).setUnlocalizedName("clay").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item reed = (new ItemReed(82, Block.reed)).setUnlocalizedName("reeds").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item paper = (new Item(83)).setUnlocalizedName("paper").setCreativeTab(CreativeTabs.tabMisc);
		public static Item book = (new ItemBook(84)).setUnlocalizedName("book").setCreativeTab(CreativeTabs.tabMisc);
		public static Item slimeBall = (new Item(85)).setUnlocalizedName("slimeball").setCreativeTab(CreativeTabs.tabMisc);
		public static Item minecartCrate = (new ItemMinecart(86, 1)).setUnlocalizedName("minecartChest");
		public static Item minecartPowered = (new ItemMinecart(87, 2)).setUnlocalizedName("minecartFurnace");
		public static Item egg = (new ItemEgg(88)).setUnlocalizedName("egg");
		public static Item compass = (new Item(89)).setUnlocalizedName("compass").setCreativeTab(CreativeTabs.tabTools);
		public static ItemFishingRod fishingRod = (ItemFishingRod)(new ItemFishingRod(90)).setUnlocalizedName("fishingRod");
		public static Item pocketSundial = (new Item(91)).setUnlocalizedName("clock").setCreativeTab(CreativeTabs.tabTools);
		public static Item lightStoneDust = (new Item(92)).setUnlocalizedName("yellowDust").setPotionEffect(PotionHelper.glowstoneEffect).setCreativeTab(CreativeTabs.tabMaterials);
		public static Item fishRaw = (new ItemFood(93, 2, 0.3F, false)).setUnlocalizedName("fishRaw");
		public static Item fishCooked = (new ItemFood(94, 5, 0.6F, false)).setUnlocalizedName("fishCooked");
		public static Item dyePowder = (new ItemDye(95)).setUnlocalizedName("dyePowder");
		public static Item bone = (new Item(96)).setUnlocalizedName("bone").setFull3D().setCreativeTab(CreativeTabs.tabMisc);
		public static Item sugar = (new Item(97)).setUnlocalizedName("sugar").setPotionEffect(PotionHelper.sugarEffect).setCreativeTab(CreativeTabs.tabMaterials);
		public static Item cake = (new ItemReed(98, Block.cake)).setMaxStackSize(1).setUnlocalizedName("cake").setCreativeTab(CreativeTabs.tabFood);
		public static Item bed = (new ItemBed(99)).setMaxStackSize(1).setUnlocalizedName("bed");
		public static Item redstoneRepeater = (new ItemReed(100, Block.redstoneRepeaterIdle)).setUnlocalizedName("diode").setCreativeTab(CreativeTabs.tabRedstone);
		public static Item cookie = (new ItemFood(101, 2, 0.1F, false)).setUnlocalizedName("cookie");
		public static ItemMap map = (ItemMap)(new ItemMap(102)).setUnlocalizedName("map");

		/**
		 * Item introduced on 1.7 version, is a shear to cut leaves (you can keep the block) or get wool from sheeps.
		 */
		public static ItemShears shears = (ItemShears)(new ItemShears(103)).setUnlocalizedName("shears");
		public static Item melon = (new ItemFood(104, 2, 0.3F, false)).setUnlocalizedName("melon");
		public static Item pumpkinSeeds = (new ItemSeeds(105, Block.pumpkinStem.blockID, Block.tilledField.blockID)).setUnlocalizedName("seeds_pumpkin");
		public static Item melonSeeds = (new ItemSeeds(106, Block.melonStem.blockID, Block.tilledField.blockID)).setUnlocalizedName("seeds_melon");
		public static Item beefRaw = (new ItemFood(107, 3, 0.3F, true)).setUnlocalizedName("beefRaw");
		public static Item beefCooked = (new ItemFood(108, 8, 0.8F, true)).setUnlocalizedName("beefCooked");
		public static Item chickenRaw = (new ItemFood(109, 2, 0.3F, true)).setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setUnlocalizedName("chickenRaw");
		public static Item chickenCooked = (new ItemFood(110, 6, 0.6F, true)).setUnlocalizedName("chickenCooked");
		public static Item rottenFlesh = (new ItemFood(111, 4, 0.1F, true)).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("rottenFlesh");
		public static Item enderPearl = (new ItemEnderPearl(112)).setUnlocalizedName("enderPearl");
		public static Item blazeRod = (new Item(113)).setUnlocalizedName("blazeRod").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item ghastTear = (new Item(114)).setUnlocalizedName("ghastTear").setPotionEffect(PotionHelper.ghastTearEffect).setCreativeTab(CreativeTabs.tabBrewing);
		public static Item goldNugget = (new Item(115)).setUnlocalizedName("goldNugget").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item netherStalkSeeds = (new ItemSeeds(116, Block.netherStalk.blockID, Block.slowSand.blockID)).setUnlocalizedName("netherStalkSeeds").setPotionEffect("+4");
		public static ItemPotion potion = (ItemPotion)(new ItemPotion(117)).setUnlocalizedName("potion");
		public static Item glassBottle = (new ItemGlassBottle(118)).setUnlocalizedName("glassBottle");
		public static Item spiderEye = (new ItemFood(119, 2, 0.8F, false)).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).setUnlocalizedName("spiderEye").setPotionEffect(PotionHelper.spiderEyeEffect);
		public static Item fermentedSpiderEye = (new Item(120)).setUnlocalizedName("fermentedSpiderEye").setPotionEffect(PotionHelper.fermentedSpiderEyeEffect).setCreativeTab(CreativeTabs.tabBrewing);
		public static Item blazePowder = (new Item(121)).setUnlocalizedName("blazePowder").setPotionEffect(PotionHelper.blazePowderEffect).setCreativeTab(CreativeTabs.tabBrewing);
		public static Item magmaCream = (new Item(122)).setUnlocalizedName("magmaCream").setPotionEffect(PotionHelper.magmaCreamEffect).setCreativeTab(CreativeTabs.tabBrewing);
		public static Item brewingStand = (new ItemReed(123, Block.brewingStand)).setUnlocalizedName("brewingStand").setCreativeTab(CreativeTabs.tabBrewing);
		public static Item cauldron = (new ItemReed(124, Block.cauldron)).setUnlocalizedName("cauldron").setCreativeTab(CreativeTabs.tabBrewing);
		public static Item eyeOfEnder = (new ItemEnderEye(125)).setUnlocalizedName("eyeOfEnder");
		public static Item speckledMelon = (new Item(126)).setUnlocalizedName("speckledMelon").setPotionEffect(PotionHelper.speckledMelonEffect).setCreativeTab(CreativeTabs.tabBrewing);
		public static Item monsterPlacer = (new ItemMonsterPlacer(127)).setUnlocalizedName("monsterPlacer");

		/**
		 * Bottle o' Enchanting. Drops between 1 and 3 experience orbs when thrown.
		 */
		public static Item expBottle = (new ItemExpBottle(128)).setUnlocalizedName("expBottle");

		/**
		 * Fire Charge. When used in a dispenser it fires a fireball similiar to a Ghast's.
		 */
		public static Item fireballCharge = (new ItemFireball(129)).setUnlocalizedName("fireball");
		public static Item writableBook = (new ItemWritableBook(130)).setUnlocalizedName("writingBook").setCreativeTab(CreativeTabs.tabMisc);
		public static Item writtenBook = (new ItemEditableBook(131)).setUnlocalizedName("writtenBook");
		public static Item emerald = (new Item(132)).setUnlocalizedName("emerald").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item itemFrame = (new ItemHangingEntity(133, EntityItemFrame.class)).setUnlocalizedName("frame");
		public static Item flowerPot = (new ItemReed(134, Block.flowerPot)).setUnlocalizedName("flowerPot").setCreativeTab(CreativeTabs.tabDecorations);
		public static Item carrot = (new ItemSeedFood(135, 4, 0.6F, Block.carrot.blockID, Block.tilledField.blockID)).setUnlocalizedName("carrots");
		public static Item potato = (new ItemSeedFood(136, 1, 0.3F, Block.potato.blockID, Block.tilledField.blockID)).setUnlocalizedName("potato");
		public static Item bakedPotato = (new ItemFood(137, 6, 0.6F, false)).setUnlocalizedName("potatoBaked");
		public static Item poisonousPotato = (new ItemFood(138, 2, 0.3F, false)).setPotionEffect(Potion.poison.id, 5, 0, 0.6F).setUnlocalizedName("potatoPoisonous");
		public static ItemEmptyMap emptyMap = (ItemEmptyMap)(new ItemEmptyMap(139)).setUnlocalizedName("emptyMap");
		public static Item goldenCarrot = (new ItemFood(140, 6, 1.2F, false)).setUnlocalizedName("carrotGolden").setPotionEffect(PotionHelper.goldenCarrotEffect);
		public static Item skull = (new ItemSkull(141)).setUnlocalizedName("skull");
		public static Item carrotOnAStick = (new ItemCarrotOnAStick(142)).setUnlocalizedName("carrotOnAStick");
		public static Item netherStar = (new ItemSimpleFoiled(143)).setUnlocalizedName("netherStar").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item pumpkinPie = (new ItemFood(144, 8, 0.3F, false)).setUnlocalizedName("pumpkinPie").setCreativeTab(CreativeTabs.tabFood);
		public static Item firework = (new ItemFirework(145)).setUnlocalizedName("fireworks");
		public static Item fireworkCharge = (new ItemFireworkCharge(146)).setUnlocalizedName("fireworksCharge").setCreativeTab(CreativeTabs.tabMisc);
		public static ItemEnchantedBook enchantedBook = (ItemEnchantedBook)(new ItemEnchantedBook(147)).setMaxStackSize(1).setUnlocalizedName("enchantedBook");
		public static Item comparator = (new ItemReed(148, Block.redstoneComparatorIdle)).setUnlocalizedName("comparator").setCreativeTab(CreativeTabs.tabRedstone);
		public static Item netherrackBrick = (new Item(149)).setUnlocalizedName("netherbrick").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item netherQuartz = (new Item(150)).setUnlocalizedName("netherquartz").setCreativeTab(CreativeTabs.tabMaterials);
		public static Item minecartTnt = (new ItemMinecart(151, 3)).setUnlocalizedName("minecartTnt");
		public static Item minecartHopper = (new ItemMinecart(152, 5)).setUnlocalizedName("minecartHopper");
		public static Item record13 = (new ItemRecord(2000, "13")).setUnlocalizedName("record");
		public static Item recordCat = (new ItemRecord(2001, "cat")).setUnlocalizedName("record");
		public static Item recordBlocks = (new ItemRecord(2002, "blocks")).setUnlocalizedName("record");
		public static Item recordChirp = (new ItemRecord(2003, "chirp")).setUnlocalizedName("record");
		public static Item recordFar = (new ItemRecord(2004, "far")).setUnlocalizedName("record");
		public static Item recordMall = (new ItemRecord(2005, "mall")).setUnlocalizedName("record");
		public static Item recordMellohi = (new ItemRecord(2006, "mellohi")).setUnlocalizedName("record");
		public static Item recordStal = (new ItemRecord(2007, "stal")).setUnlocalizedName("record");
		public static Item recordStrad = (new ItemRecord(2008, "strad")).setUnlocalizedName("record");
		public static Item recordWard = (new ItemRecord(2009, "ward")).setUnlocalizedName("record");
		public static Item record11 = (new ItemRecord(2010, "11")).setUnlocalizedName("record");
		public static Item recordWait = (new ItemRecord(2011, "wait")).setUnlocalizedName("record");
	}

}
