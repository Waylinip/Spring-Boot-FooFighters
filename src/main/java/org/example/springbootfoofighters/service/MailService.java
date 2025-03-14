package org.example.springbootfoofighters.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.client.MailSenderClient;
import org.example.springbootfoofighters.client.dto.MailRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final MailSenderClient mailSenderClient;

    public void sendMail(MailRequest mailRequest) {
        mailSenderClient.send(mailRequest);
    }

}
