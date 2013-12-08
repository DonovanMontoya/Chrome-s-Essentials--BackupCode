package chrome.common;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;

public class EssenceOre extends BlockOre{
	public EssenceOre(int par1) {
		super(par1);

	}

	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("Chrome_Mods:essenceore");
}
public int idDropped(int i, Random rand, int j){
  return Chrome_Base.EssenceOrb.itemID;
  }

public int quantityDropped(Random rand){
		return rand.nextInt(3) + 1;
}
}

