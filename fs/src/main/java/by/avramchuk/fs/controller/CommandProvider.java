package by.avramchuk.fs.controller;

import java.util.HashMap;
import java.util.Map;

import by.avramchuk.fs.controller.impl.ConfirmRegistration;
import by.avramchuk.fs.controller.impl.DoRegistration;
import by.avramchuk.fs.controller.impl.DoSearch;
import by.avramchuk.fs.controller.impl.DoSignIn;
import by.avramchuk.fs.controller.impl.GoToBasePage;
import by.avramchuk.fs.controller.impl.GoToUserProfile;

public class CommandProvider {
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.GO_TO_BASE_PAGE, new GoToBasePage());
		commands.put(CommandName.DO_SIGN_IN, new DoSignIn());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		commands.put(CommandName.DO_SEARCH, new DoSearch());
		commands.put(CommandName.CONFIRM_REGISTRATION,new ConfirmRegistration());
		commands.put(CommandName.GO_TO_USER_PROFILE, new GoToUserProfile());
	}
	
	public Command getCommand (String name) {
		
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}
}
