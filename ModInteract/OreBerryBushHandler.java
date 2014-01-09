/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.DragonAPI.ModInteract;

import java.lang.reflect.Field;
import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Reika.DragonAPI.ModList;
import Reika.DragonAPI.Base.CropHandlerBase;
import Reika.DragonAPI.Libraries.Java.ReikaJavaLibrary;

public class OreBerryBushHandler extends CropHandlerBase {

	private static final OreBerryBushHandler instance = new OreBerryBushHandler();

	public final int bushID;
	public final int berryID;

	public final int secondbushID;

	private OreBerryBushHandler() {
		super();
		int idbush = -1;
		int idberry = -1;

		int idsecondbush = -1;
		if (this.hasMod()) {
			Class blocks = this.getMod().getBlockClass();
			Class items = this.getMod().getItemClass();
			try {
				Field f = blocks.getField("oreBerry");
				Block bush = (Block)f.get(null);
				idbush = bush.blockID;

				f = blocks.getField("oreBerrySecond");
				Block secondbush = (Block)f.get(null);
				idsecondbush = secondbush.blockID;

				f = items.getField("oreBerries");
				Item berry = (Item)f.get(null);
				idberry = berry.itemID;
			}
			catch (NoSuchFieldException e) {
				ReikaJavaLibrary.pConsole("DRAGONAPI: "+this.getMod()+" field not found! "+e.getMessage());
				e.printStackTrace();
			}
			catch (IllegalAccessException e) {
				ReikaJavaLibrary.pConsole("DRAGONAPI: Illegal access exception for reading "+this.getMod()+"!");
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				ReikaJavaLibrary.pConsole("DRAGONAPI: Null pointer exception for reading "+this.getMod()+"! Was the class loaded?");
				e.printStackTrace();
			}
		}
		else {
			this.noMod();
		}
		berryID = idberry;
		bushID = idbush;

		secondbushID = idsecondbush;
	}

	@Override
	public boolean isCrop(int id) {
		return id == bushID;
	}

	@Override
	public boolean isSeedItem(ItemStack is) {
		return false;
	}

	@Override
	public float getSecondSeedDropRate() {
		return 0;
	}

	@Override
	public boolean isRipeCrop(int id, int meta) {
		return this.isCrop(id) && meta >= this.getRipeMeta();
	}

	public static OreBerryBushHandler getInstance() {
		return instance;
	}

	@Override
	public boolean initializedProperly() {
		return bushID != -1 && berryID != -1 || secondbushID != -1;
	}

	@Override
	public ModList getMod() {
		return ModList.TINKERER;
	}

	@Override
	public int getRipeMeta() {
		return 12;
	}

	@Override
	public int getFreshMeta() {
		return 8;
	}

	@Override
	public ArrayList<ItemStack> getAdditionalDrops(World world, int x, int y, int z, int id, int meta, int fortune) {
		ArrayList<ItemStack> li = new ArrayList();
		if (id == bushID) {
			li.add(new ItemStack(berryID, 1, meta-12));
		}
		if (id == secondbushID) {
			li.add(new ItemStack(berryID, 1, meta-12));
		}
		return li;
	}

}