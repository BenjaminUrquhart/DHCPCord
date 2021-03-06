package net.arptell.dhcpcord.util;

import net.dv8tion.jda.api.EmbedBuilder;

public class HTMLParser {
	
	public static EmbedBuilder parseHTML(String html) {
		EmbedBuilder eb = new EmbedBuilder();
		if(html.contains("<title>") && html.contains("</title>") && html.indexOf("<title>") < html.indexOf("</title>")) {
			eb.setTitle(html.split("<title>")[1].split("</title>")[0]);
		}
		else {
			eb.setTitle("<no title given>");
		}
		return eb;
	}
}
