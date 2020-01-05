package fr.cleymax.jdacommand;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

/**
 * File <b>Command</b> located on fr.cleymax.jdacommand is a part of JDACommand.
 * <p>
 * Copyright (c) 2020 Cleymax.
 * <p>
 *
 * @author Clément P. (Cleymax), {@literal <contact@cleymax.fr>} Created the 05/01/2020
 */

public abstract class Command {

	private String     name;
	private boolean    onlyOwner;
	private Permission permission;

	public Command(String name)
	{
		this(name, false, null);
	}

	public Command(String name, boolean onlyOwner, Permission permission)
	{
		this.name = name;
		this.onlyOwner = onlyOwner;
		this.permission = permission;
	}

	protected abstract void execute(GuildMessageReceivedEvent event, Member member, Guild guild, String[] args);

	public String[] getAliases()
	{
		return new String[0];
	}

	public String getName()
	{
		return this.name;
	}

	public boolean isOnlyOwner()
	{
		return this.onlyOwner;
	}

	public Permission getPermission()
	{
		return this.permission;
	}
}
