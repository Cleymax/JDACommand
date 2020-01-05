package fr.cleymax.jdacommand.command;

import fr.cleymax.jdacommand.Command;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

/**
 * File <b>PingCommand</b> located on fr.cleymax.jdacommand.command is a part of JDACommand.
 * <p>
 * Copyright (c) 2020 Cleymax.
 * <p>
 *
 * @author Clément P. (Cleymax), {@literal <contact@cleymax.fr>} Created the 05/01/2020
 */

public class BanCommand extends Command {

	public BanCommand()
	{
		super("ping", false, Permission.BAN_MEMBERS);
	}

	@Override
	protected void execute(GuildMessageReceivedEvent event, Member member, Guild guild, String[] args)
	{

	}
}
