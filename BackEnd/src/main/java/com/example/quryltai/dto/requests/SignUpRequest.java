package com.example.quryltai.dto.requests;

import lombok.Data;

@Data
public class SignUpRequest {
    private String universityEmail;
    private Long universityId;
    private String password;
    private String verificationCode;
}

