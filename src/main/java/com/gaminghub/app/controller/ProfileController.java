package com.gaminghub.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);
	
  @GetMapping("/profile")
  public String profile(Model model) {
	  
	  logger.info("./profile endpoint was called");
	  
     //model.addAttribute("user", userService.getCurrent());  //these are used for Auth
     //model.addAttribute("paymentMethods", paymentService.listForUser()); //These is used for auth
    model.addAttribute("cartCount", 0);
    return "profile";
  }
}
