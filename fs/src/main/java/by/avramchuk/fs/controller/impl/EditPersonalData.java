package by.avramchuk.fs.controller.impl;

import java.io.IOException;

import by.avramchuk.fs.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditPersonalData implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/pages/layouts/personalInfo.jsp").forward(request, response);	
	}

}
