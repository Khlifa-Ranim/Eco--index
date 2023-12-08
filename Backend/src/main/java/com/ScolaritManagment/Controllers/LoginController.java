package com.ScolaritManagment.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ScolaritManagment.Services.loginService;
import com.ScolaritManagment.entites.Login;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Objects;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
	
    @Autowired

	private loginService serviceLogin;
	
	
	
    public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/login")

	public ModelAndView login ()
	{
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;

	}
    
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Login user) {
	    Login oauthUser = serviceLogin.login(user.getNom(), user.getPassword());
	    if (Objects.nonNull(oauthUser)) {
	        // Return a proper JSON response
	        return ResponseEntity.ok(oauthUser);
	    } else {
	        // Return an appropriate error response
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        
	    }
	}

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    	
        return "redirect:/login";

    }


}
