package fr.cleymax.jdacommand;

import fr.cleymax.jdacommand.command.BanCommand;

/**
 * File <b>Main</b> located on fr.cleymax.jdacommand is a part of JDACommand.
 * <p>
 * Copyright (c) 2020 Cleymax.
 * <p>
 *
 * @author Clément P. (Cleymax), {@literal <contact@cleymax.fr>} Created the 05/01/2020
 */

public class Main {

	public Main()
	{
		final CommandManager commandManager = new CommandManager();
		commandManager.registerCommand(new BanCommand());
	}

	public static void main(String[] args)
	{
		new Main();
	}
}
