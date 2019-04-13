package com.example.bookpub.controllerO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TeamController {

    @GetMapping(value = "/teams")
    public ResponseEntity<?> getTeams() {

        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
