package com.javainuse.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
	@RequestMapping(value = {"/**{[path:[^\\.]*}" , "/"})
	public void redirect(HttpServletResponse response, HttpServletRequest request) throws IOException {
		request.getSession().setAttribute("adminsession_id", null);
		request.getSession().setAttribute("session_id", null);
	    response.sendRedirect("/login");
	}
}
