package fr.cleymax.jdacommand;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * File <b>CommandManager</b> located on fr.cleymax.jdacommand is a part of JDACommand.
 * <p>
 * Copyright (c) 2020 Cleymax.
 * <p>
 *
 * @author Clément P. (Cleymax), {@literal <contact@cleymax.fr>} Created the 05/01/2020
 */

public class CommandManager extends ListenerAdapter {

	private List<Command> commands;

	public CommandManager()
	{
		this.commands = new ArrayList<>();
	}

	public void registerCommand(Command... commands)
	{
		this.commands.addAll(Arrays.asList(commands));
	}

	@Override
	public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event)
	{
		if (event.getAuthor().isBot() || event.getAuthor().isFake())
			return;
		String message = event.getMessage().getContentRaw();
		if (message.startsWith("!"))
		{
			ArrayList<String> split = new ArrayList<>(Arrays.asList(message.substring(1).split(" ")));
			this.commands.stream().filter(command -> command.getName().equalsIgnoreCase(split.get(0)) || Arrays.stream(command.getAliases()).collect(Collectors.toList()).contains(split.get(0))).forEach(command -> command.execute(event, event.getMember(), event.getGuild(),new String[split.size() - 1]));
		}
	}
}
