package net.steelehook.SteeleCore.Handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

public class MessageLogging {
	
	public static void sendFromServer(String msg) {
		MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(), "/say " + msg);
	}
	
	public static void sendFromClient(EntityPlayer player, String msg) {
		player.addChatMessage(new ChatComponentText(msg));
	}
	
	public static void padBlank(EntityPlayer player, int p) {
		for (int i = 0; i < p; i++) {
			player.addChatMessage(new ChatComponentText(""));
		}
	}
	
	public static void padBlankServer(int p) {
		
		
		for (int i = 0; i < p; i++) {
			MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(), "/say -                                                    ");
		}
	
	}
	

}
