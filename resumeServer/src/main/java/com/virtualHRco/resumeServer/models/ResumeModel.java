package com.virtualHRco.resumeServer.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor; // lombok an all args constructor built
import lombok.Data; // lombok all getters and setters made
import lombok.NoArgsConstructor; // lombok a no args constructor built
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity // JPA - annotation used to indicate that the class is a JPA entity class!
@Data // Lombok annotation tells it to create all getters and setters
@AllArgsConstructor // Lombok annotation to create constructor with all args
@NoArgsConstructor // Lombok annotation to create no-args constructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ResumeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    /// only numbers and ( ) -

    private String phoneNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    /// number or number-number

    private String positions;
    // an array?

    private String resume;
    private String authorized;
    private String education;
    private String experience;
    private String salary;
    private String salaryType;
    private String availability;
    // an array?

    private Date date;


    //// info not in form but needed in db
    /// working with recruiter x
    /// resume sent to
    /// follow up email sent
    /// notes section
    /// in progress / background check yes/no .... 


}
