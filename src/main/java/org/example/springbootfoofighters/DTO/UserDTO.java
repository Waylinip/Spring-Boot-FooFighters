package org.example.springbootfoofighters.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

@NotBlank
    private String name;

    @NotNull
    private int age;

    private Boolean isActive;
    @NotBlank
    private String phoneNumber;

}
