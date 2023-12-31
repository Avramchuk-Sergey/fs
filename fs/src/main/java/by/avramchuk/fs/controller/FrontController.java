package by.avramchuk.fs.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private final CommandProvider commandProvider = new CommandProvider();
	
	public FrontController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String commandName = request.getParameter("command");
		Command command = commandProvider.getCommand(commandName);
		command.execute(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}

}
