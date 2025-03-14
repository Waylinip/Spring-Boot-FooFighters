package org.example.springbootfoofighters.config;

import org.example.springbootfoofighters.client.MailSenderClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = MailSenderClient.class)
public class FeighnClientConfiguration {
}
