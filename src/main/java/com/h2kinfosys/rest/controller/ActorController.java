package com.h2kinfosys.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2kinfosys.rest.dto.Actor;
import com.h2kinfosys.rest.service.ActorService;

@RestController
public class ActorController {
	
	@Autowired
	ActorService actorService;

	@GetMapping(path = "/actors")
	public List<Actor> getActors() {
		List<Actor> actors = actorService.executeGetActors();
		return actors;
	}
	
	@GetMapping(path = "/actor")
	public  @ResponseBody Actor getActor(int actorId) {
		Actor actor = actorService.executeGetActor(actorId);
		return actor;
	}
	


}
