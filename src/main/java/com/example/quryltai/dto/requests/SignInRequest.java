package com.example.quryltai.dto.requests;

import lombok.Data;

@Data
public class SignInRequest {
    private String universityEmail;
    private String password;
}
