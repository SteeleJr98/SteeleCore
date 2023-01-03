package net.steelehook.SteeleCore;

import net.steelehook.SteeleCore.Handlers.Logging;
import net.steelehook.SteeleCore.Handlers.OreHandling;
import net.steelehook.SteeleCore.Proxy.IProxy;
import net.minecraft.init.Blocks;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = SteeleCore.NAME, modid = SteeleCore.MODID, acceptedMinecraftVersions = "1.7.10"/*, dependencies = SteeleCore.DEPS*/)
public class SteeleCore
{
	public static final String NAME = "SteeleCore";
    public static final String MODID = "stcore170";
//    public static final String VERSION = "1.0.0"; //Defaults to version found in mcmod.info file
    //public static final String DEPS = "required-after:Forge@[10.13.4.1614,)";
    
    public static final String CLIENT_PROXY_CLASS = "net.steelehook.SteeleCore.Proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.steelehook.SteeleCore.Proxy.ServerProxy";
    
    @Mod.Instance(SteeleCore.MODID)
    public static SteeleCore instance = new SteeleCore();
    
    @SidedProxy(clientSide = SteeleCore.CLIENT_PROXY_CLASS, serverSide = SteeleCore.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    
    @EventHandler
    public void init(FMLPreInitializationEvent event) {
    	Logging.writeToConsole(Level.INFO, "PreInit Started");
    	
    	
    	
    	Logging.writeToConsole(Level.INFO, "from core mod");
    	
    	Logging.writeToConsole(Level.INFO, "PreInit Ended");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	Logging.writeToConsole(Level.INFO, "Init Started");
    	
    	Logging.writeToConsole(Level.INFO, "Init Ended");	
    }
    
    @EventHandler
    public void init(FMLPostInitializationEvent event) {
    	Logging.writeToConsole(Level.INFO, "PostInit Started");
    	
    	OreHandling.makeList();
    	
    	Logging.writeToConsole(Level.INFO, "PostInit Ended");
    }
}
