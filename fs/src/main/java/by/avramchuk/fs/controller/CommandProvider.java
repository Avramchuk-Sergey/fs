package by.avramchuk.fs.controller;

import java.util.HashMap;
import java.util.Map;

import by.avramchuk.fs.controller.impl.GoToBasePage;

public class CommandProvider {
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.GO_TO_BASE_PAGE, new GoToBasePage());
	}
	
	public Command getCommand (String name) {
		
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}
}
