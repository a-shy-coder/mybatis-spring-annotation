package com.shy.service;

import com.shy.entity.Actor;


public interface ActorService {
    Actor getActorById(int id);
    void modifyActor(Actor actor) throws Exception;
}
