package com.ad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class NickNameFilter
 */
@WebFilter("/addPerson")
public class NickNameFilter extends HttpFilter implements Filter {
       
   
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		 System.out.println("filter nickname");
		PrintWriter out = response.getWriter();
		//	HttpServletRequest req = (HttpServletRequest) request;
			String  nickname = request.getParameter("nickname");
			if(nickname.length()>=3) {
				chain.doFilter(request, response);
			} else {
				out.println("invalid name");
			}
			
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
