package chrome.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ChromeDust extends Item{

	public ChromeDust(int par1) {
		super(par1);

	}
	
	
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("chrome_mods:Chrome_dust");
	

}
}