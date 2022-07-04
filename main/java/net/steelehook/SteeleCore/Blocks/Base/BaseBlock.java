package net.steelehook.SteeleCore.Blocks.Base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.steelehook.SteeleCore.SteeleCore;
import net.steelehook.SteeleCore.Handlers.NameHandling;

public class BaseBlock extends Block{

	public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
	
	
	public BaseBlock(String unlocalizedName, String modID) {
		
		
		
		this(NameHandling.retroNameFormatter(unlocalizedName, modID), Material.rock, 3F, 5F);
		//this(NameHandling.retroNameFormatter("", modID) //Generalize for base tab
	}
	
	

	

	
	
	@Override
    public String getUnlocalizedName() {
        return String.format("tile.%s", getUnwrappedLocalizedNAme(super.getUnlocalizedName()));
    }

    protected String getUnwrappedLocalizedNAme(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedLocalizedNAme(this.getUnlocalizedName())));
    }

}
