package com.sstapp.config;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class JwtSessionFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String uri = request.getRequestURI();

		if (uri.equals("/login") || uri.equals("/register") || uri.startsWith("/api/auth")) {
			filterChain.doFilter(request, response);
			return;
		}

		if (request.getSession().getAttribute("JWT") == null) {
			response.sendRedirect("/login");
			return;
		}

		filterChain.doFilter(request, response);
	}
}