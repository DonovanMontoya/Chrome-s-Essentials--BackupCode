package chrome.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CrystalOre extends BlockOre{

	public CrystalOre(int par1) {
		super(par1);

	}

@Override
public void registerIcons(IconRegister reg){
	this.blockIcon = reg.registerIcon("Chrome_Mods:crystalore");
}
public int idDropped(int i, Random rand, int j){
  return Chrome_Base.MagicCrystal.itemID;
  }

public int quantityDropped(Random rand){
		return rand.nextInt(3) + 1;
}
}