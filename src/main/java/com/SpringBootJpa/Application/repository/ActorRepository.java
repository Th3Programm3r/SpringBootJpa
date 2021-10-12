package com.SpringBootJpa.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJpa.Application.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer>{

}
