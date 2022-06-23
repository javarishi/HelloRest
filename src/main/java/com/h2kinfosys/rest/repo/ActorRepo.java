package com.h2kinfosys.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2kinfosys.rest.dto.Actor;

public interface ActorRepo extends JpaRepository<Actor, Integer> {

}
