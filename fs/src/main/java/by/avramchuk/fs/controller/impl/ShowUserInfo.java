package by.avramchuk.fs.controller.impl;

import java.io.IOException;

import by.avramchuk.fs.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ShowUserInfo implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/pages/layouts/userInfo.jsp").forward(request, response);		
	}

}
