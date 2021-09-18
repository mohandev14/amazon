package com.spring.Amazon.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AmazonloginPage
{
	@RequestMapping("mom")
	public String amazon()
	{
		return "Amazon.jsp";
		//System.err.println("hello");
	}
   
}
