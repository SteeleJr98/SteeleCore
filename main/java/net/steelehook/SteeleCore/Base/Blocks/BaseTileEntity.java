package net.steelehook.SteeleCore.Base.Blocks;

import net.minecraft.tileentity.TileEntity;

public class BaseTileEntity extends TileEntity {
	
	public void finishUpdate() {
		BaseBlock myBlock = (BaseBlock)(this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord));
		worldObj.notifyBlockOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, myBlock);
		markDirty();
	}

}
