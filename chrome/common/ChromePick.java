package chrome.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ChromePick extends ItemPickaxe{
	public ChromePick(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		this.setCreativeTab(Chrome_Base.ChromeTab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("chrome_mods:chrome_pick");
	}
}
