package org.example.springbootfoofighters.client.dto;

import lombok.Data;

@Data
public class MailRequest {


    private String mailTo;


    private String subject;


    private String text;

    private EmployeeDto employeeDto;

}
