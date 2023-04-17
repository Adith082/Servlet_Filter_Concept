package com.ad;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addPerson")
public class IdFilter extends HttpFilter implements Filter {
       
  
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("id filter");
		PrintWriter out = response.getWriter();
	//	HttpServletRequest req = (HttpServletRequest) request;
		int id = Integer.parseInt(request.getParameter("id"));
		if(id>=1) {
			chain.doFilter(request, response);
		} else {
			out.println("invalid id");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
		
	}

}
