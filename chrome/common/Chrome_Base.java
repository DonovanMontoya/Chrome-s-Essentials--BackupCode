package chrome.common;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.Container;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Chrome's Essentials", name = "Chrome's Essentials", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Chrome_Base {
	
	
	
	/*public void initConfiguration(FMLInitializationEvent event){
		Configuration config = new Configuration(new File("/config/Chrome's-Essentials.cfg"));
		config.load();
		ChromeIngot = config.get("Item","Chromium Ingot", "501").getInt();
		
		config.save();
	*/}
	
	//Blocks
	public static Block ChromeOre;
	int ChromeOreID = 4000;
	
	public static Block CrystalOre;
	int CrystalOreID = 4001;
	//WORK ON
	public static chrome.common.PandoraChest PandoraChest;
	Container PandoraChestID;
	
	public static Block EssenceOre;
	int EssenceOreID = 4020;
	
	
	//items
	public static Item ChromeIngot;
	public int ChromeIngotID = 4001;
	
	public static Item ChromeSword;
	public int ChromeSwordID = 4003;
	
	public static Item ChromePick;
	public int ChromePickID = 4004;
	
	public static Item MagicCrystal;
	public int MagicCrystalID = 4005;
	
	public static Block ChromeBlock;
	int ChromeBlockID = 4006;
	
	public static Item ChromeBindings;
	int ChromeBindingsID = 4007;
	
	public static Item ChromeSpade;
	int ChromeSpadeID = 4008;
	
	public static Item ChromeAxe;
	int ChromeAxeID = 4009;
	
    public static Item FlapyJaks;
	int FlapyJaksID = 4010;
	//WORK ON
	public static Item Butter;
	int ButterID = 4012;
	//WORK ON
	public static Item Syrup;
	int syrupID = 4013;
	
	public static Item Flower;
	int FlowerID = 4014;
	
	public static Item MagicCluster;
	int MagicClusterID = 4015;
	
	public static Item MagicDust;
	int MagicDustID = 4016;
	
	public static Item ChromiumRod;
	int ChromiumRodID = 4017;
	
	public static Item ChromeDust;
	int ChromeDustID = 4018;
	
	public static Item EssenceOrb;
	int EssenceOrbeID = 4019;
	
	
	
	
	
//===================================================	
	//TODO Pandora's Box.
  
//===================================================
	@EventHandler
	public void ServerStart(FMLInitializationEvent event){
//		this.initConfiguration(event);
	}
	
	
	
//===================================================	
	//Creative
	public static CreativeTabs ChromeTab = new ChromeTab("ChromeTab");
//===================================================
			//Enom Material
	public static EnumToolMaterial toolCHROME = EnumHelper.addToolMaterial("CHROME", 2, 200, 7.0F, 2.0F, 25);
