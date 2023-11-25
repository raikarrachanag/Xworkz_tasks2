package com.xworkz.mock;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(urlPatterns = "/check",loadOnStartup = 6)
	public class FormServlet extends HttpServlet{
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String slno = req.getParameter("SlNo");
			String fname = req.getParameter("FName");
			String lname = req.getParameter("LName");
			String mname = req.getParameter("MName");
			String email = req.getParameter("Email");
			String gender = req.getParameter("Gender");
			String contactno = req.getParameter("ContactNo");
			String area = req.getParameter("Area");
			String district = req.getParameter("District");
			String state = req.getParameter("State");
			String pincode = req.getParameter("Pincode");
			
			
			FormDTO dto=new FormDTO(slno, fname, lname, mname, email, gender, contactno, area, district, state, pincode);
			
			req.setAttribute("dto", dto);
			RequestDispatcher dispatcher = req.getRequestDispatcher("FormSuccess.jsp");
			dispatcher.forward(req, resp);
			
		}

	}


