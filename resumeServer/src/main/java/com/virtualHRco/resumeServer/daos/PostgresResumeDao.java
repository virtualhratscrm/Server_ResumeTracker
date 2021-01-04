package com.virtualHRco.resumeServer.daos;

import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"production", "daotesting"})
public class PostgresResumeDao implements ResumeDao{

    @Autowired
    private JdbcTemplate template;

    /// get all
    /// get one by id
    /// create job seeker
    /// edit job seeker
    /// remove job seeker

}
