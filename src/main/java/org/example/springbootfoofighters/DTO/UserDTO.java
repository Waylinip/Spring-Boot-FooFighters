package org.example.springbootfoofighters.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private String name;
    private int age;
    private Boolean isActive;
    private String phoneNumber;

}
