package org.example.springbootfoofighters.client;

import org.example.springbootfoofighters.client.dto.MailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "api-mail", url = "http://localhost:9090",
configuration = FeignClientProperties.FeignClientConfiguration.class)

public interface MailSenderClient {

    @PutMapping("/mail")
    void send(MailRequest mailRequest);
}
