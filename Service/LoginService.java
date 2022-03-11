package com.OceanusFigma.OceanusFigma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.OceanusFigma.OceanusFigma.DTO.LoginDTO;
import com.OceanusFigma.OceanusFigma.DTO.LoginResponseDTO;
import com.OceanusFigma.OceanusFigma.Model.LoginUser;
import com.OceanusFigma.OceanusFigma.Repository.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo loginrepo;
	
	public LoginResponseDTO loginResponse( LoginDTO loginDTO)
	{
		LoginResponseDTO loginResponse=new LoginResponseDTO();
		String emailid=loginDTO.getEmailid();
		String password=loginDTO.getPassword();
		
		LoginUser logUser=loginrepo.findByemailid(emailid);
		String passwordDB=logUser.getPassword();
	String emailDB=logUser.getEmailid();
	
	  if(emailid==null) {
		  loginResponse.setMessage("User not found");
	  loginResponse.setStatus(404); 
	  }
	 
	  if(password.equals(passwordDB)&&emailid.equals(emailDB)) {
	  loginResponse.setMessage("Successfully logged in");
	  loginResponse.setStatus(200); 
	  } 
	  else if(!password.equals(passwordDB)&&emailid.equals(emailDB)) {
	  loginResponse.setMessage("Incorrect password"); loginResponse.setStatus(401);
	  
	  } 
	  else { 
		  loginResponse.setMessage("Internal Server Error");
	  loginResponse.setStatus(500);
	
	  }
		return loginResponse;
	}

}
