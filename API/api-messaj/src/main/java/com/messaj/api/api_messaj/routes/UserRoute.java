package com.messaj.api.api_messaj.routes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.messaj.api.api_messaj.dao.ServerDAO;
import com.messaj.api.api_messaj.dao.UserDAO;
import com.messaj.api.api_messaj.model.User;

@Controller
@RequestMapping("/user")
public class UserRoute {
	/**
	 * User creation route
	 * 
	 * @param body
	 * @return a boolean that tells if the user has been created correctly
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, Object> CreateUser(@RequestBody Map<String, Object> body) {

		User usr = new User(body.get("login").toString(), body.get("password").toString());
		Map<String, Object> result = new HashMap<>();
		result.put("inserted", UserDAO.InsertUser(usr));
		return result;

	}

	/**
	 * Login route
	 * 
	 * @param body
	 * @return a boolean that says if the user can login or not
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")

	public @ResponseBody Map<String, Object> LoginUser(@RequestBody Map<String, Object> body) {
		
		User usr = new User(body.get("login").toString(), body.get("password").toString());
		Map<String, Object> result = new HashMap<>();
		result.put("loginOk", UserDAO.LoginUser(usr));
		result.put("servers", ServerDAO.getServerByLogin(usr.getLogin()));
		return result;
	}

}
