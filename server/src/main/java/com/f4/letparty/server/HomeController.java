/*
 * Copyright 2010-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f4.letparty.server;
import com.f4.letparty.server.model.*;
import com.f4.letparty.server.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Handles requests for the application home page.
 *
 * @author Roy Clarkson
 */
@Controller
@RequestMapping("/*")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;
	@Autowired
	private InvitationRepository invitationRepository;
	@Autowired
	private Guest_ListRepository guest_listRepository;
	@Autowired
	private Friend_ListRepository friend_listRepository;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Spring Android Basic Auth");
		return "home";
	}*/

	@RequestMapping(value = "/get_list_friend", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<User> getListFriend(@RequestParam(value = "id") int id) {
		logger.info("Getting list of friends");
		List<User> ls = new ArrayList<User>();
		System.out.println(id);
		//ls = friend_listRepository.f;
		return ls;
	}

	@RequestMapping(value = "/get_location", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<Location> getListLocation() {
		logger.info("Getting list of locations");
		List<Location> ls = new ArrayList<Location>();
		//ls.add(new Location());
		//ls.add(new Location());

		return ls;
	}

	@RequestMapping(value = "/get_invitation", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<Invitation> getListInvitation() {
		logger.info("Getting list of invitation");
		List<Invitation> ls = new ArrayList<Invitation>();
		//ls.add(new Invitation());
		//ls.add(new Invitation());

		return ls;
	}



	@RequestMapping(value = "/invite", method = RequestMethod.POST)
	public @ResponseBody
	String invite(@RequestBody Invitation invitation) {
		System.out.println(invitation);

		return null;
	}

	@RequestMapping(value = "/is_accepted", method = RequestMethod.POST)
	public @ResponseBody
	String invite(@RequestBody Guest_List glist) {
		System.out.println(glist);

		return null;
	}

}
