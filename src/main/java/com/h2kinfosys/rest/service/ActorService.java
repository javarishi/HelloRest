package com.h2kinfosys.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h2kinfosys.rest.dto.Actor;
import com.h2kinfosys.rest.repo.ActorRepo;

@Component
public class ActorService {
	
	@Autowired
	ActorRepo repo;

	public ActorService() {
		// TODO Auto-generated constructor stub
	}

	public List<Actor> executeGetActors() {
		// TODO Auto-generated method stub
		return null;
	}

	public Actor executeGetActor(int actorId) {
		Actor actor = repo.getById(actorId);
		return actor;
	}

}
