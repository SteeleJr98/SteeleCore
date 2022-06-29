package net.steelehook.SteeleCore.Handlers;

public class NameHandling {
	
	public static String retroNameFormatter(String unlocName, String modID) {
		String retroName = modID.toLowerCase() + ":" + unlocName;
		return retroName;
	}

}
