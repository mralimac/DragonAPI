/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.DragonAPI.Instantiable;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import Reika.DragonAPI.ModList;
import Reika.DragonAPI.Exception.InstallationException;

public class BiomeCollisionTracker {

	private HashMap<ModList, ArrayList<Integer>> IDs = new HashMap();
	private ArrayList<ModList> mods = new ArrayList();
	private HashMap<Integer, Class> classes = new HashMap();

	public static final BiomeCollisionTracker instance = new BiomeCollisionTracker();

	private BiomeCollisionTracker() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	public boolean isIDRegisteredToTracker(int id) {
		for (int i = 0; i < mods.size(); i++) {
			ModList mod = mods.get(i);
			ArrayList<Integer> ids = IDs.get(mod);
			if (ids.contains(id))
				return true;
		}
		return false;
	}

	private void addEntry(ModList mod, int id, Class biome) {
		ArrayList<Integer> ids = IDs.get(mod);
		if (ids == null) {
			ids = new ArrayList();
		}
		ids.add(id);
		IDs.put(mod, ids);
		if (!mods.contains(mod))
			mods.add(mod);
		classes.put(id, biome);
	}

	public void addBiomeID(ModList mod, int id, Class biomeClass) {
		BiomeGenBase biome = BiomeGenBase.biomeList[id];
		if (biome != null)
			this.onConflict(null, id);
		if (this.isIDRegisteredToTracker(id))
			this.onConflict(mod, id);
		else
			this.addEntry(mod, id, biomeClass);
	}

	public final void check() {
		for (int i = 0; i < mods.size(); i++) {
			ModList mod = mods.get(i);
			ArrayList<Integer> ids = IDs.get(mod);
			for (int k = 0; k < ids.size(); k++) {
				int id = ids.get(k);
				BiomeGenBase biome = BiomeGenBase.biomeList[id];
				if (biome == null)
					this.onConflict(mod, id);
				else {
					Class c = biome.getClass();
					Class c1 = classes.get(id);
					if (c1 != c)
						this.onConflict(mod, id);
				}
			}
		}
	}

	protected void onConflict(ModList mod, int id) {
		if (mod == null)
			throw new IllegalArgumentException("Overwriting already-registered biome "+BiomeGenBase.biomeList[id]+" @ "+id);
		throw new InstallationException(mod, "Biome ID Conflict: ID "+id);
	}

}
