package com.OceanusFigma.OceanusFigma.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OceanusFigma.OceanusFigma.DTO.LoginDTO;
import com.OceanusFigma.OceanusFigma.DTO.LoginResponseDTO;
import com.OceanusFigma.OceanusFigma.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping(value = "/login",consumes = "application/json") 
	public LoginResponseDTO loginRespo(@RequestBody LoginDTO loginDTO)
	{
		return  loginService.loginResponse(loginDTO);
			
	}
}
