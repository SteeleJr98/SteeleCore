package net.steelehook.SteeleCore.Handlers;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;

public class Logging {
	
	public static void writeToConsole(Level level, String msg) {
		
		msg = msg.replaceAll("%", "%%"); //do this?
		FMLLog.log(level, msg);
		
	}

}
