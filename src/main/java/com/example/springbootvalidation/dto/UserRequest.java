package com.example.springbootvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class UserRequest {

    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}
