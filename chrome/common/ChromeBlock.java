package chrome.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ChromeBlock extends Block {

	public ChromeBlock(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister reg){
			this.blockIcon = reg.registerIcon("chrome_mods:chromeblock");
	}

}
