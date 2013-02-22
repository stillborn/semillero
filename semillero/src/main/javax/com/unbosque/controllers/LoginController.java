package com.unbosque.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	  protected final Log logger = LogFactory.getLog(getClass());

	    @RequestMapping(value="/login")
	    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	
	        logger.info("Returning hello view");
	
	        return new ModelAndView("views/login/index.html");
	    }
}
