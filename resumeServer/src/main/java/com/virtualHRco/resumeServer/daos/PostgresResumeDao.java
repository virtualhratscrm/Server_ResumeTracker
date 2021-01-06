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

    /// get all - login to use
    /// get one by id - login to use
    /// create job seeker - info from react form page
    /// edit job seeker - Admin login to use
    /// remove job seeker - Admin login to use

}