//===================================================
	//Initailization
	@Init
	public void load(FMLInitializationEvent event){
		
		ChromeOre = new ChromeOre(ChromeOreID).setUnlocalizedName("ChromeOre").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		CrystalOre = new CrystalOre(CrystalOreID).setUnlocalizedName("CrystalOre").setHardness(4.5f).setResistance(50f).setStepSound(Block.soundStoneFootstep).setCreativeTab(ChromeTab);
		ChromeIngot = new ChromeIngot(ChromeIngotID).setUnlocalizedName("ChromeIngot").setCreativeTab(Chrome_Base.ChromeTab);
		ChromeSword = new ChromeSword(ChromeSwordID, toolCHROME).setUnlocalizedName("ChromeSword").setCreativeTab(Chrome_Base.ChromeTab);
	    ChromePick = new ChromePick(ChromePickID, toolCHROME).setUnlocalizedName("ChromePick");
		MagicCrystal = new MagicCrystal(MagicCrystalID).setUnlocalizedName("MagicCrystal").setCreativeTab(Chrome_Base.ChromeTab);
	    ChromeBlock = new ChromeBlock(ChromeBlockID, Material.iron).setUnlocalizedName("ChromeBlock").setHardness(4.5f).setResistance(50f).setStepSound(Block.soundStoneFootstep).setCreativeTab(Chrome_Base.ChromeTab);
	    ChromeSpade = new ChromeSpade(ChromeSpadeID, toolCHROME).setUnlocalizedName("ChromeSpade").setCreativeTab(ChromeTab);
	    ChromeAxe = new ChromeAxe(ChromeAxeID, toolCHROME).setUnlocalizedName("ChromeAxe").setCreativeTab(ChromeTab);
	    ChromeBindings = new ChromeBindings(ChromeBindingsID).setCreativeTab(ChromeTab).setUnlocalizedName("ChromeBindings");
	    FlapyJaks = new FlapyJaks(4010, 10, 0.4F, false).setCreativeTab(ChromeTab).setUnlocalizedName("FlapyJaks");
	    Flower = new Flower(FlowerID).setCreativeTab(ChromeTab).setUnlocalizedName("Flower");
	    MagicCluster = new MagicCluster(MagicClusterID).setCreativeTab(ChromeTab).setUnlocalizedName("MagicCluster");
	    MagicDust = new MagicDust(MagicDustID).setCreativeTab(ChromeTab).setUnlocalizedName("MagicDust");
	    ChromiumRod = new ChromiumRod(ChromiumRodID).setCreativeTab(ChromeTab).setUnlocalizedName("ChromiumRod");
	    ChromeDust = new ChromeDust(ChromeDustID).setCreativeTab(ChromeTab).setUnlocalizedName("ChromeDust");
	    EssenceOrb = new EssenceOrb(EssenceOrbeID).setCreativeTab(ChromeTab).setUnlocalizedName("EssenceOrb");
	    EssenceOre = new EssenceOre(EssenceOreID).setUnlocalizedName("EssenceOre").setHardness(4.5f).setResistance(50f).setStepSound(Block.soundStoneFootstep).setCreativeTab(Chrome_Base.ChromeTab);
	    Butter = new Butter(ButterID).setCreativeTab(ChromeTab).setUnlocalizedName("Butter");
	   
	    
	    
//===================================================
		//Registry/Gen/Smelt
		GameRegistry.addSmelting(ChromeOre.blockID, new ItemStack(ChromeIngot, 1),1f);
		GameRegistry.addSmelting(MagicCluster.itemID, new ItemStack(MagicDust, 1),1f);
		GameRegistry.addSmelting(ChromeIngot.itemID, new ItemStack(ChromeDust, 1),1f);
		GameRegistry.registerWorldGenerator(new World_Gen());
		GameRegistry.registerWorldGenerator(new world_gen2());
		GameRegistry.registerWorldGenerator(new world_gen3());
		
//===================================================	
		
		//Registry/Recipes
		
		GameRegistry.addRecipe(new ItemStack(ChromeBlock),
				"xxx", "xxx", "xxx",
				'x', ChromeIngot
				);
		GameRegistry.addRecipe(new ItemStack(ChromeSword),
				" x ", " x ", "bsb",
				'x', ChromeIngot, 'b', ChromeBindings, 's', Item.stick
				);
		GameRegistry.addRecipe(new ItemStack(ChromePick),
				"xxx", "bsb", "bsb",
				'x', ChromeIngot, 'b', ChromeBindings,  's', Item.stick
				);
		GameRegistry.addRecipe(new ItemStack(ChromeSpade),
				" x ", "bsb", "bsb",
				'x', ChromeIngot, 'b', ChromeBindings,  's', Item.stick
				);
		GameRegistry.addRecipe(new ItemStack(ChromeAxe),
				"xx ", "xsb", "bsb",
				'x', ChromeIngot, 'b', ChromeBindings,  's', Item.stick
				);
		GameRegistry.addRecipe(new ItemStack(ChromeBindings),
				"lxl", "lxl", "lxl",
				'x', ChromeIngot, 'l', Item.leather
				);
		GameRegistry.addRecipe(new ItemStack(FlapyJaks),
				"efe", "fwf", "fwf",
				'f', Flower, 'e', Item.egg, 'w', Item.wheat 
				);
		GameRegistry.addRecipe(new ItemStack(Flower),
				"w", 
				'w', Item.wheat 
				);
		GameRegistry.addRecipe(new ItemStack(MagicCluster),
				"ccc", "ccc", "ccc",
				'c', MagicCrystal 
				);
		GameRegistry.addRecipe(new ItemStack(ChromiumRod),
				"c", "c", "c",
				'c', ChromeIngot 
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.expBottle, 1), new Object[]{
			EssenceOrb,
			Item.glassBottle
		});
	
		
		
		
		
		
		
		
		
		
		
