package org.example.springbootfoofighters.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.client.MailSenderClient;
import org.example.springbootfoofighters.client.dto.MailRequest;
import org.example.springbootfoofighters.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mail")
public class MailController {

    private final MailSenderClient mailSenderClient;
    private final MailService mailService;

    @PostMapping()
    private void sendMail(@RequestBody MailRequest mailRequest) {
        mailService.sendMail(mailRequest);
    }
}
