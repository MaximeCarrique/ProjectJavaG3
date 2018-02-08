package com.messaj.api.api_messaj.routes;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.messaj.api.api_messaj.dao.ServerDAO;
import com.messaj.api.api_messaj.model.ServerHeader;

@Controller
@RequestMapping("/server")
public class ServerRoute {
	
	/**
	 * Get the server that a given user can access
	 * @param usrLogin
	 * @return the list of server that user can access
	 */
	@RequestMapping(value = "/{userLogin}", method = RequestMethod.GET, 
			consumes = "application/json", produces = "application/json")
	public  @ResponseBody List<ServerHeader> getServer(@PathVariable String userLogin) {
		
		return ServerDAO.getServerByLogin(userLogin);
	}

}
