package org.example.springbootfoofighters.rabbitmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springbootfoofighters.DTO.UserDTO;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMessageSender {

    private final RabbitTemplate rabbitTemplate ;

    @Bean
    public Queue queue() {
        return new Queue("myQueue", false);

    }

//     public void send(UserDTO userDTO) {
//          rabbitTemplate.convertAndSend("myQueue", userDTO);
//
//          log.info("Message sent to queue: {}", userDTO);
//        }
public void send(UserDTO userDTO) {
    rabbitTemplate.convertAndSend("myQueue", userDTO);

    log.info("Message sent to queue: {}", userDTO);
}

}

