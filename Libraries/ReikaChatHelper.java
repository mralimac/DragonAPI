/*******************************************************************************
 * @author Reika
 * 
 * This code is the property of and owned and copyrighted by Reika.
 * This code is provided under a modified visible-source license that is as follows:
 * 
 * Any and all users are permitted to use the source for educational purposes, or to create other mods that call
 * parts of this code and use DragonAPI as a dependency.
 * 
 * Unless given explicit written permission - electronic writing is acceptable - no user may redistribute this
 * source code nor any derivative works. These pre-approved works must prominently contain this copyright notice.
 * 
 * Additionally, no attempt may be made to achieve monetary gain from this code by anyone except the original author.
 * In the case of pre-approved derivative works, any monetary gains made will be shared between the original author
 * and the other developer(s), proportional to the ratio of derived to original code.
 * 
 * Finally, any and all displays, duplicates or derivatives of this code must be prominently marked as such, and must
 * contain attribution to the original author, including a link to the original source. Any attempts to claim credit
 * for this code will be treated as intentional theft.
 * 
 * Due to the Mojang and Minecraft Mod Terms of Service and Licensing Restrictions, compiled versions of this code
 * must be provided for free. However, with the exception of pre-approved derivative works, only the original author
 * may distribute compiled binary versions of this code.
 * 
 * Failure to comply with these restrictions is a violation of copyright law and will be dealt with accordingly.
 ******************************************************************************/
package Reika.DragonAPI.Libraries;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Reika.DragonAPI.DragonAPICore;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public final class ReikaChatHelper extends DragonAPICore {

	public static void clearChat() {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
		Minecraft.getMinecraft().ingameGUI.getChatGUI().clearChatMessages();
	}

    /** Writes an itemstack to the chat.
     * Args: World, itemstack */
    public static void writeItemStack(World world, ItemStack is) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer == null || world == null)
    		return;
    	String msg;
    	if (is == null)
    		msg = "Null Stack!";
    	else
    		msg = String.format("%d, %d, %d", is.itemID, is.stackSize, is.getItemDamage());
    	Minecraft.getMinecraft().thePlayer.addChatMessage(msg);
    }

    /** Writes coordinates to the chat.
     * Args: World, x, y, z */
    public static void writeCoords(World world, double x, double y, double z) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer == null || world == null)
    		return;
    	String msg;
    	msg = String.format("%.2f, %.2f, %.2f", x, y, z);
    	Minecraft.getMinecraft().thePlayer.addChatMessage(msg);
    }

    /** Writes a block ID:metadata and coordinates to the chat.
     * Args: World, x, y, z */
    public static void writeBlockAtCoords(World world, int x, int y, int z) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer == null || world == null)
    		return;
    	String msg;
    	String name;
    	int id = world.getBlockId(x, y, z);
    	if (id != 0)
    		name = Block.blocksList[id].getLocalizedName();
    	else
    		name = "Air";
    	int meta = world.getBlockMetadata(x, y, z);
    	msg = String.format("Block "+name+" (ID %d Metadata %d) @ x=%d, y=%d, z=%d", id, meta, x, y, z);
    	Minecraft.getMinecraft().thePlayer.addChatMessage(msg);
    }

    /** Writes an integer to the chat. Args: Integer */
    public static void writeInt(int num) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	writeString(String.format("%d", num));
    }

    /** Writes any general-purpose string to the chat. Args: String */
    public static void writeString(String sg) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer != null)
    		Minecraft.getMinecraft().thePlayer.addChatMessage(sg);
    }

    /** A general object-to-chat function. Autoclips doubles to 2 decimals. Args: Object */
    public static void write(Object obj) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (obj == null) {
    		writeString("null");
    		return;
    	}
    	String str;
    	if (obj.getClass() == Double.class)
    		str = String.format("%.2f", obj);
    	else
    		str = String.valueOf(obj);
    	writeString(str);
    }

    public static void writeEntity(World world, Entity ent) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer == null || world == null)
    		return;
    	if (ent == null)
    		writeString("null");
    	else
    		writeString(ent.getEntityName()+" @ "+String.format("%.2f, %.2f, %.2f", ent.posX, ent.posY, ent.posZ));
    }

    public static void writeItem(World world, int id, int dmg) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer == null || world == null)
    		return;
    	if (id == 0)
    		writeString("Null Item");
    	else if (id < 256)
    		writeBlock(world, id, dmg);
    	else
    		writeString(id+":"+dmg+" is "+Item.itemsList[id].getLocalizedName(new ItemStack(id, 1, dmg)));
    }

    public static void writeBlock(World world, int id, int meta) {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer == null || world == null)
    		return;
    	if (id == 0)
    		writeString("Null Item");
    	else if (id > 4096)
    		writeItem(world, id, meta);
    	else
    		writeString(id+":"+meta+" is "+Block.blocksList[id].getLocalizedName());
    }

    public static void writeSide() {
		if (FMLCommonHandler.instance().getEffectiveSide() != Side.CLIENT)
			return;
    	if (Minecraft.getMinecraft().thePlayer != null)
    		Minecraft.getMinecraft().thePlayer.addChatMessage(String.valueOf(FMLCommonHandler.instance().getEffectiveSide()));
    }

}