package com.example.enumstatemachina.controller;

import com.example.enumstatemachina.service.StateMachine;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/state-machina")
public class Controller {

    private final StateMachine stateMachine;

    public Controller(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @GetMapping("getStatus")
    public ResponseEntity<String> getStatus() {

        return new ResponseEntity<>(stateMachine.getStatus().toString(), HttpStatus.OK);
    }

    @GetMapping("nextStatus")
    public ResponseEntity<String> nextStatus() {

        return new ResponseEntity<>(stateMachine.nextStatus().toString(), HttpStatus.OK);

    }
}
