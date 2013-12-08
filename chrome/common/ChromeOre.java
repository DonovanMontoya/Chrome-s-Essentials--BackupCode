package chrome.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ChromeOre extends BlockOre{

	public ChromeOre(int par1){
		super(par1);
		this.setCreativeTab(Chrome_Base.ChromeTab);
	}
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("chrome_mods:chromeore");
	}
}
