package com.gaminghub.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
	
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	@GetMapping("/cart")
	public String cart(Model model) {
	  logger.info("./cart endpoint was called");
	  
	  model.addAttribute("cartCount", 0); // replace with real count
	  return "cart"; 
  	}
}
