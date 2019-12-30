package com.sergiorosa.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeerController 
{
	@RequestMapping("/beer/novo")
	public String novo()
	{
		return "beer/BeerRegister";
	}

}
