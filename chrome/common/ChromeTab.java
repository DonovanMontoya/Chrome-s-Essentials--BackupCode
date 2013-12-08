package chrome.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ChromeTab extends CreativeTabs {

	public ChromeTab(String label) {
		super(label);

	}

	public ItemStack getIconItemStack(){
	return new ItemStack(Chrome_Base.ChromeIngot);
	
	
	}
	
}
