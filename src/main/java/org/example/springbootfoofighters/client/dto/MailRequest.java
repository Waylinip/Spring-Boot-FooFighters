package org.example.springbootfoofighters.client.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MailRequest {
    @NotBlank
    private String mailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
    @NotBlank
    private EmployeeDto employeeDto;

}
