package com.virtualHRco.resumeServer.daos;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("testing")
public class InMemResumeDao implements ResumeDao {



}
