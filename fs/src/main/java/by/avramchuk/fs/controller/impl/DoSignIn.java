package by.avramchuk.fs.controller.impl;

import java.io.IOException;

import by.avramchuk.fs.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoSignIn implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/pages/layouts/privateAccount.jsp").forward(request, response);		
	}

}
