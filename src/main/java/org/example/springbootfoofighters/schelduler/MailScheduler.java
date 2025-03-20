package org.example.springbootfoofighters.schelduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.example.springbootfoofighters.client.MailSenderClient;
import org.example.springbootfoofighters.client.dto.EmployeeDto;
import org.example.springbootfoofighters.client.dto.MailRequest;
import org.example.springbootfoofighters.service.MailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
//@RequiredArgsConstructor
//@Slf4j
//public class MailScheduler {
//
//    private final MailService mailService;
//
//    @Scheduled(fixedRate = 5000)
//    public void sendMailAllUsers() {
//        MailRequest mailRequest =MailRequest.builder()
//                .mailTo("marukovitchd@gmail.com")
//                .text("My first sheduler message")
//                .subject("My first sheduler message")
//                .employeeDto( EmployeeDto.builder()
//                        .id(2L)
//                        .name("Danik")
//                        . surname("V")
//                        .build())
//                .build();
//        mailService.sendMail(mailRequest);
//        log.info("Mail sent");
//    }
//}
