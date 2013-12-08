package chrome.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FlapyJaks extends ItemFood{
	public FlapyJaks(int id, int hunger, float saturation, boolean wolfFood) {
		super(id, hunger, saturation, wolfFood);
	
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
	this.itemIcon = reg.registerIcon("chrome_mods:flapyjaks");
}
}