//===================================================		
		
		//Registry/Ore/Hardness
			
		MinecraftForge.setBlockHarvestLevel(CrystalOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(EssenceOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(ChromeOre, "pickaxe", 2);
		
		
		
		gameRegisters();
		languageRegisters();
			
	}
//===================================================
	
	
	//Registry/Item/Ore
	
	private static void gameRegisters(){
		GameRegistry.registerBlock(ChromeOre, "ChromeOre");
		GameRegistry.registerBlock(CrystalOre, "CrystalOre");
		GameRegistry.registerItem(ChromeIngot, "ChromeIngot");
		GameRegistry.registerItem(ChromeSword, "ChromeSword");
		GameRegistry.registerItem(ChromePick, "ChromePick");
		GameRegistry.registerItem(MagicCrystal, "MagicCrystal");
		GameRegistry.registerBlock(ChromeBlock, "ChromeBlock");
		GameRegistry.registerItem(ChromeSpade, "Chromespade");
		GameRegistry.registerItem(ChromeAxe, "ChromeAxe");
		GameRegistry.registerItem(ChromeBindings, "ChromeBindings");
		GameRegistry.registerItem(FlapyJaks, "FlapyJaks");
		GameRegistry.registerItem(Flower, "Flower");
		GameRegistry.registerItem(MagicCluster, "MagicCluster");
		GameRegistry.registerItem(MagicDust, "MagicDust");
		GameRegistry.registerItem(ChromiumRod, "ChromiumRod");
		GameRegistry.registerItem(ChromeDust, "ChromeDuts");
		GameRegistry.registerItem(EssenceOrb, "EssenceOrb");
		GameRegistry.registerBlock(EssenceOre, "EssenceOre");
		GameRegistry.registerItem(Butter, "Butter");
		
	}
//===================================================
	
	//Registry/Langiage/Item/Ore
	
	private static void languageRegisters(){
		LanguageRegistry.addName(ChromeOre, "Chromium Ore");
		LanguageRegistry.addName(CrystalOre, "Crystal Ore");
		LanguageRegistry.addName(ChromeIngot, "Chromium Ingot");
		LanguageRegistry.addName(ChromeSword, "Chromium Sword");
        LanguageRegistry.addName(ChromePick, "Chromium Pickaxe");
		LanguageRegistry.addName(MagicCrystal, "Magic Crystal");
		LanguageRegistry.addName(ChromeBlock, "Chromium Block");
		LanguageRegistry.addName(ChromeSpade, "Chromium Shovel");
		LanguageRegistry.addName(ChromeAxe, "Chromium Axe");
		LanguageRegistry.addName(ChromeBindings, "Chromium Bindings");
		LanguageRegistry.addName(FlapyJaks, "FlapyJacks");
		LanguageRegistry.addName(Flower, "Flower");
		LanguageRegistry.addName(MagicCluster, "Magic Cluster");
		LanguageRegistry.addName(MagicDust, "MagicDust");
		LanguageRegistry.addName(ChromiumRod, "Chromium Rod");
		LanguageRegistry.addName(ChromeDust, "Chromium Dust");
		LanguageRegistry.addName(EssenceOrb, "Essence Orb");
		LanguageRegistry.addName(EssenceOre, "Essence Infused Ore");
		LanguageRegistry.addName(Butter, "Butter");
		
		
//===================================================		
		//Registry/Creative/Tab
		LanguageRegistry.instance().addStringLocalization("itemGroup.ChromeTab", "en_US", "Chrome's Essentials");
	}
	
}
