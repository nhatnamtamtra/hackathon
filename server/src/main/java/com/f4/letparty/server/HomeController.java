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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
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

	@Autowired
	EntityManager em;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Spring Android Basic Auth");
		return "home";
	}*/
	//Format: /get_list_friend?id=...
	@RequestMapping(value = "/get_list_friend", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<Friend_List> getListFriend(@RequestParam(value = "id") Integer id) {
		logger.info("Getting list of friends");
		List<Friend_List> ls = new ArrayList<Friend_List>();
		//System.out.println(id);
		ls = (List<Friend_List>)friend_listRepository.findById(id);
		return ls;
	}

	@RequestMapping(value = "/get_location", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<Location> getListLocation(@RequestParam(value = "id") int id) {
		logger.info("Getting list of locations");
		List<Location> ls = new ArrayList<Location>();
		ls = (List<Location>) locationRepository.findById(id);

		return ls;
	}
	//Invitation List User_id created
	@RequestMapping(value = "/get_invitation", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<Invitation> getListInvitation(@RequestParam(value = "id") int id) {
		logger.info("Getting list of invitation");
		List<Invitation> ls = new ArrayList<Invitation>();
		ls = (List<Invitation>) invitationRepository.findById(id);

		return ls;
	}

	@RequestMapping(value = "/get_invited_you", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<Invitation> getListInvitedYou(@RequestParam(value = "id") int id) {
		logger.info("Getting list of invitation");
		List<Invitation> ls = new ArrayList<Invitation>();
		ls = (List<Invitation>) invitationRepository.findInvitedYouById(id);

		return ls;
	}

    //Send list guest to host
	@RequestMapping(value = "/get_guest", method = RequestMethod.GET)
	public @ResponseBody
	List<Guest_List> getListGuest(@RequestParam(value = "id") int id) {
		//System.out.println(invitation);
		List<Guest_List> ls = new ArrayList<Guest_List>();
		ls = (List<Guest_List>) guest_listRepository.findById(id);

		return ls;
	}

	//Send list guest to host
	@RequestMapping(value = "/invitation", method = RequestMethod.POST)
	public @ResponseBody
	List<Guest_List> invite(@RequestParam(value = "host_id") int id,
							@RequestParam(value = "location_id") int location_id,
							@RequestParam(value = "time") String time
							) {
		//System.out.println(invitation);
		Invitation invatation= new Invitation(0, id, location_id, "fgd");
		invitationRepository.save(invatation);

		return null;
	}

	@RequestMapping(value = "/invite_guest", method = RequestMethod.POST)
	public @ResponseBody
	List<Guest_List> invite_guest(@RequestParam(value = "invitation") int id,
								  @RequestParam(value = "guest") int guest
	) {
		//System.out.println(invitation);
		Guest_List gl= new Guest_List(new GuestListPK(id, guest), "0");
		guest_listRepository.save(gl);

		return null;
	}

	//Guest accept invitation
	@RequestMapping(value = "/get_accepted", method = RequestMethod.GET)
	public @ResponseBody
	List<Guest_List> getGuestAccepted(@RequestParam(value = "id") int id) {
		//System.out.println(invitation);
		List<Guest_List> ls = new ArrayList<Guest_List>();
		ls = (List<Guest_List>) guest_listRepository.findAcceptedById(id);

		return ls;
	}

	@RequestMapping(value = "/is_accepted", method = RequestMethod.POST)
	public @ResponseBody
	String accepted(@RequestParam(value = "invitation_id") Integer invitation_id,
					@RequestParam(value = "guest_id") Integer guest_id,
					@RequestParam(value = "is_accepted") String is_accepted
					)  {
        Guest_List gl = new Guest_List(new GuestListPK(invitation_id, guest_id), is_accepted);
		guest_listRepository.save(gl);
		return null;
	}

}
