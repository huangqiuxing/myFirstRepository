package com.hqx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hqx.entity.PhoneNumberModel;
import com.hqx.entity.User;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String message, HttpServletRequest request) {
		request.setAttribute("message", message);
		//返回到hello页面
		return "hello";
	}

	@RequestMapping("/myConverter")
	public String myConverter(@RequestParam PhoneNumberModel phoneNumberModel, HttpServletRequest request) {
		request.setAttribute("phoneNumberModel", phoneNumberModel);
		System.out.println(phoneNumberModel);
		return "hello";
	}

	@RequestMapping("/myFormatter")
	public String myFormatter(@RequestParam("model") PhoneNumberModel model, HttpServletRequest request) {
		request.setAttribute("model", model);
		return "success";
	}
	
	@RequestMapping("/myFormatter2")
	public String myFormatter2(@Valid @ModelAttribute("user") User user, Errors errors) {  //@Valid声明这里要验证
		//String username = request.getParameter("username");
		//System.out.println(username);
		/* request.setAttribute("user", user); */
		if(errors.hasErrors()) {  
			return "errors";
		}
		System.out.println(user);
		return "success";
		
	}
}
