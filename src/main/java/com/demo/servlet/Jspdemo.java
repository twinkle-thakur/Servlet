package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jspdemo
 */
@WebServlet("/Jspdemo")
public class Jspdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jspdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		if(name!=null) {
			request.setAttribute("username", name);
			List<String> list=new ArrayList<>();
			list.add("Twinkle");
			list.add("Kartik");
			request.setAttribute("AL", list);
			Map<Integer,String> map=new HashMap<>();
			map.put(1, "Twinkle");
			map.put(2, "Chirag");
			request.setAttribute("MAP", map);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
	}

}
