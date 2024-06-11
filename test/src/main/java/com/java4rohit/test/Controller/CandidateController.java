package com.java4rohit.test.Controller;

import com.java4rohit.test.entities.Candidate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate/v1")
public class CandidateController {



    @PostMapping("/create")
    public ResponseEntity<Candidate>  addCandiate(@RequestBody Candidate candidate){

        Candidate candidate1 = new Candidate();
        candidate1.setId("1");
        candidate1.setFirstName("Rohit");
        candidate1.setLastName("yadav");

        return new ResponseEntity<>(candidate1,HttpStatus.CREATED);

    }



}
