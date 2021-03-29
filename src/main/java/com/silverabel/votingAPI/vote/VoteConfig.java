package com.silverabel.votingAPI.vote;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoteConfig {

    @Bean
    Queue queue() {
        return new Queue("votes", true);
    }
}
