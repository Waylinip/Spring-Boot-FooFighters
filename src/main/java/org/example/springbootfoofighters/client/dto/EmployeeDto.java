package org.example.springbootfoofighters.client.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class EmployeeDto {

    @NotBlank
    private Long id;
    @NonNull
    private String name;
    @NotBlank
    private String surname;

}
