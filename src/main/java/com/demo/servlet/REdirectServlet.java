
package com.demo.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * Servlet implementation class REdirectServlet
 */
@WebServlet(name = "RedirectServlet", urlPatterns = { "/RedirectServlet" })
public class REdirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public REdirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //Request headers
		Enumeration<String> headerNames = request.getHeaderNames();
		//Iterator<String> asIterator = headerNames.asIterator();
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			System.out.println(headerName+" "+request.getHeader(headerName));
		}
		//Some other information from request
		System.out.println("locale "+request.getLocale());
		System.out.println("method "+request.getMethod());
		System.out.println("AuthType "+request.getAuthType());
		System.out.println("ContextPath "+request.getContextPath());
		System.out.println("ContentType "+request.getContentType());
		System.out.println("LocalAddr "+request.getLocalAddr());
		System.out.println("LocalName "+request.getLocalName());
		System.out.println("localPort "+request.getLocalPort());
		//System.out.println("Cookies "+request.getCookies());
		System.out.println("Protocol "+request.getProtocol());
		System.out.println("QueryString "+request.getQueryString());
		System.out.println("PathInfo "+request.getPathInfo());
		System.out.println("RemoteHost "+request.getRemoteHost());
		System.out.println("RemotePort "+request.getRemotePort());
		System.out.println("RemoteUser "+request.getRemoteUser());
		System.out.println("RequestURI "+request.getRequestURI());
		System.out.println("UserPrincipal "+request.getUserPrincipal());
		System.out.println("TrailerFields "+request.getTrailerFields());
		System.out.println("ServletContext "+request.getServletContext());
		System.out.println("About Cookies");
		Cookie[] cookies = request.getCookies();
		System.out.println(cookies.length);
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getComment());
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getMaxAge());
			System.out.println(cookie.getName());
			System.out.println(cookie.getPath());
			System.out.println(cookie.getSecure());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getVersion());
			
		}
		System.out.println("About Session********");
		HttpSession session = request.getSession();
		System.out.println(session.getCreationTime());
		System.out.println(session.getId());
		System.out.println(session.getLastAccessedTime());
		System.out.println(session.getMaxInactiveInterval());
		System.out.println(session.isNew());
		System.out.println("Servlet Context");
	//	HttpSessionContext sessionContext = session.getSessionContext();
		ServletContext servletContext = session.getServletContext();
		System.out.println(servletContext.getContextPath());
		System.out.println(servletContext.getEffectiveMajorVersion());
		System.out.println(servletContext.getSessionTimeout());
		String url="https://www.google.com/";
		response.sendRedirect(url);
	}

}
