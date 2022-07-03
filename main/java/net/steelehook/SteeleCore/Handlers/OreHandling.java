package net.steelehook.SteeleCore.Handlers;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreHandling {
	
	public static ArrayList <ItemStack> allOre = new ArrayList();
	
	public static ArrayList makeList() {
		
		for (String n : OreDictionary.getOreNames()) { //This is for another git test
			if (n.contains("ore")) {
			//if (n.startsWith("ore")) {
				
				allOre.addAll(OreDictionary.getOres(n));
				
				
			}
		}
		
		ItemStack testStack = new ItemStack(Item.getItemFromBlock(Blocks.quartz_ore));
		
		allOre.add(testStack); //Add Nether Quartz to list
		
		return allOre;
	}
	
	public static boolean compToList(Block block) {
		
		ItemStack ti = new ItemStack(Item.getItemFromBlock(block));
		
		
		
		for (ItemStack i : allOre) {
			if (i.getItem() == ti.getItem()) {
				return true;
			}
		}
		
		return false;
		
		
		
		//return allOre.contains(block.getUnlocalizedName().substring(5));
		
	}
	
	

	
	
	
	

}
