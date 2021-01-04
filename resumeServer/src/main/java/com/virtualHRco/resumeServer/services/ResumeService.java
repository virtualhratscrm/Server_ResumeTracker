package com.virtualHRco.resumeServer.services;


import com.virtualHRco.resumeServer.daos.ResumeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    ResumeDao dao;


    @Autowired
    public ResumeService(ResumeDao dao){
        this.dao = dao;
    }

    public <Users> List<Users> getUsers(){
        List<Users> allJobSeekers = dao.getAllJobSeekers();
        return allJobSeekers;
    }
}
