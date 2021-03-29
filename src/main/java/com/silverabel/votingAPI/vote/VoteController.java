package com.silverabel.votingAPI.vote;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "votes")
@CrossOrigin(origins = "http://localhost:3000")
public class VoteController {

    private RabbitTemplate rabbitTemplate;

    public VoteController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> sendVote(@RequestBody Vote vote) {
        rabbitTemplate.convertAndSend("votes", vote.getAnswer_id());

        return new ResponseEntity<>("{\"message\":\"Accepted\"}", HttpStatus.ACCEPTED);
    }
}
