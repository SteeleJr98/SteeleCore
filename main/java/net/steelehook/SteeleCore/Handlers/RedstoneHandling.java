package net.steelehook.SteeleCore.Handlers;

import net.minecraft.world.World;

public class RedstoneHandling {
	
	public static boolean checkIfPowered(World world, int x, int y, int z) {
		return world.isBlockIndirectlyGettingPowered(x, y, z);	
	}
	
	public static boolean stateToggler(World world, int x, int y, int z, boolean poweredState) {
		
		if (checkIfPowered(world, x, y, z) && !poweredState) {
			return true;
		}
		
		if (!checkIfPowered(world, x, y, z) && poweredState) {
			return false;
		}
		
		else {
			return false;
		}
	}

}
